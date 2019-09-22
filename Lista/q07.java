

package Lista;

import java.util.Scanner;

  public class q07{
    
    public static void main(string args[]){
            
        Scanner sc = new Scanner(System.in);
        
        double valorProduto;    
        double valorPrestacao; 
        int parcelas = 5;          
        System.out.printf("Digite o valor da compra: ");          
        valorProduto = sc.nextDouble();         
        valorPrestacao = valorProduto / parcelas;   
        System.out.print("O valor de cada parcela é de: " +valorPrestacao+ "R$");       
    
      } 
  
  }
        
        
        
        
        
        


  