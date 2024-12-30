/*1.Desarrollar un programa que solicita la contraseña o password. Se debe comprobar:
• Que la longitud de la cadena no es superior a 25 caracteres.
• No debe contener caracteres especiales:@,.,$,#,&,/
• Se debe almacenar la primera letra y la última en mayúsculas */
import java.util.*;
public class ejercicio1 {
    public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    String password=new String();
    boolean startUpper=true;
    boolean caracteres=true;
    boolean finishUpper=true;
    int passwordlength;
    
    do {
        System.out.println("Introduzca una contraseña");
        password=dato.nextLine();
    
        passwordlength= password.length();
        caracteres = password.matches("[@,\\.\\,$,#,&]");
        startUpper = password.matches("[A-Z]");
        finishUpper = password.matches("[A-Z]");
        
        System.out.println("La contraseña es inválida.Debe contener máx25 caracteres,no contener carácteres @,.,$,#,&, y tener la primera y última letra en mayúscula ");
    
    }while ((startUpper==true || finishUpper==true || caracteres==true || passwordlength>=25));
    {
        System.out.println("contraseña válida");
    }
    
    dato.close();
            
    }
    } 
    



    

    /*if (startUpper==true && finishUpper==true && caracteres==true && passwordlength>=25) {
            System.out.println("contraseña válida");
            break;
        }else
            System.out.println("La contraseña es inválida.Debe contener máx25 caracteres,no contener carácteres @,.,$,#,&, y tener la primera y última letra en mayúscula ");
    
            dato.close(); */






 /* if (passwordlength>=25) {
        System.out.println("contraseña inválida tiene más de 25 caracteres. Debe contener máx25 caracteres,no contener carácteres @,.,$,#,&, y tener la primera y última letra en mayúscula ");
    }
    if(caracteres==true){
        System.out.println("contraseña inválida. tiene caracteres especiales. Debe contener máx25 caracteres,no contener carácteres @,.,$,#,&, y tener la primera y última letra en mayúscula ");
    }*/