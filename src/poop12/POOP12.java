/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
 * Este es un programa de ejemplo que ilustra el uso de hilos en Java.
 * Se crean varios hilos de diferentes maneras para demostrar la multitarea.
 */
package poop12;

/**
 *
 * La clase principal que contiene el método main para ejecutar el programa.
 * @author itzel
 */
public class POOP12 {
    /**
     * El punto de entrada principal para la aplicación.
     *
     * @param args Los argumentos de la línea de comandos.
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        // Se crea e inicia el primer hilo utilizando la clase HiloT.
         /**
        HiloT hilo1 = new HiloT("Primer Hilo");
        hilo1.start();
        
        // Se crea e inicia el segundo hilo directamente en una línea.
        new HiloT("Segundo Hilo").start();
        
        // Se crea e inicia el tercer hilo utilizando la interfaz Runnable y un constructor diferente.
        new Thread(new HiloR(), "Tercer Hilo").start();
        
        // Un bucle simple que imprime mensajes desde el hilo principal.        
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i +  " del main");
            
        }
        
        // Mensaje que indica la finalización del método main.        
        System.out.println("Termina el Main ");
        
    
        System.out.println("-----------------------\n ");
        
        // Se crean e inician tres hilos que imprimen ceros, unos y saltos de línea respectivamente.  
        new Thread(new HiloCeros(), "Hilos Ceros").start();
        new Thread(new HiloUnos(), "Hilos Unos").start();
        new Thread(new HiloSaltoDeLinea(), "Hilos Salto De Linea").start();
       
        System.out.println("-----------------------\n ");
        // Se crea e inicia un hilo de cuenta. 
        Cuenta cuenta = new Cuenta("Cuenta");
        cuenta.start();
        
        System.out.println("-----------------------\n ");
        // Crear e iniciar un hilo para imprimir números pares
        new Thread(new NumerosPares(), " numero par").start();
        */
        
        System.out.println("-----------------------\n ");
        // Crear e iniciar un hilo para imprimir números impares
        Thread hiloImpares = new Thread(new NumerosImpares(), "Numero Impar ");
        hiloImpares.start();
    }   
}