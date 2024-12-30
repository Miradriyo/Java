import java.util.Scanner;
public class condicionales {

    public static void main(String[] args) {

        //Se piden por pantalla 3 numeros y hay que comparar cual es el menor de los 3 y el mayor


        System.out.println("Introduzca un numero");
        Scanner dato=new Scanner(System.in);
        int num1=dato.nextInt();
        System.out.println("Introduzca un numero");
        int num2=dato.nextInt();
        System.out.println("Introduzca un numero");
        int num3=dato.nextInt();

        if (num1<num2 && num1<num3) {
            System.out.println("El número "+ num1 + " es el número menor de los 3");
        } else{
            if (num2<num1 && num2< num3) {
            System.out.println("El numero "+ num2 + " es el número menor de los 3");
            } else{ 
            System.out.println("El número más pequeño es el: " +num3);
            }
        }    

        if (num1>num2 && num1>num3) {
            System.out.println("El número "+ num1 + " es el número mayor de los 3");
        } else{
            if (num2>num1 && num2>num3) {
            System.out.println("El numero "+ num2 + " es el número menor de los 3");
            } else{ 
            System.out.println("El número más pequeño es el: " +num3);
            }
        }    
     
        dato.close();
    }
}
