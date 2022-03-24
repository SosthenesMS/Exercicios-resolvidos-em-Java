package operadorlogicoou;

import java.util.*;

/* Exercício para testar o operador lógico OU (||)
 */

public class OperadorLogicoOu {

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um nome: ");
        String nome = in.nextLine();
        
        System.out.println("Informe o sexo: (M / F)");
        String sexo = in.nextLine();
        
        if ((sexo.equals("M")) || (sexo.equals("m"))){
            System.out.printf("Bem vindo sr. \"%s\" \n",nome);
        }else {
            System.out.printf("Bem vinda sra. \"%s\" \n",nome);
        }
    }
 }
