//Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
// la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
import java.util.*;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);

        int totalEdad=0;
        double totalAltura=0, media=0;
        int mayor=0;
        double alto=0;

        for (int i = 0; i <5 ; i++) {

            System.out.println("introduzca la edad");
            int edad = dato.nextInt(); 
            System.out.println("introduzca la altura");
            double altura = dato.nextDouble();
            totalEdad=totalEdad+edad;
            totalAltura=totalAltura+altura;
            media=totalAltura/5;

            if (edad>18) {
                mayor++;
            }

            if (altura>1.75) {
                alto++;
            }
        } 
    

            System.out.println("La suma de las edades de los alumnos es: "+ totalEdad);
            System.out.println("La altura media de los alumnos es: "+media);
            System.out.println("Del total de alumnos  "+mayor+"  son mayores de edad");
            System.out.println("del total de alumnos"+ alto+ "miden mas de 1.75");
        dato.close(); 
    }
}
