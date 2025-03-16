package ejercicio7;

import java.util.Scanner;

/*Un programa que permite cargar 15 números en un vector. Una vez cargados se necesita 
que el programa cuente e informe por pantalla cuantas veces se cargó el numero3 */
public class Main {
    public static void main(String[] args) {
        int vector[]= new int[15];
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce 15 números:");
        // Cargar el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un número para la posición " + (i + 1) + ":");
            vector[i] = dato.nextInt();
    }
       // Recorrer vector y contar veces que sale el 3
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3) {
                contador++;
            }
        }
        System.out.println("El número 3 se cargó " + contador + " veces.");
        dato.close();
}}