/*Programa Java que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c), según la siguiente fórmula:
 Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) 
 donde 
 p = (a+b+c)/2 
 Para calcular la raíz cuadrada se utiliza el método Math.sqrt() */
import java.lang.Math;
import java.util.Scanner;
 public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("escribe la longitud a del triángulo");
        Scanner dato= new Scanner(System.in);
        double datoA=dato.nextDouble();
        System.out.println("escribe la longitud b del triángulo");
        double datoB=dato.nextDouble();
        System.out.println("escribe la longitud c del triángulo");
        double datoC=dato.nextDouble();

        double p=(datoA+datoB+datoC)/2;

        double Area=Math.sqrt(p*(p-datoA)*(p-datoB)*(p-datoC));

        System.out.println(Area);

        dato.close();
    }
}
