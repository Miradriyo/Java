/*Diseña un programa que pide un texto por pantalla y se muestra de la siguiente manera:
Por ejemplo se teclea: Buenas tardes Lola
Debe aparecer:
Buenas
Tardes
Lol */
import java.util.*;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);

        System.out.println("introduce un texto");
        String texto=dato.nextLine();

        String[] palabras=texto.split(" ");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        dato.close();
    }
}
 