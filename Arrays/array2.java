/*2.Se pide por pantalla el número de posiciones que queremos que tenga nuestro array, se
piden los datos por pantalla.
Se crea otro array, pidiendo el número de posiciones por pantalla. Los valores se cargan con un
bucle for.
Crear un tercer array que contiene, los datos de los dos arrays.
 */

 import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        //Creamos objeto Scanner
        Scanner dato=new Scanner(System.in);
        //perdimos posiciones y creamos array
        System.out.println("¿Cuántas posiciones quieres que tenga tu array?");
        int num_posiciones=dato.nextInt();
        int[] numposiciones= new int[num_posiciones];
        //Recorremos Array y ponemos lo valores
        for (int i = 0; i < numposiciones.length; i++) {
            System.out.println("introduzca el valor");
            numposiciones[i]=dato.nextInt();

        }

         //perdimos posiciones y creamos array2
         System.out.println("¿Cuántas posiciones quieres que tenga tu array?");
         int num_posiciones2=dato.nextInt();
         int[] numposiciones2= new int[num_posiciones2];
         //Recorremos Array y ponemos lo valores
         for (int i = 0; i < numposiciones2.length; i++) {
             System.out.println("introduzca el valor");
             numposiciones2[i]=dato.nextInt();
 
         }
        
        int sumaposiciones=num_posiciones+num_posiciones2;
        int[] arraysuma=new int[sumaposiciones];

        System.out.println("el nuevo array tendrá:  "+ sumaposiciones);

        for (int i = 0; i < arraysuma.length; i++) {
            
        }

        //Copiamos los valores del primer array al tercer array
        for (int i = 0; i < num_posiciones; i ++) {
            arraysuma [i] = numposiciones [i];
        }

        //Con un bucle for recorremos el array desde el final del ultimo valor anterior hasta el final
        for (int i = num_posiciones; i < sumaposiciones; i ++) {
            arraysuma [i] = numposiciones2 [i - num_posiciones];
        }

        //Usar un bucle for para mostrar los valores del tercer array por pantalla
        for (int i = 0; i < sumaposiciones; i ++) {
            System.out.println ("El valor de la posición " + i + " del tercer array es: " + arraysuma [i]);
        }
    
       
        dato.close();
    }
}
