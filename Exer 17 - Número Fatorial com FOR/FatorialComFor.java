package fatorialcomfor;
import java.util.Scanner;



/* Calcular o fatorial de um número com uso da estrutura for
 */

public class FatorialComFor{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double i = in.nextInt();
        double f = 1;
        for ( ;i >= 1; i--){
            f *= i;
        }
        
        System.out.println("O fatorial é: " + f);
   }
}
