package operadorlogicooucomchar;

import java.util.*;
import java.io.*;

/* Exercício para realizar a leitura de dois valores numéricos e a leitura uma operação matemática como string
 * e calcula o valor e mostrar na tela.
 * Estamos testando com uso de dados do tipo char.
 */

public class OperadorLogicoOuComChar{

    public static void main(String[] args) throws IOException{
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite um nome: ");
        String nome = in.nextLine();
        
        System.out.print("Informe o sexo (M/F)...........:");
        char sexo = (char) System.in.read(); // Para realizar a leitura de um dado do tipo char é necessário usar o "System.in.read()";
        
        //O tipo de dado char é escrito ou lido com uma aspas simples conforme abaixo
        if ((sexo == 'M') || (sexo == 'm')){
            System.out.printf("Bem vindo sr. \"%s\" \n",nome);
        }else {
            System.out.printf("Bem vinda sra. \"%s\" \n",nome);
        }
    }
 }
