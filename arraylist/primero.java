/*Crear un arraylist con 5 valores de tipo integer. Calcular la media de todos los valores.
Visualizar todos los valores y la media. */
import java.util.*;
public class primero {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        ArrayList<Integer>numeros=new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero");
            int num=dato.nextInt();
            numeros.add(num);
        }

        double valor=0;
        for (int i = 0; i < numeros.size(); i++) {
            valor=valor+numeros.get(i);
        }
        double media=valor/numeros.size();

        System.out.println(media);
        dato.close();

    }
    
}
