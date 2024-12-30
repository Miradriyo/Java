/*Diseñar un array, que almacena los números del 1 al 10. Consideraciones:
 Utilizar un bucle for para cargar el array
 Se deben imprimir los datos del array en sentido inverso */

public class arrays1 {
public static void main(String[] args) {
    int num=10;
    int[] nums=new int[num];

    for (int i = 0; i < nums.length; i++) {
        nums[i]=i+1;
    }

    for (int i = nums.length - 1; i >= 0; i--) {
        System.out.println("En la posición " + i + " está el valor " + nums[i]);

    }
}
}