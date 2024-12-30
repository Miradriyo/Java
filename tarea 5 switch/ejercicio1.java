/*Haz un programa que pida un número al usuario un número de día de la semana (del 1 al 7) 
y escriba el nombre de ese día (por ejemplo, "martes" para el día 2). 
Debes emplear la orden SWITCH. */

import java.util.Scanner;
public class ejercicio1 {

    public static void main(String[] args) {
        System.out.println("intriduce un numero del 1 al 7");
        Scanner dato=new Scanner(System.in);
        int dia=dato.nextInt();

       switch (dia) {
        case 1:
            System.out.println("lunes");
            break;
        case 2:
            System.out.println("martes");
            break;
        case 3:
            System.out.println("miércoles");
            break;
        case 4:
            System.out.println("jueves");
            break;
        case 5:
            System.out.println("viernes");
            break;
        case 6:
            System.out.println("sábado");
            break;
        case 7:
            System.out.println("domingo");
            break;
        default:
            System.out.println("incorrecto");
            break;
       }
       dato.close();
    }
    
}