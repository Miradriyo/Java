/*Muestra por pantalla palabras que sean ingresadas por teclado 
hasta que se ingrese la palabra "salir" */
package ejercicio5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String palabra = "";
        Scanner datos = new Scanner(System.in);
        do {
            System.out.println("Ingrese una palabra (o 'salir' para terminar): ");
            palabra = datos.nextLine();
            System.out.println(palabra);
        } while (!palabra.equals("salir"));
        System.out.println("Programa terminado.");
        datos.close();
    }
}