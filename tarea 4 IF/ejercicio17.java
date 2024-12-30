//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
import java.util.*;
public class ejercicio17 {
    public static void main(String[] args) {
        
        Scanner dato=new Scanner(System.in);
        
        int aprobado=0, suspenso=0, condicionado=0;
        for (int i = 0; i<6 ; i++) {

            System.out.println("Introduzca la nota");
            double nota = dato.nextInt(); 
            if (nota>=5) {
                aprobado++;
            }
            if (nota<4) {
                suspenso++;
            }  
            if (nota==4) {
                condicionado++;
                
            }

            System.out.println("hay  "+ aprobado +"  aprobados  "+ suspenso+"  suspensos  "+condicionado+ "  condicionados  ");
        }

        dato.close();
    }
    
}
