package auladevetores;
/**
 * @author sosthenesms-drake
 */
public class FatoriaisDeUmAdez {
    /**
     * Imprimir os fatorias de 01 a 10
     */
    public static void main(String[] args) {
       int fatorial = 1; 
        for(int n = 1; n <= 10; n++){
            fatorial *= n;
            System.out.println(" O fatorial de " + n + " é " + "(" + (n-1) + "!) * " + n + " = " + fatorial);
        }
    }
}

