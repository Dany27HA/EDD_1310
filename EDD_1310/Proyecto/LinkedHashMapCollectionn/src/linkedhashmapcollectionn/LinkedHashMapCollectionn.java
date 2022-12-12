/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashmapcollectionn;
import java.util.*;
/**
 *
 * @author danny
 */
public class LinkedHashMapCollectionn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creación del LinkedHashMap
        LinkedHashMap<Integer, String> Hashmap =  new  LinkedHashMap<Integer, String>();           
        Hashmap.put(319125854,"Diego Alameda Lopez");    
        Hashmap.put(318754523,"Jose de Jesus Aguirre Flores");    
        Hashmap.put(319129322,"Daniel Hernandez Aguirre");    
        Hashmap.put(319487546,"Anette Michael Garcia Garcia");    
        Hashmap.put(315874168,"Nancy Gutierrz Sanchez"); 
        Hashmap.put(315874258,"Yuno Lopez Martinez");    
        Hashmap.put(314528963,"Javier Garcia Martinez"); 
        
       //Se imprime el LinkedHashMap
        System.out.println(Hashmap);
       //Regresa las llaves de los elementos del HashMap
       System.out.println( "Llaves: " +Hashmap.keySet());  
       //Regresa el  valor  asignados a las llaves del HashMap
       System.out.println("Values: "+Hashmap.values());  
       //Regresa la llave y el valor asignado
       System.out.println( "llave/valor: " +Hashmap.entrySet());  
       //Preguunta si existe la llave 7777
        System.out.println(Hashmap.containsKey(315874168));
       //Existe el valor Daniel?
        System.out.println(Hashmap.containsValue("Daniel Hernandez Aguirre"));
       //Elimina elemento con llave 319129322 *Me eliminó de la vida :/*
        Hashmap.remove(319129322);  
       //Volvemos a Imprimir el LinkedHashMap
        System.out.println(Hashmap);
    }
}
