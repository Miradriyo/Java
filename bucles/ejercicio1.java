import java.util.Scanner;
public class ejercicio1 {

 //Se pide por pantalla, un número, para comprobar si es primo. Si se introduce el número cero termina el juego.
    public static void main(String[] args) {
        
        Scanner dato= new Scanner(System.in);

        int num;
        
        do {
            System.out.println("Introduce un numero"); 
            num=dato.nextInt();
         int numDivisores=0;
            for (int i = 2; i <= num; i++) {
                if (num%i==0) {
                    numDivisores=numDivisores+1;
                } 
            }
            
            if (numDivisores == 2) {

                System.out.println("el numero no es primo");
                
            }else{
                System.out.println("el numero es primo");
            }

            }while (num!=0);
        
          System.out.println("Fin del juego");
        
          dato.close();
        }
    }
    




