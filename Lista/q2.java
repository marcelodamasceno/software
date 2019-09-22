
package Lista;
import java.util.Scanner;
/**
 *
 * @author macelo
 */
      public class q2 {
    
          public static void main(String[] args){
         
       Scanner sc = new Scanner(System.in);
      
      double TaxaDeConsumo;
      double km1; 
      double km2; 
      double kmtotal;
      double litros;
      
          System.out.print("Informe o KM inicial: ");  
          km1 = sc.nextDouble();  
          System.out.print("Informe o KM final: " );  
          km2 = sc.nextDouble();        
          System.out.print("Informe a quantidade de litros consumidos:" );     
          litros = sc.nextDouble();         
          kmtotal = km2 - km1;      
          TaxaDeConsumo = kmtotal/litros;     
         

            System.out.print("O total percorrido foi de " +kmtotal+ "Km"); 
         
           System.out.print("A Taxa media de consumo é de" +TaxaDeConsumo+ "litros por km percorrido");
  
}
}
         