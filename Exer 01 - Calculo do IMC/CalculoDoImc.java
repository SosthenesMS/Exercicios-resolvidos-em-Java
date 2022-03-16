package calculodoimc;
import java.util.Scanner;
import java.lang.Math;

/** 
 * @author sosthenesms
 * Programa criado para calcular o IMC
 */
public class CalculoDoImc {

       
    public static void main(String[] args) {
        // Para calclar o IMC iremos realizar a seguinte expressão (PESO / ALTURA²)
        Scanner x = new Scanner(System.in);
        
        System.out.println("--- Programa para calcular o IMC! ---\n");
        System.out.print("Digite o seu peso em kg: ");
        float peso = x.nextFloat();
        System.out.print("Agora digite a sua altura: ");
        float altura = x.nextFloat();
        float res = (float) (peso / (Math.pow(altura,2))); 
        System.out.printf("O seu IMC é: %.2f kg/m²", res);
        
        if (res < 18.5){
            System.out.println(" - Abaixo do peso!\n");
            System.out.println("*Cálculos válidos para pessoas adultas\n");
            
            
        } if (res >= 18.5 && res <= 24.9){
            System.out.println(" - Peso ideal!\n");
            System.out.println("*Cálculos válidos para pessoas adultas\n");
            
            
        } if (res >= 25 && res <= 29.9){
            System.out.println(" - Você está sobre peso!\n");
            System.out.println("Atenção! Alguns quilos a mais já são suficientes para que algumas pessoas desenvolvam doenças associadas,\n"
                    + "como diabetes e hipertensão."
                    + " É importante rever seus hábitos.\n"
                    + "Procure um médico.\n");
            System.out.println("*Cálculos válidos para pessoas adultas\n");
            
        } if (res >= 30 && res <= 34.9){
            System.out.println(" - Você está com obesidade grau I!\n");
            System.out.println("Sinal de alerta! O excesso de peso é fator de risco para desenvolvimento de outros problemas de saúde.\n"
                    + "A boa notícia é que uma pequena perda de peso já traz benefícios à saúde.\n"
                    + "Procure um médico para definir o tratamento mais adequado para você.\n");
            System.out.println("*Cálculos válidos para pessoas adultas\n");
            
        } if (res >= 35 && res <= 39.9){
            System.out.println(" - Você está com obesidade grau II!\n");
            System.out.println("Sinal vermelho! Ao atingir este nível de IMC, o risco de doenças associadas está entre alto e muito alto."
                    + "Busque ajuda de um profissional de saúde; não perca tempo.\n"); 
            System.out.println("*Cálculos válidos para pessoas adultas\n");
            
        } if (res > 40){
            System.out.println(" - Você está com obesidade grau III!\n");
            System.out.println("Sinal vermelho! Ao atingir este nível de IMC, o risco de doenças associadas é muito alto."
                    + "Busque ajuda de um profissional de saúde; não perca tempo.\n");
            System.out.println("*Cálculos válidos para pessoas adultas\n");
            
        }  
        
        
        System.out.println("-Tabela geral dos valores do IMC: \n"
                + "Valores menores que 18,5 - Classificação: ABAIXO DO PESO\n"
                + "Valores entre 18,5 e 24,9 - Classificação: NORMAL\n"
                + "Valores entre 25,0 e 29,9 - Classificação: SOBRE PESO\n"
                + "Valores entre 30,0 e 34,9 - Classificação: OBESIDADE GRAU I\n"
                + "Valores entre 35,0 e 39,9 - Classificação: OBESIDADE GRAU II\n"
                + "Valores acima de 40,0 - Classificação: OBESIDADE GRAU III\n");
                
   }
}