/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.Scanner;


public class q1 {
   
    public static void main(String args[])    {
        Scanner sc = new Scanner(System.in);
        double x, y; 
        
       double soma, subt, div, mult; 
    
    System.out.print("Digite o primeiro número:" ); 
    x = sc.nextDouble();     
    
    System.out.print("Digite o segundo número:" ); 
     y = sc.nextDouble();
    
      soma = x + y;      
      subt = x - y; 
      div = x / y;     
      mult = x * y;   
      
      
      System.out.print("A soma é:" +soma); 
              
              System.out.print("A subtração é:" +subt); 
              
               System.out.print("A divisão é:" +div);  
               System.out.print(" A multiplicação é:" +mult);
    }
}      
                   
 

