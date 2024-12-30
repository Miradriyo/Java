
/*1.Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde
en un ArrayList de tipo Integer. La lectura de números enteros termina cuando se introduzca el
valor -99. Este valor no se guarda en el ArrayList.
A continuación el programa mostrará por pantalla el número de valores que se han leído, su
suma y su media. Por último se mostrarán todos los valores leídos, indicando cuántos de ellos
son mayores que la media.*/

import java.util.ArrayList;
import java.util.Scanner;

public class uno {
public static void main(String[] args) {

    Scanner dato=new Scanner(System.in);
    ArrayList<Integer>numeros=new ArrayList<>();

    System.out.println("Introduzca valores. Si quiere salir ingrese -99");
    while (true) {
        int num=dato.nextInt();
        if (num ==-99) {
            break;
        }else{
            numeros.add(num);
        }
    }
   System.out.println("En total se han mostrado: "+numeros.size());   
   double suma=0; 
   for (Integer i : numeros) {
    suma=suma+i;
   }

double media=suma/numeros.size();

   System.out.println("La suma de los numeros introducidos es:  "+suma+ "  y la media es: "+ media);

   int superiormedia=0;
   ArrayList<Integer>listamayorquemedia=new ArrayList<>();
   for (Integer integer : numeros) {
    System.out.println(integer);
    if (integer>media) {
        superiormedia++;
        listamayorquemedia.add(integer);
        System.out.println("el valor total de numeros superiores a la media es: "+ superiormedia);
        System.out.println("Los valores que son superiores a la media son: "+listamayorquemedia);
    }
   }
    dato.close();
   }
    
}

