import java.util.*;
public class ejercicio4 {
    //Pedir tres números y mostrarlos ordenados de mayor a menor
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);

        int mayor, mediano, pequeño;
          System.out.println("Escribe un numero");
          int num1=dato.nextInt();
          System.out.println("Escribe otro numero");
          int num2=dato.nextInt();
          System.out.println("Escribe otro numero");
          int num3=dato.nextInt();

          if (num1>num2 && num1>num3) {
            mayor = num1;
            if (num2 >= num3) {
                mediano = num2;
                pequeño = num3;
            } else {
                mediano = num3;
                pequeño = num2;
            }
          }else if (num2 >= num1 && num2 >= num3) {
            
            mayor = num2;
            if (num1 >= num3) {
                
                mediano = num1;
                pequeño = num3;
            } else {
              
                mediano = num3;
                pequeño = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                
                mediano = num1;
                pequeño = num2;
            } else {
                mediano = num2;
                pequeño = num1;
            }
        }
        System.out.println("Los números ordenados de mayor a menor son:");
        System.out.println(mayor);
        System.out.println(mediano);
        System.out.println(pequeño);   
        
        dato.close();
    }
}
