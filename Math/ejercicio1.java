/*1.Se pide por pantalla el radio de un circulo, se calcula su área. Mostrar el resultado aplicando
una función para redondear el valor A=PIr^2*/

import java.util.Scanner;
import java.lang.Math;
public class ejercicio1 {

    public static void main(String[] args) {
        
        
        System.out.println("Introduce por pantalla el radio del circulo");
        Scanner dato=new Scanner(System.in);
        double r=dato.nextDouble();
        double area=Math.PI*Math.pow(r,2);
        double redondearcercano=Math.round(area);
        double redondeararriba=Math.ceil(area);
        double redondearabajo=Math.floor(area);

        
        System.out.println("el área del círculo es: "+area);
        System.out.println("el área del círculo redondeado cercano: "+redondearcercano);
        System.out.println("el área del círculo dedondeado arriba: "+redondeararriba);
        System.out.println("el área del círculo redondeado abajo: "+redondearabajo);
        dato.close();

    }
}

/*Math.round(x): Este método devuelve el entero más cercano al número x. Si x está exactamente entre dos enteros, se redondea al entero par más cercano 
EJ: El número 2.5 redondeado es: 3

Math.ceil(x): Redondear hacia arriba. Este método devuelve el entero más pequeño que es mayor o igual que x.
EJ: El número 2.1 redondeado hacia arriba es: 3

Math.floor(x): Redondear hacia abajo. Este método devuelve el entero más grande que es menor o igual que x.
EJ: El número 2.9 redondeado hacia abajo es: 2
 */