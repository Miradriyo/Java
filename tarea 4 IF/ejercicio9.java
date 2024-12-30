//Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
import java.util.*;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);

        int num;
        int num2=0;
        int total=0;
        do {

            System.out.println("introduzca un numero");
            num=dato.nextInt();
            total=num+num2;
            num2=total;
        } while (num!=0);

        System.out.println("total es: " + total);

        dato.close();
    }
}
