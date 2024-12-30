/*Diseña un arrayList con los siguientes datos:
• Sofía
• Chema
• Alex
• Rosa
Consideraciones
• Mostrar con la propiedad pertinente el tamaño del arraylist.
• Buscar el valor de Juan, con el método en cuestión para ver si lo contiene. Mostrar el mensaje si lo contiene o no, según proceda
• Borra el ultimo element del arraylist */
import java.util.*;
public class ejercicio3 {
    public static void main(String[] args) {
        
        ArrayList<String>nombres=new ArrayList<>();
        nombres.add("Sofía");
        nombres.add("Chema");
        nombres.add("Alex");
        nombres.add("Rosa");

        System.out.println("La lista contiene  "+nombres.size()+"  nombres");
       
        if (nombres.contains("Juan")) {
            System.out.println("Contiene el nombre Juan");
        }else{
            System.out.println("no contiene el nombre de Juan");
        }

        int ultimo=nombres.size();

        nombres.remove(ultimo-1);

        for (String i : nombres) {
            System.out.println(i);
            
        }
    }
    
}
