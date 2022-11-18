/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilasextra;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author danny
 */
public class PilasExtra {
    public static void main(String[] args) {
        String archivo1 = "texto1.txt";
        String Contenido1 = LecturaArchivo(archivo1);
        boolean BalanceoDeArchivo1 = Parentesis(Contenido1);
        System.out.println("Archivo " + archivo1 +  " - Balanceo: " + BalanceoDeArchivo1);

        String Archivo2 = "texto2.txt";
        String Contenido2 = LecturaArchivo(Archivo2);
        boolean BalanceoDeArchivo2 = Parentesis(Contenido2);
        System.out.println("Archivo " + Archivo2 + " - Balanceo: " + BalanceoDeArchivo1);
    }
    public static boolean Parentesis(String Validador) {
        StackNodo<Character> validadorStack = new StackNodo<>();

        for (int i = 0; i < Validador.length(); i++) {
            char currentChar = Validador.charAt(i);
            switch (currentChar) {
                case '(':
                case '[':
                case '{':
                    validadorStack.push(currentChar);
                    break;

                case ')':
                case ']':
                case '}':
                    if (validadorStack.isEmpty())
                        return false;
                    else {
                        char charInStack = validadorStack.pop();
                        if (currentChar == ')' && charInStack != '(')
                            return false;
                        else if (currentChar == ']' && charInStack != '[')
                            return false;
                        else if (currentChar == '}' && charInStack != '{')
                            return false;
                    }
                    break;

                default:
                    break;
            }
        }

        return validadorStack.isEmpty();
    }

    public static String LecturaArchivo(String fileName) {
        String line, fileContent = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((line = bufferedReader.readLine()) != null) {
                    fileContent += line;
                }
            }
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo, parentesis desbalanciados");
        }
        return fileContent;
    }
}
    
