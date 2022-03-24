package exercicionmero12;

import java.util.*;

/* Exercício para realizar a leitura de dois valores numéricos e a leitura uma operação matemática como string
 * e calcula o valor e mostrar na tela.
 */

public class ExercicioNumero12{

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        float x, y, res;
        
        System.out.println("Escreva dois números: ");
        x = in.nextFloat();
        y = in.nextFloat();
        
        in.nextLine(); //Realizando a limpeza de buffer antes da leitura de valores string
        
        System.out.println("Informe a operação que deseja: (ex: '+' '-' 'x' '/') ");
        String op = in.nextLine();
        
            if (op.equals("/")){
                res = x/y;
                System.out.println("A divisão é: " + res);
            }else if (op.equals("+")){
                res = x+y;
                System.out.println("A soma é: " + res);
            }else if(op.equals("-")){
                res = x-y;
                System.out.println("A diferença é: " + res);
            }else if (op.equals("*")){
                res = x*y;
                System.out.println("A multiplicação é: "+ res);
            }
        }
    }
