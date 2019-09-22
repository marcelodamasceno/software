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
public class q14 {
    
    
    


    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
      int  antecessor,sucessor;
      int num = 0 ;
      // int aux;
      
         
         
          System.out.printf("informe um numero: ");
           num = sc.nextInt();
           antecessor = num - 1;
          sucessor =   num + 1;
        System.out.printf("\n o antecessor do "+num+ "\n e: " +antecessor);
        System.out.printf("\n o sucessor do " +num+ "\n e: " +sucessor);
    
    
        }
  
  }