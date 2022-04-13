import java.util.Scanner;

public class ContarCaracteres {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String nome = in.nextLine();
        int total = nome.length();
        int totalsemespaco = nome.replace(" ","").length();
        System.out.println("O total de caracteres é: " + total);
        System.out.println("O total sem espaços é: " + totalsemespaco);
    }
}
