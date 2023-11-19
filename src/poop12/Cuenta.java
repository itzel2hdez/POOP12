/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Este programa simula una operación bancaria básica utilizando hilos en Java.
 * Cada hilo representa una transacción de depósito o retiro en una cuenta bancaria compartida.
 * La clase Cuenta extiende la clase Thread para permitir la ejecución concurrente de operaciones.
 */
package poop12;

/**
 * La clase Cuenta modela una cuenta bancaria con operaciones de depósito y retiro,
 * implementando la interfaz Runnable para ejecutar las transacciones en hilos separados.
 * @author lilian
 */
public class Cuenta extends Thread{
    // Saldo compartido entre todas las instancias de la clase
    private static long saldo = 0;
    /**
     * Constructor de la clase Cuenta.
     * @param nombre El nombre del hilo, que puede representar "Deposito 1", "Deposito 2", "Retiro 1" o "Retiro 2".
     */
    public Cuenta (String nombre){
        super(nombre);
    }
    /**
     * Método run() que se ejecuta cuando se inicia un hilo.
     * Realiza operaciones de depósito o retiro según el nombre del hilo.
     */
    @Override
    public void run(){
        if (getName().equals("Deposito 1")||
                getName().equals("Deposito 2")) {
            this.depositarDinero(50);
        } else{
            this.depositarDinero(50); 
        }
        System.out.println("Termina el " + getName());
    }
    /**
     * Método sincronizado para depositar dinero en la cuenta.
     * @param cantidad La cantidad de dinero a depositar.
     */
    
    public synchronized void depositarDinero(int cantidad){
       System.out.println("El saldo actual es : " + saldo);
       saldo += cantidad;
       System.out.println("Se depositaron " + cantidad + " pesos");
            notifyAll();
    }
    /**
     * Método sincronizado para extraer dinero de la cuenta.
     * @param Cantidad La cantidad de dinero a extraer.
     */
    
    public synchronized void extraerDinero(int Cantidad){
        System.out.println("El saldo actual es : " + saldo);

        try {
        // Verificar si el saldo es igual o menor que cero
            if (saldo <= 0){
        // Imprimir un mensaje indicando que el hilo espera un depósito y mostrar el saldo actual
                System.out.println(getName() + " espera deposito" + "\nSaldo = " + saldo);
        // Pausar la ejecución del hilo actual durante 5 segundos (5000 milisegundos)
                sleep(5000);
            }
            
        } catch (InterruptedException e){
        // Capturar una posible excepción de interrupción y mostrarla en la consola

            System.out.println(e);
        }
        // Restar la cantidad especificada del saldo

        saldo -= Cantidad;
        // Imprimir un mensaje indicando que se extrajo una cantidad y mostrar el saldo restante
        System.out.println(getName() + "extrajo " + Cantidad + " pesos.\nSaldo restante = " + saldo);
            // Notificar a todos los hilos que están esperando que se ha producido un cambio en el objeto
            notifyAll();
    }
    
    /**
     * Método principal que inicia varios hilos representando operaciones de depósito y retiro.
     */
    public static void main(String[] args) {
        new Cuenta("Retiro 1").start();
        new Cuenta("Retiro 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        System.out.println("Termina la hilo principal ");
        
    }
    
}