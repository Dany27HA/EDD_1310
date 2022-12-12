/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treemapcollection;
import java.util.*;
/**
 *
 * @author danny
 */
public class TreeMapCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el TreeMap
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
        
        //Agregamos elementos
        map.put(1,"Dany");    
        map.put(2,"Anette");    
        map.put(3,"Chili");    
        map.put(4,"Jose Antonio");    
        map.put(5,"Nancy");   
        map.put(6,"Dania");    
        map.put(7,"Dafne");    
        map.put(8,"Dario");    
        map.put(9,"Dante");    
        map.put(10,"Mario");    
        
        //Se imprime el TreeMap
        System.out.println(map); 
        //Se regresa los elementos con llave menor o igual a 1
        System.out.println("El ganador de la carrera es: "+map.headMap(1,true)); 
        //Se regresa los elementos con llave menor o igual a 3
        System.out.println("El top 3 es: "+map.headMap(3,true)); 
        //Se regresa los elementos con llave mayor o igual a 7
        System.out.println("Los ultimos en llegar son: "+map.tailMap(7,true));  
        //Elminamos elemento con llave 1
        map.remove(10);
        //Se vuelve a imprimir el TreeMap
        System.out.println(map);
        
    }
    
}