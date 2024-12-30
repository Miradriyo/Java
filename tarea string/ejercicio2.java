/*Diseña un objeto de tipo String que pide por teclado un grupo de dos-tres palabras.
• Implementar los siguientes métodos:
• Imprimir la primera mitad de los caracteres de la cadena
• Imprimir el último carácter
• Imprimir la cadena de forma inversa
• Imprimir cada carácter del String separado por un guión
• Imprimir la cantidad de vocales almacenadas

NOTA: Verificar si la cadena se lee igual de izquierda a derecha tanto como de derecha
a izquierda. */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        
    Scanner dato=new Scanner(System.in);
    String words=new String();
    int mitad;
    int charactertotal;
    
    System.out.println("Introduzca dos o tres palabras");
    words=dato.nextLine();

    // Imprimir la primera mitad de los caracteres de la cadena
    mitad=words.length()/2;
    
    words.substring(0, mitad);
    System.out.println("la primera mitad de los caracteres es: " + words.substring(0,mitad));

    //Imprimir el último carácter

    charactertotal= words.length();
    char ultimo=words.charAt(charactertotal-1);

    System.out.println("El último caracter es:   " + ultimo);

    //Imprimir la cadena de forma inversa

    StringBuilder invertida=new StringBuilder(words);

    invertida.reverse();

    System.out.println("la cadena invertida es:  "+ invertida);

    //Imprimir cada carácter del String separado por un guión

    StringBuilder guion=new StringBuilder(words);

    for (int i = 0; i<words.length(); i++) {

        guion.append('-');
        guion.append(guion.charAt(i));
        
    }
    System.out.println("la cadena con guiones es:  " + guion);

    //Imprimir la cantidad de vocales almacenadas

    StringBuilder vocales=new StringBuilder(words);

    int a=0,e=0,i=0,o=0,u=0, totalvocales=0;
    
    for (int j = 0; j < words.length(); j++) {

            vocales.charAt(j);

            if (j=='a'|| j=='A') {

                a++;                
            }
            if (j=='e'|| j=='E') {

                e++;                
            }
            if (j=='i'|| j=='I') {

                i++;                
            }
            if (j=='o'|| j=='O') {

                o++;                
            }
            if (j=='u'|| j=='U') {

                u++;                
            }
    }
    totalvocales=a+e+i+o+u;
    System.out.println("En total hay:  "+totalvocales+"  de ellas, hay  " + a +"  a  " + e+ "  e  " + i+ "  i  "+ o+ " o " + u+ " u");

    //Verificar si la cadena se lee igual de izquierda a derecha tanto como de derecha a izquierda.

    if (words==invertida) {
        System.out.println("Es un palíndromo");
    }else{
        System.out.println("no es un palíndromo");
    }

    dato.close();
        
    }
    
}


