/*Diseña la siguiente ecuación x=-b+- raíz cuadrada de b^2-4ac/2a */
import java.util.*;
import java.lang.Math;
public class ejercicio4 {
public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    System.out.println("introduce el valor a");
    int a=dato.nextInt();
    System.out.println("introduce el valor b");
    int b=dato.nextInt();
    System.out.println("introduce el valor c");
    int c=dato.nextInt();

    if(Math.pow(b,2)-(4*a*c) >=0){
        double x1=-b+Math.sqrt(Math.pow(b, 2)-(4*a*c))/(2*a);

        double x2=-b-Math.sqrt(Math.pow(b, 2)-(4*a*c))/(2*a);

        System.out.println(x1);
        System.out.println(x2);

    }else{
        System.out.println("Error. La solucion no pertenece al conjunto de los numeros Reales");
    }


    dato.close();
}    
}
