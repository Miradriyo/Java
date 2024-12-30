//Escribir todos los números del 100 al 0 de 7 en 7.

public class ejercicio12 {
    public static void main(String[] args) {
        
        int num=0;

        if (num<100) {

            do {
                System.out.println(""+ num);
                num=num+7;
                
            } while (num<100);
            
        }

    }
}
