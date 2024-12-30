import java.util.*;
public class ejerccio4 {
    public static void main(String[] args) {
        /*Escribir un programa que pide por pantalla un número entre el 0 y 999.
        Nos aparece un mensaje, con el número de dígitos que tiene el número que introduce. 
        Si se teclea el valor cero, se acaba el juego. */
        Scanner dato= new Scanner(System.in);

        System.out.println("escribe un numero entre el 0 y 999");
        int num=dato.nextInt();

        if (num>0 || num<999) {

            int digitos=0;

            while (num>0) {
                num=num/10;
                digitos=digitos+1;
            }
            
            System.out.println("el numero tiene: " + digitos);


            
        } else {

            System.out.println("el número no es válido");
            
        }

        dato.close();
    }
}