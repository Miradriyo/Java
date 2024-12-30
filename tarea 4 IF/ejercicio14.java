//Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
import java.util.*;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        
        double totalPositivos, totalNegativos, positivos=0, negativos=0;
        int contadorPositivo=0, contadorNegativo=0, contadorcero=0;
        for (int i = 0; i<=9; i++) {
            System.out.println("Introduce un numero");
            int num=dato.nextInt();
            if (num>0) {
                positivos=positivos+num;
                contadorPositivo++;
            }
            if (num<0) {
                negativos=negativos+num;
                contadorNegativo++;
            }
            if (num==0) {
                contadorcero++;
            }
        }
        dato.close();
        totalPositivos=positivos/contadorPositivo;
        totalNegativos=negativos/contadorNegativo;
         System.out.println(" La media de los numeros positivos es:" + totalPositivos );
         System.out.println(" La media de los numeros negativos es:" + totalNegativos );
         System.out.println(" Los ceros introducidos son:" + contadorcero );
    }
    
}
