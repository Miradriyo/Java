/*Realizar un programa donde se almacenan los nombres de diferentes animales. Se piden nombres por pantalla hastaque se introduce la palabra salir
Se deben visualizar todos los valores introducidos y el número de valores que se introducen */
import java.util.*;
public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner dato=new Scanner(System.in);
        ArrayList<String>animales=new ArrayList<>();
        String nombre="";

        while (!nombre.equals("salir")) {
        System.out.println("Introduzca un nombre o salir para finalizar");
            nombre=dato.nextLine();
            nombre=nombre.toLowerCase();
            animales.add(nombre);
        } 

        for (int i = 0; i < animales.size()-1; i++) {
            System.out.println(animales.get(i));
        }
            System.out.println("Se han introducido "+ animales.size()+ "  valores");
        dato.close();
    }
    }

