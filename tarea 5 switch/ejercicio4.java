/*Crea un programa que pida al usuario un número de mes (por ejemplo, el 4) y escriba el nombre 
del mes correspondiente (por ejemplo, "abril").Emplea varios SI-ENTONCES  */

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("intriduce un numero del 1 al 12");
        Scanner dato=new Scanner(System.in);
        int mes=dato.nextInt();

        if (mes==1) {
            System.out.println("enero"); 
        }
        if (mes==2) {
            System.out.println("febrero"); 
        }
        if (mes==3) {
            System.out.println("marzo"); 
        }
        if (mes==4) {
            System.out.println("abril"); 
        }
        if (mes==5) {
            System.out.println("mayo"); 
        }
        if (mes==6) {
            System.out.println("junio"); 
        }
        if (mes==7) {
            System.out.println("julio"); 
        }
        if (mes==8) {
            System.out.println("agosto"); 
        }
        if (mes==9) {
            System.out.println("septiembre"); 
        }
        if (mes==10) {
            System.out.println("octubre"); 
        }
        if (mes==11) {
            System.out.println("noviembre"); 
        }
        if (mes==12) {
            System.out.println("diciembre");
        }
        if (mes<=0 || mes>=13) {
            System.out.println("error");
        }
        
        dato.close();
    }
    }

