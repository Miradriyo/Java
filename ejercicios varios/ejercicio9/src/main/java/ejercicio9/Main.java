package ejercicio9;

import java.util.Scanner;

/* Crea un programa que incluya un array que almacena 8  nombres Recorre el array para cargar los datos 
y otro para mostrarlos.
*/
public class Main {
    public static void main(String[] args) {
        String[] nombres = new String[8];
        Scanner dato= new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nombre:  ");
            nombres[i] = dato.nextLine();
        }
        //Recorrer el array
        System.out.println("Los nombres son: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
      dato.close();
    }
}