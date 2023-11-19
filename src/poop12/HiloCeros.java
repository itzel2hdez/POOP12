/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *Este archivo pertenece al paquete poop12, que parece estar relacionado
 * con programación orientada a objetos y posiblemente es el código fuente
 * de un programa que utiliza hilos.
 *
 * El propósito específico de este archivo es definir la clase HiloCeros,
 * la cual implementa la interfaz Runnable para permitir la ejecución en
 * paralelo de ciertas operaciones
*/
package poop12;

/**
 * La clase HiloCeros implementa la interfaz Runnable, que proporciona un
 * punto de entrada para ejecutar el código en un hilo separado. Este hilo
 * imprimirá una secuencia de ceros durante su ejecución.
 * @author lilian
 */
public class HiloCeros implements Runnable{
    /**
     * Este método run() se ejecutará cuando el hilo asociado a esta instancia
     * sea iniciado. En este caso, imprimirá la cadena "0 - " mil veces en
     * la salida estándar.
     */

    @Override
    public void run() {
     // Utilizamos un bucle for para imprimir la secuencia de ceros.
        for (int i = 0; i < 1000; i++) {
            System.out.print("0 - ");
            
        }
        

    }
    
    
}

