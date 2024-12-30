/*Haz un programa que pida un número al usuario un número de día de la semana (del 1 al 7) 
y escriba el nombre de ese día (por ejemplo, "martes" para el día 2). Emplees varios SI-ENTONCES  */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("intriduce un numero del 1 al 7");
        Scanner dato=new Scanner(System.in);
        int dia=dato.nextInt();

        if (dia==1) {
            System.out.println("lunes"); 
        }
        if (dia==2) {
            System.out.println("martes"); 
        }
        if (dia==3) {
            System.out.println("miércoles"); 
        }
        if (dia==4) {
            System.out.println("jueves"); 
        }
        if (dia==5) {
            System.out.println("viernes"); 
        }
        if (dia==6) {
            System.out.println("sábado"); 
        }
        if (dia==7) {
            System.out.println("domingo"); 
        }
        if (dia<=0 || dia>=8) {
            System.out.println("error");
        }
        
        dato.close();
    }
}
