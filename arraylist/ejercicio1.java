/*1. Diseña un programa en Java que crea un arraylist, que contiene los nombres de 4
personas. Mostrar los datos del array al completo. */

import java.util.*;

public class ejercicio1 {

    public static void main(String[] args) {
        //creamos Arraylist y Scanner
        ArrayList<String>nombres=new ArrayList<>();
        Scanner dato=new Scanner(System.in);

        //pedimos los datos y los agregamos al Arraylist
        for (int i = 0; i < 4; i++) {

            System.out.println("Introduzca el nombre");
            String nombre=dato.nextLine();
            nombres.add(nombre);
        }

        //Mostramos los datos del Arraylist

        for (String i : nombres) {
            System.out.println(i);
        }
        dato.close();
    }
}