package jogonumerico;

import java.util.*;


/* Joguinho para adivinhar o número pensado pela máquina usando o operador ternário
 */

public class JogoNumerico{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
        System.out.println("==== Joguinho para advinhar o número pensado pela máquina ====");
        double m = 1 + Math.random() * (10-0);
        int a = (int) m;
        System.out.print("Digite um número entre 0 e 10: ");
        int b = in.nextInt();
        String f1 = "Acertou! Eu pensei em " + a;
        String f2 = "Você errou! Eu pensei em " + a;
        String res = (b == a)? f1:f2;
        System.out.println(res);

    }
 }
