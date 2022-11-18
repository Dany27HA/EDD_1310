/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

/**
 *
 * @author danny
 */
public class PILAS {

   public static void main(String[] args) throws Exception {
       
        StackNodo<Integer> nodeStack = new StackNodo<>();
        System.out.println("Stack using nodes");
        System.out.println("isEmpty(): " + nodeStack.isEmpty());// Pregunta si esta vacip?
        System.out.println("length(): " + nodeStack.length()); //longitud de pila antes de agregar datos
        nodeStack.push(8); //Agregamos elemento al tope
        nodeStack.push(8); //Agregamos elemento al tope
        nodeStack.push(22); //Agregamos elemento al tope
        nodeStack.push(27); //Agregamos elemento al tope
        nodeStack.push(72); //Agregamos elemento al tope
        System.out.println(nodeStack); // imprimimos todo la pila (72,27,22,8,8)
        System.out.println("length(): " + nodeStack.length()); //longitud de pila despues de agregar datos
        System.out.println("peek(): " + nodeStack.peek()); // Consultar elemento en tope sin sacarlo 72
        System.out.println("pop(): " + nodeStack.pop()); // Saca elemento de tope 72
        System.out.println("peek(): " + nodeStack.peek()); // Consultar elemento en tope sin sacarlo, ahora el 27
        System.out.println(nodeStack); //volvemos a imprimir la pila sin el elemento que quitamos en peek (27,22,8,8)
        
    }
    
}
