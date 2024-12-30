//Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
import java.util.*;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        int num;

        do {
            
            System.out.println("Introduzca un numero:");
            num=dato.nextInt();

            if (num<0) {
            
                System.out.println("El numero es negativo");
            } 
            
            if (num>0) {
                
                System.out.println("El número es positivo");
            } 
            
            if (num==0){

                System.out.println("fin del programa");
                
            }

        } while (num!=0);
         dato.close();
    }
}
