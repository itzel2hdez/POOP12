/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *Este programa pertenece al paquete 'poop12'.
 * Proporciona la definición de la clase 'HiloT', que extiende la clase Thread de Java para implementar hilos.
 */
package poop12;

/**
 * La clase HiloT representa un hilo en Java y extiende la clase Thread.
 * Cada instancia de esta clase ejecuta un bucle simple que imprime mensajes indicando la iteración actual y el nombre del hilo.
 * Además, muestra un mensaje al finalizar la ejecución del hilo.
 * @author lilian
 */
public class HiloT extends Thread{
    /**
     * Constructor de la clase HiloT.
     * 
     * @param name El nombre que se asignará al hilo al ser creado.
     */

    public HiloT(String name) {
        super(name);
    }
    /**
     * Método run, que se ejecuta cuando se inicia el hilo.
     * Realiza un bucle simple que imprime mensajes indicando la iteración actual y el nombre del hilo.
     * Al finalizar el bucle, muestra un mensaje indicando que ha terminado la ejecución del hilo.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " +i+ " de " + getName());
        
        }
        System.out.println("Termina el " +getName()); 
    }
}