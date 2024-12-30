//Codifique un programa que pide por pantalla una dirección de e-mail, comprobar si contiene el carácter de la @ y del .
import java.util.*;
public class ejercicio {
public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    System.out.println("Introduzca un email");
    String email=dato.nextLine();

    
    int at=email.indexOf("@");
    int dot=email.indexOf(".");

    if (at==-1) {
        System.out.println("Formato incorrecto. No hay @");
    }
    
    if (dot==-1) {
        System.out.println("formato incorrecto.No hay punto");
        
    }

    dato.close();
    
}
    
}


