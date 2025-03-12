package ejercicio6;

import java.util.Scanner;

/*Para la realización de una maratón se solicitan DNI, nombre y edad. Las categorías de inscripción
son:
 * Menores A(de6 a 10 años)
 * Menores B(de 11 a 17 años)
 * Juveniles(de 18 a 30 años)
 * Adultos (de 31 a 50 años)
 * Veteranos (mayores de 50) 
Se necesita un programa que a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla
a qué categoría debe ser inscrito. Cabe destacar que para finalizar las inscripciones se debe ingresar
un dni con valor 0 y nombre con palabra fin
 */
public class Main {
    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        int dni;
        String nombre="";
        int edad=-1;
        String categoria;
        do {
            System.out.println("Ingrese el nombre del participante:");
            nombre= dato.nextLine();
            System.out.println("Ingrese el dni del participante:");
            dni= dato.nextInt();
            System.out.println("Ingrese la edad del participante:");
            edad= dato.nextInt();
            if (edad>=6 && edad<=10) {
                categoria="Menores A";
                System.out.println("El participante " + nombre + " con DNI " + dni + " pertenece a la categoría: " + categoria);
            } else if (edad>=11 && edad<=17) {
                categoria="Menores B";
                System.out.println("El participante " + nombre + " con DNI " + dni + " pertenece a la categoría: " + categoria);
            } else if (edad>=18 && edad<=30) {
                categoria="Juveniles";
                System.out.println("El participante " + nombre + " con DNI " + dni + " pertenece a la categoría: " + categoria);
            } else if (edad>=31 && edad<=50) {
                categoria="Adultos";
                System.out.println("El participante " + nombre + " con DNI " + dni + " pertenece a la categoría: " + categoria);
            } else if (edad>50) {
                categoria="Veteranos";
                System.out.println("El participante " + nombre + " con DNI " + dni + " pertenece a la categoría: " + categoria);
            } else {
                categoria="No corresponde a ninguna categoría";
                System.out.println("El participante " + nombre + " con DNI " + dni + " pertenece a la categoría: " + categoria);
            }
            dato.nextLine(); 
            
        } while (edad!=0 || !nombre.equals("fin"));
        dato.close();
    }
}