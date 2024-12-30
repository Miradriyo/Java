/*Programa que tome como dato de entrada un número que corresponde a la longitud del radio
una esfera y nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.
La fórmula para calcular el volumen de la esfera es
v = (4/3)*PI*r^3
 */
import java.util.*;
import java.lang.Math;

public class ejercicio1 {

    public static void main(String[] args) {
        double v;
        System.out.println("introduzca la longitud del radio de la esfera");
        Scanner dato=new Scanner(System.in);
        double r=dato.nextDouble();
       
        v = (4.0/3.0)*Math.PI* Math.pow(r, 3);
        System.out.println(v);
        dato.close();
    }
}