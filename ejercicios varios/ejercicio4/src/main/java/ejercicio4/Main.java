package ejercicio4;
/*Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en 2
La secuencia debería de ser 200,202,202,etc)
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int numero=200;
        while (numero<=250){
            System.out.println(numero);
            numero+=2;
        }
    }
}
