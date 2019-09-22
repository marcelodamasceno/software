 
package Lista;
import java.util.Scanner;  
  
public class q17 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner (System.in);  
           int totaleleitores;
           int brancos ;
           int validos;
           int nulos;
           float percentual;
        System.out.println("Digite número o total de eleitores: ");
        totaleleitores = sc.nextInt();  
          
       System.out.println("Digite o número de votos brancos: ");
       brancos = sc.nextInt();  
          
        System.out.println("Digite o número de votos nulos: ");  
         nulos = sc.nextInt(); 
          
        System.out.println("Digite o número de votos válidos: ");  
         validos = sc.nextInt();  
          
         float percentualbrancos =(brancos*100)/totaleleitores;  
         float percentualnulos = (nulos*100)/totaleleitores ;  
         float  percentualvalidos =  (validos*100)/totaleleitores;  
          
          
        System.out.println("Percentual de votos BRANCOS em relação ao total de votos: "+percentualbrancos+"%");
        System.out.println("Percentual de votos NULOS em relação ao total de votos: "+percentualnulos+"%");
        System.out.println("Percentual de votos VÁLIDOS em relação ao total de votos: "+percentualvalidos+"%" );
    }  
  
}   