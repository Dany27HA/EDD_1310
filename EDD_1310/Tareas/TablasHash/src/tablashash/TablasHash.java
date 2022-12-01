/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablashash;

/**
 *
 * @author danny
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        ClaseTablaHash<String, String> hashTable = new ClaseTablaHash<>(4);
        hashTable.add("1582548", "Daniel Hernandez, 18 años");
        hashTable.add("1589835", "Raul Manzno. 19 años");
        hashTable.add("1589635", "Diego Rodriguez,20 años");
        hashTable.add("1589752", "Fernando Castillo, 18 años");
        hashTable.add("1586625", "Mario Cendalla. 19 años");
        hashTable.add("1587632", "Andres Gil,20 años");
        hashTable.add("1582759", "Adrian Palomares, 18 años");

        System.out.println(hashTable.valueOf("1582548"));
        System.out.println(hashTable.valueOf("1589835"));
        System.out.println(hashTable.valueOf("1589635"));
        System.out.println(hashTable.valueOf("1589752"));
        System.out.println(hashTable.valueOf("1586625"));
        System.out.println(hashTable.valueOf("1587632"));
        System.out.println(hashTable.valueOf("1582759"));


        hashTable.remove("1587632");
        System.out.println(hashTable.valueOf("1587632"));

        hashTable.add("15825896", "Alberto Flores, 19 años");
        System.out.println(hashTable.valueOf("15825896"));
    }
}
    

