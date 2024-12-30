import java.util.*;
//Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduzca un numero");
            num=dato.nextInt();
           if ( num%2==0) {

            System.out.println("el numero es par");
            
           } else {
            System.out.println("el numero es impar");
           }
        } while (num!=0);

        dato.close();
    }
}
