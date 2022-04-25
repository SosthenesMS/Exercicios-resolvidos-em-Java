package numerosfibonacci;
/**
 * @author sosthenesms-drake
 */
public class NumerosFibonacci {
    /**
     * Imprimir a sequencia de números de Fibonacci até passar de 100.
     */
    public static void main(String[] args) {
      
        int n1 = 1, n2 = 0;
        
        System.out.println("A sequência de Fibonacci é: ");
        for (int i = 0; i <= 30; i++){
            
            if(i == 0){
                System.out.print(i + " ");
            }else if (i < 2){
                System.out.print(1 + " ");
                
            }else{
                
                n1 = n1 + n2;
                n2 = n1 - n2;
                
                System.out.print(n1 + " ");
                
                if (n1 > 100){   // condicional usada para encerrar o laço quando a sequencia de Fibonacci for maior que 100.
                    break;
                }
            }
         }
    }
}
