package numeromaiorque10;
import java.util.Scanner;

/**
 *
 * @author sosthenesms
 * Exercício 2: Escreva um programa em Java para ler um valor e escrever a mensagem “É MAIOR QUE
 *10!” se o valor lido for maior que 10, caso contrário escrever “NÃO É MAIOR QUE 10!”.
 * 
 */
public class NumeroMaiorQue10 {

    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        float a;
        
        System.out.println("-Programa para comparar números com 10-");
        System.out.print("Digite um número: ");
        a = x.nextFloat();
        
        if (a == 10){
            System.out.println("O NÚMERO É 10!");
        } if (a > 10){
            System.out.println("É MAIOR QUE 10!");
        } if (a < 10) {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
         
    }
    
}
