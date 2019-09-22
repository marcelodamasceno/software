import java.util.Scanner;

 package Lista;

  public class q7{
    public static void main(String args[]){

     
     Scanner sc = new Scanner(System.in);
        
        double valorProduto;    
        double valorPrestacao; 
        int parcelas = 5;          
        System.out.printf("Digite o valor da compra: ");          
        valorProduto = sc.nextDouble();         
        valorPrestacao = valorProduto / parcelas;   
        System.out.printf("O valor de cada parcela é de: " +valorPrestacao+ "R$");       
    
            } 
     
}






    
   
            
        
  
  