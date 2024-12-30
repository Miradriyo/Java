import java.util.Scanner;
public class ejercicio2 {
    /*Se pide un número por pantalla, comprobar si el número es par o impar. En el caso de que sea
par se muestra el mensaje:"El número es par", en el caso de que sea impar aparece el mensaje
"El número es impar" */

public static void main(String[] args) {

    int resto;

    System.out.println("Introduce un número");
    Scanner dato= new Scanner(System.in);
    int num= dato.nextInt();

    resto=num % 2;

    if (resto==0) {
        System.out.println("El numero introducido es par");
        } else {
        System.out.println("El nçumero introducido es impar");
    }

    dato.close();



}
}
