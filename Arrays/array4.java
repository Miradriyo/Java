/*Diseña un array con los números del 1-57, se debe mostrar el número de celdas que
contienen números pares y el número de celdas que contienen números impares */
public class array4 {
    public static void main(String[] args) {
    
        int num=57;
        int pares=0;
        int impares=0;
        
        int[]arrayNum=new int[num];

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i]=i+1;
        }

        for (int i = 0; i < arrayNum.length; i++) {

            if (arrayNum[i]%2==0) {
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("hay  "+ pares+ " celdas pares y "+ impares+ "  celdas impares");

        
        
    }
}
