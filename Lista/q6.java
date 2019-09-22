package Lista;

 import java.util.Scanner; 


public class questao6{ 

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
       
        double deposito; 
        double juros; 
        double rendimento; 
   
    System.out.printf("Digite o valor do deposito:" );    
    deposito = sc.nextDouble();        
     juros = ( deposito * 0.70 ) / 100;
     rendimento = juros + deposito;         
   System.out.printf("O rendimento da poupança no mês foi de " +rendimento+ "R$");    
    
    
    }
    
}