/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Clase que implementa la interfaz Runnable para representar un hilo que imprime números pares.
 * Este hilo puede ser utilizado en un entorno multihilo para realizar operaciones concurrentes.
 * @author itzel
 */
public class NumerosPares implements Runnable{
    /**
     * Método run() proporcionado por la interfaz Runnable. Contiene el código que será ejecutado
     * cuando el hilo sea iniciado. En este caso, el hilo imprimirá los números pares desde 0 hasta 500.
     */
     @Override
     public void run() {
        for (int i = 0; i <= 500; i += 2) {
        // Imprime el número par y el nombre del hilo actual
            System.out.println( i + " Es " +Thread.currentThread().getName());
            
        }
        
        // Imprime un mensaje indicando que ha terminado su ejecución.    
        System.out.println("Fin de  " + Thread.currentThread().getName() + " hasta el 500 ");
    }

}