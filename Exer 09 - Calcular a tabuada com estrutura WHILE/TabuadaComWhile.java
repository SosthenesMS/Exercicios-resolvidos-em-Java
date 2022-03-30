package tabuadacomwhile;

import java.util.Scanner;

/**
 *
 * @author sosthenesms-drake
 */
public class TabuadaComWhile {

    /*Criação de um programa para calcular a tabuada e ao final perguntar se o usuário deseja realizar uma nova consulta
     * 
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("=== Programa para calcular a tabada! ===");
        int z = 1;
        while (z!=0){
                
            System.out.print("Digite um nḿero para calcular: ");
            int a = in.nextInt();
            System.out.println("\nA tabuada de " + a + " é: ");
            for (int i = 0; i<= 10 ; i++){
           
            System.out.println(a + " x " + i + " = " + (i*a));
            }
            
            in.nextLine(); // Limpeza do buffer
            
            String resp = ""; // criação da variável para a nova repetição da pergunta final
            while (!resp.equals("S") || !resp.equals("s")){
               System.out.print("\nDeseja fazer uma nova consulta (S/N)...? ");
               resp = in.nextLine(); 
                if (resp.equals("S") || resp.equals("s")){
                    System.out.println("");
                    break; //Finaliza o while e retorna para a primeira repetição
                }else if (resp.equals("N") || resp.equals("n")){
                    System.out.println("Até mais!");
                    System.exit(0); //Finaliza o programa inteiro
                }
            }
         
        }
        
        
    }
    
}
