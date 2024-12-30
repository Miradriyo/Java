/* Realizar un programa para gestionar la lista de Empleados, en que tendremos el
siguiente menú:
1. Agregar Nombres.
2. Modificar nombre
3. Borrar Nombres.
4. Visualizar un Nombre
5. Visualizar todos Nombres.
6. Salir.
Si se selecciona 1, nos pedirá cuantos nombres queremos introducir en el arraylist.
La opción 2 modificará los datos de un empleado.
La opción 3, nos dirá como queremos borrar, nos tiene que dar opción a borrar por
posición o por nombre
La opción 4 muestra un nombre, según la posición que queremos, hay que comprobar
si la posición es correcta.
La opción 5 muestra por pantalla un listado de todos los empleados
Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se
seleccione la opción 6, que terminará el programa. */

import java.util.*;


public class tercero {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        ArrayList<String>empleados=new ArrayList<>();
        boolean salir=false;

        while (salir==false) {
            System.out.println("1. Agregar Nombres.");
            System.out.println("2. Modificar nombre");
            System.out.println("3. Borrar Nombres.");
            System.out.println("4. Visualizar un Nombre");
            System.out.println("5. Visualizar todos Nombres.");
            System.out.println("6. Salir.");
            System.out.println("Introduzca el numero: ");
            int num=dato.nextInt();

            switch (num) {
                case 1:
                    System.out.println("¿Cuántos nombres quieres introducir?");
                    int numero=dato.nextInt();
                    dato.nextLine();
                    for (int i = 0; i < numero; i++) {
                        System.out.println("Introduzca el nombre: ");
                        String nombre=dato.nextLine();
                        empleados.add(nombre);
                    }
                    break;
                case 2:
                    System.out.println("Introduzca el nombre que desea modificar");
                    String modificar=dato.nextLine();
                    dato.nextLine();
                    System.out.println("Introduzca el nuevo nombre");
                    String modificado=dato.nextLine();
                    dato.nextLine();
                    int valor=empleados.indexOf(modificar);
                    if (valor != -1) {
                        empleados.set(valor, modificado); 
                        System.out.println("ya corregido el valor"+modificar+"por el valor"+modificado);
                    }else{
                        System.out.println("El nombre no existe en la lista.");
                    }                    
                    break;
                case 3:
                System.out.println("¿Cómo quiere borrar?:");
                System.out.println("Pulse 1 si quiere seleccionar la posición a borrar");
                System.out.println("Pulse 2 si quiere borrar un nombre en concreto:");
                int opcionBorrar=dato.nextInt();
                dato.nextLine();

                if (opcionBorrar==1) {
                    System.out.println("¿Qué posición quiere borrar?");
                    int posición=dato.nextInt();  
                    empleados.remove(posición);
                }
                if (opcionBorrar==2) {
                    System.out.println("¿Qué nombre desea borrar?");
                    String borrar=dato.nextLine();
                    if (empleados.contains(borrar)) {
                        empleados.remove(borrar);
                        System.out.println("Nombre borrado: " + borrar);
                    } else {
                        System.out.println("La lista no contiene ese nombre.");
                    }
                } else {
                    System.out.println("El valor introducido es erróneo");
                }
                break;    
              
                case 4:
                    System.out.println("¿Qué nombre deseas visualizar? Introduzca la posición del nombre");
                    int posicion=dato.nextInt();
                    if (posicion>=0 && posicion<empleados.size()) {
                        String nombre=empleados.get(posicion);
                        System.out.println("El nombre de la posicion:"+posicion+"  es el:  "+nombre);
                        
                    }else{
                        System.out.println("No existe un nombre en esa posición");
                    }
                    break;
                
                case 5:
                    System.out.println("Lista de todos los empleados:");
                    for (int i = 0; i < empleados.size(); i++) {
                        System.out.println(empleados.get(i));
                        System.out.println();
                    }
                    break;

                case 6:
                 salir=true;
                 break;
                
                default:
                System.out.println("el valor introducido es erróneo. Introduzca un valor del 1 al 5");
                
            }
        }
        dato.close();
    }

    
}