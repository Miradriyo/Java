/*Diseña un programa para utilizar el objeto String. Se pide por pantalla una dirección
de correo electrónico, se debe comprobar:
• Que contiene la @
• Que no se teclea más de 1 @
• Que aparece un punto, al final del correo electrónico.
• Que la longitud mínima sea de 20 caracteres.
• Que los textos aparecen en minúsculas. */
import java.util.*;
public class ejercicio1 {
public static void main(String[] args) {
    Scanner datos=new Scanner(System.in);
    
    int punto;
    int caracter;
    int ultimo;
    int longitud;   
    String minusculas; 
    boolean soloMinusculas;

    //se pide email
    System.out.println("Introduce un email: ");
    String email=datos.nextLine();
//Que contiene la @
    caracter=email.indexOf('@');
        if (caracter==-1) {
           System.out.println("email incorrecto. No contiene un @");
        }
//Que no se teclea más de 1 @
    ultimo=email.lastIndexOf('@');
        if (caracter!=ultimo) {

            System.out.println("email incorrecto. Tiene que tener un solo @");
            
        }
//que contiene un punto después del @    
punto=email.indexOf('.');
if (caracter>punto || punto==-1) {
    System.out.println("email incorrecto. Falta el punto después del @");
}
//Que la longitud mínima sea de 20 caracteres.
longitud=email.length();
if (longitud<0 || longitud>20) {
    System.out.println("email incorrecto. El email tiene que tener entre 1 y 20 caracteres");
}
//Que los textos aparecen en minúsculas.
minusculas=email.toLowerCase();
soloMinusculas=email.equals(minusculas);
 if (soloMinusculas==false) {
    System.out.println("El email tiene que estar en minúsculas");
 }
    datos.close();
}
}


