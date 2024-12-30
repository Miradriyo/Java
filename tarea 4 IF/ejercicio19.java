/*  Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números 
del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo 
sustituya por una E. */
public class ejercicio19 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int j2 = 0; j2 < 10; j2++) {
                    for (int k = 0; k < 10; k++) {
                        for (int k2 = 0; k2 < 10; k2++) {
                            String resultado="";
                            if (i == 3) {
                                resultado += "E-";
                              } else {
                                resultado += i + "-";
                              }
                              if (j == 3) {
                                resultado += "E-";
                              } else {
                                resultado += j + "-";
                              }
                              if (j2 == 3) {
                                resultado += "E-";
                              } else {
                                resultado += j2 + "-";
                              }
                              if (k == 3) {
                                resultado += "E-";
                              } else {
                                resultado += k + "-";
                              }
                              if (k2 == 3) {
                                resultado += "E";
                              } else {
                                resultado += k2;
                              }
                              // Imprimir el resultado
                              System.out.println(resultado);
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
    
}
}
