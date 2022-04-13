import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
       
       int vet[] = {10, 55, 70, 32, 15, 4, 2};
       
       Arrays.sort(vet);
       
       System.out.println("Informações do vetor: ");
       for(int i =0; i < vet.length; i++){
           System.out.println("Na posição " + i + " temos o valor " + vet[i]);
       }
       
       Arrays.sort(vet);
       
       System.out.println("O vetor completo é: ");
       for (int z = 0; z < vet.length; z++){
           System.out.print(vet[z] + " ");
       }
       
       System.out.println(""); // Pular uma linha
       int p = Arrays.binarySearch(vet, 15); // Para usar o binarySearch é preciso antes ordenar os valores com o Arrays.sort();  
       System.out.println("O valor 15 está na posição: " + Arrays.binarySearch(vet, 15));
       System.out.println("Encontrei o valor na posição: " + p);
       
       
       
       
       
       /* 
        int num[] = {3, 5, 1, 8, 4};
        int pos = Arrays.binarySearch(num, 1);
        System.out.println(pos);
        */
        /*
        Arrays.sort(num);
        for(int x: num){
            System.out.print(x + " ");
        }
        */
        
        /*
        Scanner in = new Scanner(System.in);
        int vet[] = {2, 5, 4, 1, 3, 0};
        //int x = 0;
        //int posicao = Arrays.binarySearch(vet, 5);
        
        System.out.println("informações do vetor: ");
        for(int i = 0; i < vet.length; i++){
            System.out.println("Na posição " + i + " temos o valor: " + vet[i]);
        }
       
       System.out.println("===========================");
       System.out.println("Neste vetor temos " + vet.length + " posições");
       System.out.print("O vetor completo é: ");
       for (int x = 0; x < vet.length; x++){
           System.out.print(vet[x] + " ");
       }
       System.out.println();
       System.out.print("O vetor completo ordenado é: ");
       Arrays.sort(vet);
       for (int y = 0; y < vet.length; y++){
           System.out.print(vet[y] + " ");
       }
       
        System.out.println();
        System.out.println("Digite um número para eu localizar dentro do vetor: ");
        int numero = in.nextInt();
        Arrays.sort(vet);
        int posicao = Arrays.binarySearch(vet, numero);
        System.out.println("O número está na posição " + posicao);
        //System.out.println("Encontrei na posição: " + posicao);
       // System.out.println("O valor é: " + vet[1]);
       */
    }
}