//Pedir números hasta que se introduzca uno negativo, y calcular la media de los números positivos.
// El 0 se considera número positivo
import java.util.*;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        int num, num2=0;
        int contador=0;
        double media=0;
        do {
            
            System.out.println("introduzca un numero:");
            num=dato.nextInt();

            if (num>0) {
                num2=num+num2;
                contador++;
            }
        } while (num>0);

        media=num2/contador;
        System.out.println(" la media es: "+media);

        dato.close();
    }
}
