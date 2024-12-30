/*2.Diseña un programa que almacena n números aleatorios, positivos. Se pide:
 Imprimir todos los valores del arraylist
 Mostrar cual es el primer valor
 Mostrar el último valor
 Se pide por pantalla al usuario si desea almacenar algún valor, si teclea si, se almacena
el valor tecleado en el arralist. */

import java.util.*;

public class dos {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        ArrayList<Integer>numeros=new ArrayList<>();
        Random rnd=new Random();
        int n=10;

        for (int i = 0; i < n; i++) {
            int numeroaleatorio=rnd.nextInt(100);
            numeros.add(numeroaleatorio);
        }

        for (int num : numeros) {
            System.out.println(num);
        }

        System.out.println("el primer numero es el "+numeros.get(0));
        
        int ultimovalor=numeros.size()-1;
       
        System.out.println("el ultimo numero es el "+numeros.get(ultimovalor));
       
        System.out.println("Desea imprimir algún otro dato? S/N");
        String respuesta=dato.nextLine().toUpperCase();
        
        if (respuesta.equals("S")) {
            System.out.println("introduzca valor");
            int valor=dato.nextInt();
            numeros.add(valor);  
        }
        dato.close();
    }

 
}

