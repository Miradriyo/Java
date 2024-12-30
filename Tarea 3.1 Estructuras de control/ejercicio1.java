import java.util.Scanner;
public class ejercicio1 {

    public static void main(String[] args) {
        /* Se pide por pantalla 2 numeros y debe mostrar los siguientes mensajes:
        "El numero: ...  es mayor que el numero ..."
        " El numero: ... es menor que el numero ..." */

        System.out.println("Introduce un numero");
        Scanner dato= new Scanner(System.in);
        double num1= dato.nextDouble();
        System.out.println("Introduce un numero");
        double num2= dato.nextDouble();

        if (num1<num2) {
            System.out.println("El numero: " + num1 + "es menor que el numero " + num2);
        } else {
            System.out.println("El numero: " + num1 + "es mayor que el numero " + num2);
        }

        dato.close();
    }
}