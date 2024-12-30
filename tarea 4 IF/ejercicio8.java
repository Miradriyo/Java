import java.util.*;
/*Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir 
pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
El proceso termina cuando el usuario acierta*/
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);

        int n=6;
        int num;
        do {
            System.out.println("Introduzca un numero");
            num=dato.nextInt();

            if (num==6) {
                System.out.println("Has acertado");
            }
            if (num!=6) {

                if (num<6) {

                    System.out.println("el numero es mayor");
                }else{
                    System.err.println("el numero es menor");
                }

                
            }
        } while (num!=n);

        dato.close();
    }
}
