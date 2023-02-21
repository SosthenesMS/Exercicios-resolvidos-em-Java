import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int num1, num2;
	
	System.out.println("Digite dois números: ");
	num1 = in.nextInt();
	num2 = in.nextInt();
	
	if(num1 < num2){
		System.out.println("O número maior é: " + num2);
	}else{
		System.out.println("Os dois números são: " + num1 + " e " + num2);
	}

	}
}