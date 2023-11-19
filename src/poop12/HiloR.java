/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *Este archivo pertenece al paquete "poop12" y contiene la implementación de la interfaz Runnable
 * para la creación de un hilo de ejecución en Java.
 */
package poop12;

/**
 * La clase HiloR implementa la interfaz Runnable, lo que permite que las instancias de esta
 * clase sean ejecutadas como hilos.
 * @author lilian
 */
public class HiloR implements Runnable{
     /**
     * El método run() es parte de la interfaz Runnable y se ejecutará cuando se inicie
     * el hilo. En este caso, realiza un bucle for que imprime información sobre la iteración
     * actual y el nombre del hilo en el que se está ejecutando.
     */

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i + " del " +Thread.currentThread().getName());
            
        }
        
        // Imprime un mensaje indicando que el hilo ha terminado su ejecución.    
        System.out.println("Termina el " + Thread.currentThread().getName() );
    }
    
}