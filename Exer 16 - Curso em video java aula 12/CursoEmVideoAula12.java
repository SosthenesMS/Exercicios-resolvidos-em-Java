package cursoemvideoaula12;
import java.util.Scanner;



/* Somar números com a interação do usuário
 */

public class CursoEmVideoAula12{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a, s=0;
        String resp;

        
        do{
            System.out.print("Digite um número: ");
            a = in.nextInt();
            s += a;
            System.out.print("Deseja cotinuar [S/N]? ");
            resp = in.next();
            
         }while(resp.equals("S") || resp.equals("s"));
        
        System.out.println("A soma de todos os valores é: " + s);
    }
    
   }
    
