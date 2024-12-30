public class ejercicio3 {
    public static void main(String[] args) {

        //Calcular el factorial del número 15
        
        long factorial = 1;
        for (int i = 2; i <= 15; i++) {
        factorial *= i;
        }
        System.out.println("El factorial de 5 es " + factorial);

    }
}

