/*Crear un array de caracteres, con los siguientes valores: a,e,r,t,y,u. Crea un array con datos
enteros con valores del 1 al 6.
Diseña un tercer array que tiene el mismo número de celdas que la suma de las celdas de los
dos arrays anteriores. */
public class array3 {
    public static void main(String[] args) {
        String[] caracteres={"a","e","r","t","y","u"};
        int[] num={1,2,3,4,5,6};
        int posiciones=caracteres.length+num.length;

        System.out.println("El array de caracteres tiene  "+caracteres.length+"  posiciones");
        System.out.println("El array de numeros tiene  "+num.length+"  posiciones");
        System.out.println("el total de posiciones de ambos sumadas es:  "+ posiciones);

        int[] array=new int[posiciones];
      
    }
    
}
