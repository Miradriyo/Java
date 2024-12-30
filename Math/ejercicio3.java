/* Diseñar un programa que pide dos números por pantalla, y se deben generar los números aleatorios entre ellos. */

import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner dato= new Scanner(System.in);
        System.out.println("Introduzca el numero 1");
        int n1=dato.nextInt();
        System.out.println("Introduzca el numero 2");
        int n2=dato.nextInt();
        System.out.println("Introduzca el número de números aleatorios");
        int nAleatorio=dato.nextInt();

        Random aleatorio=new Random();
        
        for (int i = 0; i < nAleatorio; i++) {
            int numeroAleatorio=aleatorio.nextInt(n1, n2);       
            System.out.println(numeroAleatorio);
            
        }

        dato.close();

        
    }
}
