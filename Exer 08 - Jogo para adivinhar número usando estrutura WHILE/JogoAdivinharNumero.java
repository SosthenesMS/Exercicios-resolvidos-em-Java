package jogoadivinharnumero;

import java.util.Scanner;

/**
 * @author sosthenesms-drake
 */
public class JogoAdivinharNumero {

    /*Jogo para adivinhar o número pensado pela máquina usando estrutura de repetição while
     */
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        
        System.out.println("=== Jogo para adivinhar o número pensado pela máquina ===");
        System.out.println("Oi, eu sou Eliot e vou pensar em um número entre \"0 e 10\", tente adivinhar!");
        int a = 0;
        int b = -1;
        while (a != b){
            double r = (0 + Math.random() * (10-0));
            a = (int) r;
            System.out.print("Digite seu palpite: ");
            b = in.nextInt();
            String resp = (a == b)? "Você acertou! O número que eu pensei foi " + a + "\n": "Você errou... O número que eu pensei foi: " + a + "\n";
            System.out.println(resp);
            
            in.nextLine(); //Realizando a limpeza do buffer antes da leitura de string
            
                String resposta = "";
                while (!resposta.equals("S") || !resposta.equals("s")){
                    System.out.print("Deseja jogar novamente (S/N)...? ");
                    resposta = in.nextLine();
                    if (resposta.equals("S") || resposta.equals("s")){
                    System.out.println("");
                    break; // finalizar o while
                    }else if (resposta.equals("N") || resposta.equals("n")){
                    System.out.println("Obrigado por jogar comigo! Até mais!!");
                    System.exit(0); // finaliza o programa todo
                    }
                }
         b = -1; //Alterando o valor de b para satisfazer a codição do primeiro while e assim recomeçar o programa       
        }
    }
}
