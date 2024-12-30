//Pedir un número N, y mostrar todos los números del 1 al N.
import java.util.*;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num=dato.nextInt();

        
        do {
            System.out.println(num);
            num--;
        } while (num > 0);

        dato.close();
    }
}
