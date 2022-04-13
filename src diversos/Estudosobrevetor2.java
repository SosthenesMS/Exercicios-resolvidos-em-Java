import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
        
        int vet[] = {10, 55, 70, 32, 15, 4, 2};
        
       // System.out.println(vet.length);
       
       Arrays.sort(vet);
       System.out.println("Informações do vetor: ");
       for(int i =0; i < vet.length; i++){
       System.out.println("Na posição " + i + " temos o valor " + vet[i]);
    }
    System.out.println(Arrays.binarySearch(vet, 32));
    
  } 
}
