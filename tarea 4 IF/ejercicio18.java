// Realizar un programa que muestre las tablas de multiplicar del 1 al 10 
import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        
        System.out.println("introduzca un numero del 1 al 10");
        Scanner dato=new Scanner(System.in);
        int numero=dato.nextInt();

        if (numero>1 & numero<10) {
            for (int i = 0; i < 11; i++) {
                int total=numero*i;
                System.out.println(numero+"X"+i+"="+total);
            }
        } else {
            System.out.println("numero erróneo, no está entre 1 y 10");
        }
         dato.close();
                    
        
    }
}

