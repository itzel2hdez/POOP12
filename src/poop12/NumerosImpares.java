/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *  Clase que implementa la interfaz Runnable para imprimir números impares en un hilo.
 * Esta clase imprime números impares desde 1 hasta 500 y muestra el nombre del hilo actual.
 * La impresión incluye el número impar y el nombre del hilo que está ejecutando la operación.
 * Al finalizar, muestra un mensaje indicando el término del hilo.
 * @author itzel
 */
public class NumerosImpares implements Runnable{
    /**
     * Método run() que se ejecuta cuando se inicia el hilo.
     * Imprime números impares desde 1 hasta 500 y muestra el nombre del hilo actual.
     */
    
    @Override
    public void run(){
        for (int i = 1; i <=500; i+=2) {
        System.out.println( i + " Es " +Thread.currentThread().getName());
        
        }
        System.out.println("Fin de  " + Thread.currentThread().getName() + " hasta el 500 ");
    }  
}
