package valordofrete;

import java.util.*;

/* Desenvolva um programa em Java que receba o preço de um produto e seu código de
 *origem e mostre o preço do produto junto de sua procedência, o valor calculado do frete e o
 *valor final a ser pago pelo produto, conforme tabela pré definida e utilizada no if.
 */

public class ValorDoFrete{

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int cod;
        float preco, frete, custo;
        
        System.out.print("Informe o código de origem do produto: ");
        cod = in.nextInt();
        System.out.print("Informe o preço do produto R$: ");
        preco = in.nextFloat();
        
        if (cod == 1){
            frete = (float)(preco*(0.1));
            custo = (preco + frete);
            System.out.println("Valor do frete R$: " + frete);
            System.out.println("O produto custa: R$ " + preco + " e a região de procedência é: Norte");
            System.out.printf("O custo total do produto é: %.2f\n", custo);
        }else if (cod == 2 || cod == 5 || cod == 9){
            frete = (float) (preco * (0.03));
            custo = (preco + frete);
            System.out.println("Valor do frete R$: " + frete);
            System.out.println("O produto custa: R$ " + preco + " e a região de procedência é: Sul");
            System.out.printf("O custo total do produto é: %.2f\n", custo);
        }else if (cod == 3 || cod >= 10 && cod <=15){
            frete = (float) (preco * (0.012));
            custo = (preco + frete);
            System.out.println("Valor do frete R$: " + frete);
            System.out.println("O produto custa: R$ " + preco + " e a região de procedência é: Leste");
            System.out.printf("O custo total do produto é: %.2f\n", custo);
        }else if (cod == 7 || cod == 20){
            frete = (float) (preco * (0.073));
            custo = (preco + frete);
            System.out.println("Valor do frete R$: " + frete);
            System.out.println("O produto custa: R$ " + preco + " e a região de procedência é: Oeste");
            System.out.printf("O custo total do produto é: %.2f\n", custo);
        }else {
            frete = (float) (preco * (0.222));
            custo = (preco + frete);
            System.out.println("Valor do frete R$: " + frete);
            System.out.println("O produto custa: R$ " + preco + " e a região de procedência é: IMPORTADO");
            System.out.printf("O custo total do produto é: %.2f\n", custo);
        }
    }
 }
