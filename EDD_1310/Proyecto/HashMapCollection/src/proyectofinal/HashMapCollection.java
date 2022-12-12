/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;
import java.util.*;

/**
 *
 * @author danny
 */
public class HashMapCollection {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        //Creamos el HashMap
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        
        //Agregamos elementos
        map.put(1,"Elden Ring"); 
        map.put(2,"God of War");    
        map.put(3,"Horizon Zero Dawn");   
        map.put(4,"A Pague Tale");   
        map.put(5,"Xenoblade Chronicles 3");   
        map.put(6,"Stray");   
        
        //Se imprime el HashMap
        System.out.println(map);
        //Se elimina el elemento numero 5
        map.remove(5);
        System.out.println(map);
        //Se re´plaza el elemento 6 Stray por The Last Of Us
        map.replace(1, "The Last Of Us");
        System.out.println(map);
        //Pregunta si hay un valor en el elemento 7
        System.out.println(map.containsKey(7));
        //Pregunta si existe el valor Halo Infinite en algún elemento :C triste
        System.out.println(map.containsValue("Halo Infinite"));
        //Se reemplaza todos los elementos a un solo valor
        map.replaceAll((k,v) -> "Ganador Del Goty Elden Ring");  
       //Se vuelve a imprimir el HashMap
        System.out.println(map);      
    }   
}