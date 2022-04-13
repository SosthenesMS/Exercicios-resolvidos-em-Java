package multiplosdetres;
import java.util.*;
/

// Imprima todos os múltiplos de 3, entre 1 e 100
public class MultiplosDeTres{

    public static void main(String[] args) {
        
        int multiplos = 1, x = 1; // Inicializa as variáveis fora do laço para poder usá-las
        for(int i = 1; i <= 100; i++){
           multiplos = x * 3;
           System.out.println(multiplos);
           x++;
           if (multiplos >100){ // Se os múltiplos forem maiores que o nosse intervalo de 01 a 100 - finaliza o programa
               break;
           }
            
        }
    }
}
