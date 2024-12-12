import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        int edad;
        double altura;
        Scanner dato= new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        edad=dato.nextInt();
        System.out.println("Introduzca su altura: ");
        altura=dato.nextDouble();
        System.out.println("La edad introducida es: "+edad+" y la altura es: "+ altura);
        dato.close();
    }
}
