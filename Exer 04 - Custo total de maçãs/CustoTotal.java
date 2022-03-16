package custototal;
import java.util.Scanner;

/**
 *
 * @author sosthenesms
 * Exercício 3: As maçãs custam R$ 1,30 cada se forem
 * compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
 * Escreva um programa em Java que leia o número de maçãs compradas, calcule e
 * escreva o custo total da compra..
 */
public class CustoTotal {

    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       float qtd, res;
       
        System.out.print("Digite a quantidade de maçãs compradas: ");
        qtd = x.nextFloat();
        
        if (qtd < 12){
            res = (float)(qtd * 1.30);
            System.out.printf("O custo total foi de: R$ %.2f \n",res);
        } if (qtd >= 12){
            res = (float) (qtd * 1.00);
            System.out.printf("O custo total foi de R$ %.2f \n",res);
        } 
        
    }
    
}
