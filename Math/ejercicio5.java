/**
 Explica el siguiente código y define un posible enunciado.

 El enunciado que yo le daría es: Crea un juego de dados de dos jugadores, cada jugador tiene que sacar un numero aleatorio entre 0 y 6. Muestra por pantalla quien ha ganado.
 */
public class ejercicio5 {
    public static void main(String[] args) {
        
        System.out.println("Se presetan los participantes. A continuación hará su lanzamiento el jugador 1");
        //con la clase Math.random se crea un numero aleatorio entre 0.0 y 1.0. al multiplicar por 6 y sumarle 0.5 estamos creando un numero aleatorio entre 0.5 y 6.5
        //De esta manera vamos a crear los dos numeros aleatorios de cada uno de los jugadores
        double aux1=(Math.random()*6+0.5);
        double aux2=(Math.random()*6+0.5);
        //con la variable math.round lo que hacemos es redondear al numero más cercano.
        double intento1=Math.round(aux1);
        double intento2=Math.round(aux2);
        //pasamos los valores a numeros enteros, es decir si el valor de intento1 es 4.0 (porque lo hemos redondeado anteriormente) pasa a ser 4
        int jugador1=(int)intento1;
        int jugador2=(int)intento2;
        //mostramos por pantalla los numeros de cada uno de los jugadores
        System.out.println("El jugador 1 ha sacado:"+jugador1+ "y el jugador 2 ha sacado" + jugador2);
        //con Math.max vamos el valor mayor de ambos
        int ganador=Math.max(jugador1,jugador2);
        //imprimirmos el valor superior 
        System.out.println("Quien saco "+ganador+ "es el ganador");
    }

    
}