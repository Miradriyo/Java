//Pedir un número e indicar si es positivo o negativo
import java.util.*;
public class ejercicio1 {
 public static void main(String[] args) {
int num;
Scanner dato=new Scanner(System.in);
    do {
        System.out.println("Introduzca un numero: ");
        num=dato.nextInt();

        if (num>0) {
            System.out.println("El numero: " + num + " es positivo");
        } else {
            System.out.println( "el número " + num + "es negativo");
        }
    
    } while (num!=0); 
    dato.close();
    
 }

}