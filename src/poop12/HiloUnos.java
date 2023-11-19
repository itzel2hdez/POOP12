/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poop12;

/**
 * Clase que implementa la interfaz Runnable para representar un hilo que imprime el número 1 repetidamente.
 * Este hilo puede ser utilizado en un entorno multihilo para realizar operaciones concurrentes.
 * @author lilian
 */
public class HiloUnos implements Runnable{
    /**
     * Método run() proporcionado por la interfaz Runnable. Contiene el código que será ejecutado
     * cuando el hilo sea iniciado. En este caso, el hilo imprimirá el número 1 seguido de un guion
     * mil veces.
     */

    @Override
    public void run() {
    // Itera mil veces para imprimir el número 1 y un guion en cada iteración
        for (int i = 0; i < 1000; i++) {
            System.out.print("1 - ");
        }
    }
    
    
}
