package tipodetriangulo;
import java.util.*;

/**
 *
 * @author sosthenesms-drake
 */
public class TipoDeTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int A, B, C;
        
        System.out.println("=== Tipos de triângulo ===");
        System.out.println("Digite os três lados de um triângulo");
        System.out.print("Lado A: ");
        A = in.nextInt();
        System.out.print("Lado B: ");
        B = in.nextInt();
        System.out.print("Lado C: ");
        C = in.nextInt();
        
        if (A == B && A == C){
            System.out.println("Triângulo Equilátero! *Possui todos os lados iguais*");
        }else if (A != B && A != C && C != B){
            System.out.println("Triângulo Escaleno! *Possui todos os lados diferentes*");
        }else if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)){
            System.out.println("Triângulo Isósceles! *Possui dois lados iguais* ");
        }else{
            
        }
    }
    
}

