package numeropositivo;
import java.util.Scanner;
/**
 *
 * @author sosthenesms
 * Exercício 2: Escreva um programa em Java para ler um
 * valor e escrever se é positivo ou negativo (considere o valor zero como
 * positivo).
 * 
 */
public class NumeroPositivo {

 
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       float a;
        System.out.print("Digite um valor: ");
        a = x.nextFloat();
        
        if (a >= 0){
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número é negativo!");
        }
        
    }
    
}
