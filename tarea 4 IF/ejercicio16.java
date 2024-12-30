//Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
import java.util.Scanner;

public class ejercicio16 {
public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);

    int total=0;

    System.out.println(" Introduce un número entre el 0 y 10");
    int num = dato.nextInt();


    if (num<11 && num>0) {

        for (int i = 0; i < 11; i++) {
            total=num*i;
            System.out.println(num+"X"+i+"="+total);
        }
    }else{
        System.out.println("El número es incorrecto");
    }
    dato.close();
}
    
}
