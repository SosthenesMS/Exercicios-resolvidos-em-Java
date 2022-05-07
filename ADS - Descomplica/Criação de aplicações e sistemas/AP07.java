import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];
        double media;
        int soma=0;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite o nome do aluno numero " + (i+1) + " de 05 alunos: ");
            nomes[i] = in.next();
            System.out.print("Digite a nota do aluno numero " + (i+1) + " de 05 alunos: ");
            notas[i] = in.nextInt();
            soma += notas[i];
        }

        for(int j = 0 ; j < 5; j++){
            System.out.println("Índice: " + j + " Aluno(a): " + nomes[j] + " -Nota: " + notas[j]);
        }

        System.out.println(" ");
        media = (double) soma/notas.length;
        System.out.println("A média dos 05 alunos é: " + media);

    }
}
