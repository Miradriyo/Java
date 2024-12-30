/*Diseñar un array con las calificaciones de 6 asignaturas de un alumno que se piden por
pantalla. Se debe calcular su nota media final.
 Si la media>=5, la calificación es aprobado
 Si la media<5, la calificación es suspenso
 Si la media>5 y <=6.5 la calificación es bien
 Si la media >6.5 y <=8.5 la calificación es notable
 Si la media >8.5 y >=9 la calificación es sobresaliente */

import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        
        //creamos el array para las notas
        int numAsignaturas=6;
        int[] asignaturas= new int[numAsignaturas];
        //creamos objeto Scanner
        Scanner dato=new Scanner(System.in);

        //metemos las notas dentro del array
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduce la nota de la asignatura");
            int nota=dato.nextInt();
            asignaturas[i]=nota;
        }

        //creamos la variable donde guardar la suma de las notas
        int suma=0;

        //recorremos array sumando notas(valores de cada celda)
        for (int i = 0; i < asignaturas.length; i++) {

             suma=suma+asignaturas[i];
            
        }

        //hago la media;
        double media;

        media=suma/asignaturas.length;

        System.out.println("La media es:  "+ media);

        if (media<5) {
            System.out.println("Suspenso");
        }else{
            System.out.println("Has aprobado");
            if (media>5 && media<=6.5) {
                System.out.println("Tienes un bien");
            }
            if (media>6.5 && media<=8.5) {
                System.out.println("Tienes un notable");
            }
            if (media>8.5 && media<=10) {
                System.out.println("Tienes un sobresaliente");
            }
        }

        dato.close();
    }
}
