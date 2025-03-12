package com.mycompany.ejercicio;
import java.util.Scanner;
public class Ejercicio {

    public static void main(String[] args) {
        System.out.println("Introduzca el nombre");
        Scanner datos=new Scanner(System.in);
        String nombre = datos.nextLine();
        
        System.out.println("Introduzca los apellidos");
        String apellidos = datos.nextLine();
        
        System.out.println("Buenos días  "  + nombre  + apellidos );
        
        datos.close();
    }
}
