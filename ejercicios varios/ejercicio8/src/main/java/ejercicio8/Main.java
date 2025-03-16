package ejercicio8;

import java.util.Scanner;

public class Main {
/*En una tabla de 4*4 se guardan las notas de 4 alumnos. Cada fila corresponde a las notas y al promedio de cada alumno
 * Se necesita un programa que permitaz cargar, en las 3 posiciones(co9lumnas) de cada fila las notas del alumnos
 * y en la ultima columna se calculen los promedios. Una vez realizados los cálculos,
 * se debe mostrar las 3 notas de cada alumno y el promedio correspondiente.
 */
    public static void main(String[] args) throws Exception {
        double[][] notas = new double [4][4];
        Scanner dato = new Scanner(System.in);
        double suma=0;
        //cargamos los datos
        for (int f=0; f<4; f++){
            for (int c=0; c<3; c++){
                System.out.println("Ingrese la nota del alumno " + (f) );
                notas[f][c] = dato.nextDouble();
                suma=suma+notas[f][c];
            }
        //calculamos el promedio
            notas[f][3]=suma/3;
            suma=0;
        }
        //mostramos los datos
        for (int f=0; f<4; f++){
            System.out.println("Notas del alumno " + (f) + ": ");
            for (int c=0; c<3; c++){
                System.out.print(notas[f][c] + " ");
            }
            System.out.println("Promedio: " + notas[f][3]);
        }
        dato.close();
}
}