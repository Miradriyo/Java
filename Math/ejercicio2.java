/*Diseñar un código que pide por pantalla cuantos números aleatorios se desean calcular. Se 
deben generar estos números y mostrar los valores por pantalla */

import java.util.*;

public class ejercicio2 {
    public static void main(String[] args) {
        
        System.out.println("Introduce cuantos números aleatorios quieres calcular");
        Scanner dato=new Scanner(System.in);
        int n=dato.nextInt();
        Random aleatorio=new Random();

        for (int i = 0; i <n; i++) {
            //generar numero aleatorio
            int nAleatorio=aleatorio.nextInt(); 
            System.out.println(nAleatorio);
            
        }



        dato.close();
    }
}
