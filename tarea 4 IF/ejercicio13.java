//Pedir un número y calcular su factorial.
import java.util.*;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner dato=new Scanner (System.in);

        System.out.println("introduzca un numero");
        long num= dato.nextInt();
        long factorial=1;
        for (int i=2; i<=num; i++){
            factorial*=i;
        }

        System.out.println("El factorial de " + num   + " es " + factorial);

        dato.close();
    }
}


/*
 public class ejercicio3 {
    public static void main(String[] args) {

        //Calcular el factorial del número 15
        
        long factorial = 1;
        for (int i = 2; i <= 15; i++) {
        factorial *= i;
        }
        System.out.println("El factorial de 5 es " + factorial);

    }
}
 */