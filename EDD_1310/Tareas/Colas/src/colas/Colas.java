/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

import colas.ClaseQueue;
import colas.ClaseQueue;

/**
 *
 * @author danny
 */
public class Colas {

    /**
     */

    public static void main(String[] args) throws Exception {
        ClaseQueue<Integer> ClaseColaQueue = new ClaseQueue<>();
        System.out.println("isEmpty: " + ClaseColaQueue.isEmpty()); //Pregunta si esta vacio TRUE
        ClaseColaQueue.enqueue(27); //ingresa un elemento al final
        ClaseColaQueue.enqueue(28); //ingresa un elemento al final
        ClaseColaQueue.enqueue(29); //ingresa un elemento al final
        ClaseColaQueue.enqueue(30); //ingresa un elemento al final
        ClaseColaQueue.enqueue(77); //ingresa un elemento al final

        System.out.println(ClaseColaQueue); //Muestra la Cola completa
        System.out.println("length: " + ClaseColaQueue.length()); //Numero de elementos en la cola
        System.out.println("isEmpty: " + ClaseColaQueue.isEmpty()); //Vuelve a preguntar si esta vacia False
        System.out.println("dequeue: " + ClaseColaQueue.dequeue()); // Quita el último elemento
        System.out.println("dequeue: " + ClaseColaQueue.dequeue()); // Quita el último elemento
        System.out.println(ClaseColaQueue); //Muestra la Cola completa
    }
    
}
