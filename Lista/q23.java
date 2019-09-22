


package macas;
import java.util.Scanner;





public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double macas = 1.30;
        int quantMacas ;
        double mult;

        System.out.printf("Digite a quantidade de macas: ");
        quantMacas = sc.nextInt();

        if (quantMacas < 12) {
            
            mult = (quantMacas * 1.30); 
        }else
        
            { 
                mult =( quantMacas * 1.00);
            }

        System.out.printf("o valor a ser pago é: R$ " + mult);
       
    }
}
