package equacaosegundograu;

import java.util.*;

//Programa para calcular uma equação do segundo grau e exibir os valores das duas raízes
public class EquacaoSegundoGrau{

    public static void main(String[] args) {
    
        // x²+bx+c=0  // formula de bhaskara: x = -b +- raiz delta / 2a  // delta = b² - 4ac
	Scanner in = new Scanner(System.in);
	double a, b, c, delta, R1, R2;
        System.out.println("=== Equação do segundo grau ===");
        System.out.println("Digite os valores de a, b e c respectivamente: ");
        System.out.print("a = ");
	a = in.nextDouble();
	System.out.print("b = ");
        b = in.nextDouble();
	System.out.print("c = ");
        c = in.nextDouble();
	delta = Math.pow(b,2)-(4*a*c);
	
	if ((a == 0) || (delta < 0)){
	    System.out.println("Impossivel calcular");
	}else{
            
	R1 = (-b + (Math.sqrt(delta))) / (2*a);
        R2 = (-b - (Math.sqrt(delta))) / (2*a);
            System.out.println("As raízes possíveis para a equação " + a + "x²" + " + " + b+"x"+ " + " + c + " = 0 " + "são:");
            System.out.printf("R1 = %.5f \nR2 = %.5f \n", R1, R2);
        
       }
    }
}
