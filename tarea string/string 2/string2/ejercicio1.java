

import java.util.*;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        
        char ultimo=0;
        String caracter="";
        int A=0,E=0,I=0,O=0,U=0,totalVocales=0;
        char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
     
        System.out.println("ntroduzca un texto");
        String texto=dato.nextLine();

    //Imprimir la primera mitad de los caracteres de la cadena.

    // Convertimos el String texto en un StringBuilder
        StringBuilder SBtexto = new StringBuilder(texto);

        int mitad=texto.length()/2;

        StringBuilder middle= new StringBuilder();

    // Usamos el método delete sobre el StringBuilder 
        middle = SBtexto.delete(mitad, texto.length());

        System.out.println("La primera mitad del texto es:  "+middle);
       
    //recorremos la longitud de la cadena en busca del ultimo caracter
        for (int b = 0; b < texto.length(); b++) {
            
            ultimo=texto.charAt(b);
            
        }

        System.out.println("el ultimo caracter es:  "  +ultimo);

    //Imprimirlo en forma inversa
    //creo un nuevo Stringbuilder del string texto
        StringBuilder newtexto=new StringBuilder(texto);
    //uso el metodo reverse
        StringBuilder reverse=newtexto.reverse();

        System.out.println("Al reves sería: "+ reverse);

    //Imprimir cada carácter del String separado con un guión.


        for (int j = 0; j<texto.length(); j++) {
            caracter=caracter + texto.charAt(j)+ "-";
            
        }
        System.out.println("la palabra con guiones es:  "+ caracter);
      
    //Imprimir la cantidad de vocales almacenadas.

    //primero vamos a asegurarnos que este todo en minúsculas
        
        texto=texto.toLowerCase();

        for (int v = 0; v < texto.length(); v++) {

           char letra=texto.charAt(v);
           if (letra==a) {
            A++;
           } else {if (letra==e) {
            E++;
           } else {if (letra==i) {
            I++;
            
           } else {if (letra==o) {
            O++;
            
           } else { if (letra==u) {
            U++;
           }
            
           }
            
           }
            
           }
            
           }
           
            
        }

        totalVocales=A+E+I+O+U;
        
        System.out.println(texto+"en total hay: "+ totalVocales+ "vocales. Son  "+A+ "A  " +E+" E  "+I+"I  "+O+"O "+U+"U ");

// Implementar un método que verifique si la cadena se lee igual de izquierda a derecha tanto
//como de derecha a izquierda (ej. neuquen se lee igual en las dos direcciones


String alreves=reverse.toString();
String alrevesminusculas=alreves.toLowerCase();

if (texto.equals(alrevesminusculas)){
    
    System.out.println("Se lee igual derecho que al reves");
}else{
    System.out.println("NO se lee igual al derecho que al reves");
}

        dato.close();
    }
}



