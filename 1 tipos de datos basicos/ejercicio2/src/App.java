import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Escribe un programa que convierta grados Celsius a Fahrenheit. 
El usuario debe ingresar la temperatura 
en Celsius como un float, y el programa debe mostrar el resultado 
en Fahrenheit utilizando el tipo double. La fórmula para la conversión es F = C * 9/5 + 32. */
        Scanner dato= new Scanner(System.in);
        System.out.println("Introduzca la temperatura en Celsius");
        float celsius=dato.nextFloat();

        double Fahrenheit=celsius*9/5+32;
        System.out.println(celsius +" celsius son : "+ Fahrenheit + " Farenheit");

        dato.close();

    }
}
