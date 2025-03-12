/*Realiza un programa que permita el intercambio de valores entre dos variables.
Por ej. Si una variable1 vale 35 y variable2 vale 20, realiza las acciones necesarias 
para que variable1 pase a valer 20 y 2 35 Una vez realizado muestra el valro por pantalla*/
public class App {
    public static void main(String[] args) {
        int variable1=35;
        int variable2=20;
        int variable3=0;

        variable3=variable2; //variable2=20
        variable2=variable1; //variable1=35
        variable1=variable3; //variable3=20

        System.out.println("variable1= "+variable1);
        System.out.println("variable2= "+variable2);
    }
}