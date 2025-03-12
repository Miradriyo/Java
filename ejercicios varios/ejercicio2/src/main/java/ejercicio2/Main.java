/*Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos
 * pueden tener 3 categorias: 
 * 1. Repositor sobran $15890+un bono del 10%
 * 2. Cajero cobran $25630.89 fijos
 * 3. Supervisor cobran $35560.20 en bruto al cual se les descuenta un 11% de jubilación
Se necesita un programa que dependiento del tipo de empleados del que se trate, calcule
y muestre en pantalla el corresppondiente sueldo.
 */
package ejercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int tipoEmpleado;
        Scanner dato = new Scanner(System.in);
        
        do {
            System.out.println("Introduzca el tipo de empleado");
            System.out.println("1: Repositor, 2: Cajero, 3: Supervisor, 4: Salir): ");  
            tipoEmpleado = dato.nextInt();
            switch (tipoEmpleado) {
                case 1:
                    System.out.println("Ha seleccionado Repositor");
                    System.out.println("El sueldo de repositor es: $15890 + 10% de bono");
                    double sueldoRepositor = 15890*0.10;
                    System.out.println("que en total será: $" + (15890 + sueldoRepositor));
                    break;
                case 2:
                    System.out.println("Ha seleccionado Cajero");
                    System.out.println("El sueldo de cajero es: $25630.89");
                    break;
                case 3:
                    System.out.println("Ha seleccionado Supervisor");
                    System.out.println("El sueldo de supervisor es: $35560.20 - 11% de jubilación");
                    double sueldoSupervisor = 35560.20*0.11;
                    System.out.println("que en total será: $" + (35560.20 - sueldoSupervisor));
                    break;        
                default:
                    System.out.println("Tipo de empleado no válido");
                    break;
            }
        } while (tipoEmpleado != 4);
        System.out.println("Saliendo del programa...");
        dato.close();
       
    }
}