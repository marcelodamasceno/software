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
public class q16 {
   public static void main(String args[]){
       
       Scanner sc = new Scanner(System.in);
       
       int IdadeemDias;
       int anos,meses,dias;
       
                    System.out.printf("iforme a idade em anos: ");
                           anos = sc.nextInt();
                          System.out.printf("iforme a idade em meses: ");
                           meses = sc.nextInt();
                             System.out.printf("iforme a idade em dias: ");
                          dias = sc.nextInt();
                        IdadeemDias = anos * 365 + meses *30 + dias;
             System.out.printf("a idade em dias e: "+IdadeemDias);
       
       
       
   }
   
}
