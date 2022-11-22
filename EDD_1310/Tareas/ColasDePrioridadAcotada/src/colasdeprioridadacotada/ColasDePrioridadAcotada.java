/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasdeprioridadacotada;

/**
 *
 * @author danny
 */
public class ColasDePrioridadAcotada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ColaPrioridad<String> queue = new ColaPrioridad<String>(6);
             
        System.out.println("Orden en que murieron los animales en la pelicula la vida de pi");
        queue.enqueue(1, "Hiena");
        queue.enqueue(5, "Pi se salvó");
        queue.enqueue(1, "Zebra");
        queue.enqueue(2, "Mono mandarin");
        queue.enqueue(0, "Rata");
        queue.enqueue(3, "peces");
        queue.enqueue(4, "Richard Parker(Tigre de vengala) se salvó");
        queue.enqueue(0, "Pasajeros");
        System.out.println(queue);
    }
}
    
    

