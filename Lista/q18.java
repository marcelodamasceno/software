/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lista;
import java.util.Scanner;  
  
/**
 *
 * @author macelo
 */
public class q18 {
     public static void main(String[] args) {  
        Scanner sc = new Scanner (System.in);  
        
       double salario;
       float percentual;
       double NovoSalario;
       
       System.out.printf("infoprme um salario: ");
       salario = sc.nextInt();
       
         System.out.printf("informe um percentual: ");
       percentual = sc.nextFloat();
       
       NovoSalario = salario+((percentual * salario)/100); 
       
       
       System.out.printf("o novo salario e: " +NovoSalario);
        
}
     
}
