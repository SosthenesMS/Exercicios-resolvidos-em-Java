package exerduvidavar;

/* DÚVIDA: Por que as veriáveis i e j não são reconhecidas fora dos laços
 */

public class ExerDuvidaVar{

    public static void main(String[] args) {
        
        for (int i = 1; i<=3; i++){
            for (int j = 0; j<=2; j++){
                System.out.println(i + " " + j);
            }
        }
        
        System.out.println(i + " " + j); // Por que essas variáveis não são lidas? Preciso declarar elas fora dos lasços FOR?
   }
}
    
