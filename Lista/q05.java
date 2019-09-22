 
 /*
 * Escreva um algoritmo que efetue a apresentação do valor da conversão em
real (R$) de um valor lido em dólar (US$).O algoritmo deverá solicitar o valor
da cotação do dólar e também a quantidade de dólares disponíveis com o
usuário.
 */package Lista;

 import java.util.Scanner;
      public class questao05{
         public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        double real;
        double dolar;
        double cotacao;
         
              System.out.printf("informe um valor pra o dolar: ");
               dolar = sc.nextDouble();
        
      
            System.out.printf("informe um valor pra a cotacao: ");
             cotacao = sc.nextDouble();
        
             real = dolar*cotacao;
        
           System.out.printf("valor convertido do dolar pra o real e: " +real+ " R$ ");
       
    }
}
