package exercico07apostilajavacaelum;
import java.util.*;
/**
 *
 * @author sosthenesms-drake
 */
public class Exercicio07apostilaJavaCaelum {

    /**
     * Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um
     *	novo x de acordo com a seguinte regra:
     *	Se x é par, x = x / 2 ;	
     *	Se x é impar, x = 3 * x + 1 ;
     *	Imprime x até tiver o valor de 01.
     */
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       int x = in.nextInt();
 
       while(x > 1){
           if (x % 2 == 0){
               x /= 2;
           }else if (x % 2 != 0){
               x = x*3 + 1;
           }
           
           System.out.print(x + " ");
       }
       
    }
    
}

