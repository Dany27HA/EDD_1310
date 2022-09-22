/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntos;

/**
 *
 * @author danny
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ConjuntosADT<Integer> conjunto_1 = new ConjuntosADT();
        ConjuntosADT<Integer> conjunto_2 = new ConjuntosADT();
        
        conjunto_1.add(0);
        conjunto_1.add(1);
        conjunto_1.add(2);
        conjunto_1.add(3);
        conjunto_1.add(4);
        conjunto_2.add(3);
        conjunto_2.add(4);
        conjunto_2.add(5);
        conjunto_2.add(6);
        conjunto_2.add(7);
        
        System.out.println("conjunto 1 tamaño " + conjunto_1.length());
        System.out.println("conjunto 2 tamaño " + conjunto_2.length());
        
        System.out.println("el conjunto 1 contiene 0? " + conjunto_1.contains(0));
        System.out.println("el conjunto 1 contiene 5? " + conjunto_1.contains(5));
        
         conjunto_1.remove(0);
         
          System.out.println("conjunto 1 es igual a conjunto 2? " + conjunto_1.equals(conjunto_2));
          
          System.out.println("conjunto 1 es subconjunto del conjunto 2? " + conjunto_1.isSubset(conjunto_2));
          
          ConjuntosADT<Integer> conjunto_intersection = conjunto_1.intersection(conjunto_2);
          System.out.println("interseccion en conjunto 1 conjunto 2 " + conjunto_intersection);
          
          ConjuntosADT<Integer> conjunto_difference = conjunto_1.difference(conjunto_2);
          System.out.println("diferencia conjunto 1 conjunto 2 " + conjunto_difference);
          conjunto_1.union(conjunto_2);
          System.out.println("union conjunto 1 conjunto 2 " + conjunto_1);
    }
    
}
