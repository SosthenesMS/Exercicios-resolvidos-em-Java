package tabuada
import java.util.Scanner;

public class Tabuada {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nexInt();
		for (int i = 0; i <= 10; i++){
		System.out.println(a + " x " + i + " = " + (a*i));
    }
  }		
}