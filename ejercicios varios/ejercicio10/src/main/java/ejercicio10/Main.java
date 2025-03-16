package ejercicio10;

import java.util.Scanner;

/*En 3 array diferentes se guardan los nombres, temperaturas minimas y máximas de 5 ciudades.
 * En el primero se guardan los nombres, segundo minimas y terccero máximas
 * Se pide un programa que permita la carga de las ciudades, sus temperaturas minimas y max. Además deberá
 * informar por pantalla ciudad con temperatura más baja y la más alta (dando a conocer el mismo tiempo la cantidad de grados)
 */
public class Main {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        String[] ciudades = new String[5];
        double[] temperaturasMinimas = new double[5];
        double[] temperaturasMaximas = new double[5];

        //cargar strings

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad " + (i + 1) + ": ");
            ciudades[i] = dato.nextLine();   
        }
        for (int i = 0; i < temperaturasMinimas.length; i++) {
            System.out.println("Ingrese la temperatura minima de " + ciudades[i] + ": ");
            temperaturasMinimas[i] = dato.nextDouble();
        }
        for (int i = 0; i < temperaturasMaximas.length; i++) {
            System.out.println("Ingrese la temperatura maxima de " + ciudades[i] + ": ");
            temperaturasMaximas[i] = dato.nextDouble();
        }
        //recorrer arrays y buscar temperaturas minimas y maximas
        double minima=99999999;
        int posicionMinima=-1;
        for (int i = 0; i < temperaturasMinimas.length; i++) {
            if (temperaturasMinimas[i] < minima) {
                minima = temperaturasMinimas[i];
                posicionMinima = i;
            }
        }
        double maxima=-99999999;
        int posicionMax=-1;
        for (int i = 0; i < temperaturasMaximas.length; i++) {
            if (temperaturasMaximas[i] < minima) {
                maxima = temperaturasMaximas[i];
                posicionMax = i;
            }
        }
        //imprimir resultados
        System.out.println(("La temperatura máxima es de "+ maxima + " en la ciudad de " + ciudades[posicionMax]));
        System.out.println(("La temperatura mínima es de "+ minima + " en la ciudad de " + ciudades[posicionMinima]));
        dato.close();
    }
}