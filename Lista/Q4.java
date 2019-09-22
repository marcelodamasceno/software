
package Lista;
import java.util.Scanner;

 
    public class q4{
   
     public static void main(String args[]) {    
         Scanner sc = new Scanner(System.in); 
         double C, F;         
         System.out.printf("Digite a temperatura em Graus Celsius:" );        
         C = sc.nextDouble();         
         F = ( 9*C + 160 )/5;          
         System.out.printf(" A temperatura convertida para Fahrenheit é:" +F);   
         
     }  
}
