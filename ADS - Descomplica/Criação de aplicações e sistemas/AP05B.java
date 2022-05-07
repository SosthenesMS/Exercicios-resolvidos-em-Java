import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);	
	int op;
	double num;

	System.out.println("Opções:");
	System.out.println(" 1 - Calcular o dobro do número");
	System.out.println(" 2 - Calcular o triplo do número");
	System.out.print("Escolha uma opção: ");
	op = in.nextInt();
	System.out.print("Digite o número: ");
	num = in.nextInt();
	
	switch(op){
		case 1:
		num *= 2;
		break;
	
		case 2:
		num *= 3;
		break;
	}
	System.out.println("O Resultado é: " + num);	
	
	}
}