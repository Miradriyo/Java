/*Crea un programa en Java para gestionar una lista de números utilizando tanto un ArrayList
como un array convencional. El programa permitirá realizar operaciones básicas como agregar
números, calcular la suma y encontrar el número más grande en ambas estructuras. */


import java.util.ArrayList;
import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        ArrayList<Integer>listadonumeros=new ArrayList<>();
        int[] numerosarray= new int[5];

        //pedir numeros en un Array
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca el numero");
            numerosarray[i]=dato.nextInt();
        }

       
        //pedir numeros en un Arraylist
        for (int i = 0; i < 5; i++) {
            System.out.println("introduzca el numero");
            int numero=dato.nextInt();
            listadonumeros.add(numero);
        }

        // Imprimir los números almacenados en el Array
        System.out.println("\nNúmeros ingresados en el Array:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numerosarray[i]);
        }

        // Imprimir los números almacenados en Arraylist
        System.out.println("\nNúmeros ingresados en el Arraylist:");
        for (int i = 0; i < 5; i++) {
            System.out.println(listadonumeros.get(i));
        }
        
        //suma en el array
        int sumarray=0;
        for (int i = 0; i < numerosarray.length; i++) {
            sumarray=numerosarray[i]+sumarray;
        }

        //suma en el arraylist
        int suma=0;
        for (int i : numerosarray) {
            suma=i+suma;
        }

        //encontrar el número más grande en Array

        int masgrande=numerosarray[0];
        for (int i = 0; i < numerosarray.length; i++) {
            if (numerosarray[i]>masgrande) {
                masgrande=numerosarray[i];
            }
        }

        //encontrar el número más grande en Arraylist
        int mayor=listadonumeros.get(0);
        for (int num : numerosarray) {
            if (num<mayor) {
                mayor=num;
            }
        }

        dato.close();

    }
}
