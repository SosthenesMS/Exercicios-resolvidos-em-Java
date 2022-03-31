package numerofatorial;
import java.util.Scanner;



/* Calular o fatorial de um número
 */

public class NumeroFatorial{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int c;
        int f = 1;
        
        System.out.print("Digite um número: ");
        c = in.nextInt();
        
        while (c>=1){
            f *= c;
            c--; // implementar um decremento após realizar a multiplicação, até chegar em 01. 
        }
        
        System.out.println("O fatorial é: " + f);
     }
    
   }
