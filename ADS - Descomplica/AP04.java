import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
	int soma, num1, num2, num3, num4, num5;
	double media;
	
	System.out.println("Digite o primeiro número: ");
	num1 = in.nextInt();	
	System.out.println("Digite o primeiro número: ");
	num2 = in.nextInt();	
	System.out.println("Digite o primeiro número: ");
	num3 = in.nextInt();
	System.out.println("Digite o primeiro número: ");
	num4 = in.nextInt();
	System.out.println("Digite o primeiro número: ");
	num5 = in.nextInt();
	
	soma = (num1+num2+num3+num4+num5);
	media = soma/5;
	System.out.println("A soma é: " + soma);
	System.out.println("A média é: " + media);

	}
}