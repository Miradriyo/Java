/*Dado por teclado un límite numérico por teclado (por ejemplo 100)muestra en pantalla 
todos los números hasta ese límite (empezando por 1) */
package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Intriduzca un número límite:");
        Scanner dato = new Scanner(System.in);
        int numerolimite = dato.nextInt();
        for (int i = 0; i < numerolimite+1; i++) {
            System.out.println(i);
        }
        dato.close();
    }
}