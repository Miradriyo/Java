/**Diseña el siguiente programa:
• Se pide por pantalla el número de celdas de la tabla o Array
• Si hay 10 celdas, cada celda guarda el número correspondiente a su posición.
• Imprimir el array con un bucle for
• Imprimir el array con un bucle while
• Se debe pintar la tabla, con caracteres gráficos -------, o por el contrario: |, simulando una tabla visualmente.
 */

 import java.util.*;
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);

        System.out.println("Introduce el numero de celdas del array: ");
        int celdas=dato.nextInt();
        //creamos el array con el numero de celdas que hemos recogido
        int[]array=new int[celdas];
        //Recorremos el array con for e imprimimos los datos
        for (int i = 0; i < array.length; i++) {
            array[i]=i; 
            System.out.println("En la posicion  "+i+"está el valor"+ array[i]);          
        }
        //Recorremos el array con while e imprimimos los datos
        int i=0;
        
        while (i<array.length) {

            array[i]=i;
           System.out.println("posición");
            System.out.println("En la posicion  "+i+"está el valor"+ array[i]);   
            i++;
        }

         //Añadimos la parte de pintar la tabla. Primero dibujaremos la parte superior. ____ de cada celda
         for (int j = 0; j < celdas; j++) {
            System.out.print(" _____");
         }
         System.out.println();
        //Usamos otro bucle for para imprimir el contenido del array poniendo | al inicio y un espacio por delante y por detras del contenido
        for (int j = 0; j < celdas; j++) {
            System.out.print("|");
            System.out.print("__" + array[j] + "__");
        }
        System.out.print("|");
        System.out.println();
     
        dato.close();

    }
}
     


