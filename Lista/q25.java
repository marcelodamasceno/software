
package Lista;
 import java.util.Scanner;

public class q25 {
    
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        
        int AnoAtual;
        int AnodeNascimento;
        int idade;
        
        System.out.printf("\n informe O  AnoAtual: ");
        AnoAtual = sc.nextInt();
        
        System.out.printf("\n informe a AnodeNascimento: ");
       AnodeNascimento = sc.nextInt();
        
      AnoAtual = AnoAtual- AnodeNascimento;
      
        
       
        
     if (AnoAtual>=16){
         
       System.out.printf("\n ja pode votar esse Ano");
       
     }else
     {
         System.out.printf("\n nao e permitido votar esse Ano");
     }
       // System.out.printf("\n a media calculada e: "+media);
        
        
        
        
        
    }




}
