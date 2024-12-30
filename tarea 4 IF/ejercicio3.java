import java.util.Scanner;
// Pedir dos números y decir cual es el mayor o si son iguales.
public class ejercicio3 {
    public static void main(String[] args) {
          Scanner dato=new Scanner(System.in);
          System.out.println("Escribe un numero");
          int num1=dato.nextInt();
          System.out.println("Escribe otro numero");
          int num2=dato.nextInt();

          if (num1==num2) {
            System.out.println("El numero" + num2 +"es igual que " + num2);
          }else {
            if (num1<num2) {
            System.out.println("El numero" + num1 +"es menor que " + num2);
             } else {
            System.out.println("El numero" + num1 +"es mayor que " + num2); 
            }
        }
dato.close();
    }
}
