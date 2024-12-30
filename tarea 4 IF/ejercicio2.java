//Pedir dos números y decir si uno es múltiplo del otro.
import java.util.*;
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        
        int total;
        System.out.println("introduzca un numero");
        int num1=dato.nextInt();
        System.out.println("introduzca otro numero");
        int num2=dato.nextInt();

        total=num1%num2;

        if (total==0) {

            System.out.println("el " + num1 + " SI es multiplo de " + num2);
            
        } else {
            System.out.println("el " + num1 + " NO es multiplo de " + num2);
        }
        dato.close();
    }
    
}


//error revisar