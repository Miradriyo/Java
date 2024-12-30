/*3. Crea un programa en Java para gestionar una lista de nombres de asignaturas utilizando un
ArrayList. El programa permitirá agregar nuevas asignaturas, mostrar la lista de asignaturas y
buscar asignaturas por su nombre. */

import java.util.ArrayList;
import java.util.Scanner;

public class tres {
   public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    ArrayList<String>asignaturas=new ArrayList<>();

   

    boolean salir=false;

        while (salir==false) {
            System.out.println("1. Introducir Asignaturas");
            System.out.println("2. Mostrar lista de asignaturas");
            System.out.println("3. Buscar asignaturas por su nombre");
            System.out.println("4. Salir");
            System.out.println("Introduzca el numero del 1 al 4 de lo que desea hacer: ");
            int respuesta=dato.nextInt();
            dato.nextLine();

        switch (respuesta) {
            case 1 :
                System.out.println("introduce la asignatura");
                String asignatura=dato.nextLine();
                asignaturas.add(asignatura);
                System.out.println();
                break;
            case 2 :
                
            System.out.println("\nLista de asignaturas:");
            for (String string : asignaturas) {
                    System.out.println(string);
            }
            System.out.println();
            break;
            
            case 3:
            System.out.println("¿Qué asignatura quieres buscar?");
            String buscar=dato.nextLine();
            
            if (asignaturas.contains(buscar)) {
                System.out.println("Si que existe esa asignatura");
                System.out.println();
            }else{
                System.out.println("no existe esa asignatura");
                System.out.println();
            }
            break;

            case 4:
            System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
            
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
        }
    }
        dato.close();
   } 
}

