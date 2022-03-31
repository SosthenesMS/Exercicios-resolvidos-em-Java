package tabuadacomdowhile;

import java.util.Scanner;

/**
 *
 * @author sosthenesms-drake
 */
public class TabuadaComDoWhile {

    /*Criação de um programa para calcular a tabuada e ao final perguntar se o usuário deseja realizar uma nova consulta
     * 
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int z;
        String resp;
        
        do{
            System.out.print("Digite um número: ");
            z = in.nextInt();
            for(int c=0; c<=10; c++){
                int t = z*c;
                System.out.println(z +" x " + c + " = " + t);
            }
            System.out.print("Deseja continuar [S/N]? ");
            resp = in.next();
        }while (resp.equals("S") || resp.equals("s"));
        
        System.out.println("Obrigado!");
    }
    
}

