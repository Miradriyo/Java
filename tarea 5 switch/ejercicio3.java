/*Crea un programa que pida al usuario un número de mes (por ejemplo, el 4) y escriba el nombre 
del mes correspondiente (por ejemplo, "abril"). Debes usar la orden SWITCH */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("intriduce un numero del 1 al 12");
        Scanner dato=new Scanner(System.in);
        int mes=dato.nextInt();

       switch (mes) {
        case 1:
            System.out.println("enero");
            break;
        case 2:
            System.out.println("febrero");
            break;
        case 3:
            System.out.println("marzo");
            break;
        case 4:
            System.out.println("abril");
            break;
        case 5:
            System.out.println("mayo");
            break;
        case 6:
            System.out.println("junio");
            break;
        case 7:
            System.out.println("julio");
            break;
        case 8:
            System.out.println("agosto");
            break;
        case 9:
            System.out.println("septiembre");
            break;
        case 10:
            System.out.println("octubre");
            break;
        case 11:
            System.out.println("noviembre");
            break;
        case 12:
            System.out.println("diciembre");
            break;
        default:
            System.out.println("incorrecto");
            break;
       }
       dato.close();
    }
    
}

