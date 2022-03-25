package pesoideal;

import java.util.*;


/* Para homens, peso ideal = (72,7 * h) - 58
 * Para mulheres, peso ideal = (62,1 * h) - 44,7.
 */

public class PesoIdeal{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float h, res;
        String sexo;
        System.out.print("Informe seu sexo (M/F......: ");
        sexo = in.nextLine();
        System.out.print("Informe a sua altura (em metros): ");
        h = in.nextFloat();
        if (sexo.equals("M") || sexo.equals("m")){
            res = (float) ((72.7 * h)-58);
            System.out.printf("Peso ideal %.2f kgs\n",res);
        }else{
            res = (float) ((62.1 * h)- 44.7);
            System.out.printf("Peso ideal %.2f kgs\n",res);
        }
    }
 }
