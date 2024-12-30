/*Diseña un programa que pide por pantalla 5 datos de tipo int, y se almacenan en un
arraylist. Posteriormente se pregunta si se desean imprimir los datos, en caso
afirmativo mostrar los datos por pantalla.
 */
import java.util.*;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        ArrayList<Integer>numeros=new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero");
            int num=dato.nextInt();
            numeros.add(num);
            
        }
        dato.nextLine();
        System.out.println("¿Quiere visualizar la lista S/N?");
        String respuesta=dato.nextLine();
        respuesta=respuesta.toUpperCase();

        if (respuesta.equals("S")) {
            for (int i : numeros) {
                System.out.println(i);
            }
        }   
    dato.close();
    }
    
}
