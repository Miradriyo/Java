/*Codifique un programa que permita cargar una oración por teclado, después mostrar cada palabra ingresada en una línea distinta.
Por ejemplo si cargamos:
La mañana está fría.
Debe aparecer:
La
mañana
está
fría. */

import java.util.*;

public class ejercicio1 {
public static void main(String[] args) {
    Scanner datos=new Scanner(System.in);
    System.out.println("Introduzca una oración");
    String sentence=datos.nextLine();
    int ultimoespacio=0;

    for (int i = 0; i < sentence.length(); i++) {
       
       int espacio=sentence.indexOf(" ", i);

       if(espacio != -1){
        String palabra=sentence.substring(ultimoespacio, espacio+1);
        System.out.println(palabra);
        ultimoespacio=espacio+1;
        i=espacio;
    }else{
        String palabra=sentence.substring(ultimoespacio);
        System.out.println(palabra);
        break;
    }
    
    datos.close();

}
    
}
}

