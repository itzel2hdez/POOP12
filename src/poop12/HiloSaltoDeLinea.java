/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Este archivo pertenece al paquete poop12 y define la clase HiloSaltoDeLinea.
 * Implementa la interfaz Runnable para permitir la ejecución de esta clase en un hilo.
 */
package poop12;

/**
 * La clase HiloSaltoDeLinea representa un hilo que imprime saltos de línea en la consola.
 * Esta clase es utilizada para propósitos demostrativos en concurrencia.
 * Implementa la interfaz Runnable para definir la lógica de ejecución del hilo.
 * @author lilian
 */
public class HiloSaltoDeLinea implements Runnable{
     /**
     * Método run() que se ejecuta cuando se inicia el hilo.
     * Imprime 1000 saltos de línea en la consola.
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
             System.out.println("");
        }
    }
    
    
    
}