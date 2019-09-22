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
public class q8 {
   public static void main(String args[]){
       
       Scanner sc = new Scanner(System.in);
       
        double PrecodoProduto;
        double ValordaVenda;
        double porcentagem;
       
       System.out.printf("informe o preco do produto: ");
       PrecodoProduto = sc.nextDouble();
       System.out.printf("informe o A PORCENTAGEM: ");
       porcentagem = sc.nextDouble();
       ValordaVenda = PrecodoProduto+(porcentagem*PrecodoProduto)/100;
       System.out.printf("o valor do produto e: "+ValordaVenda+ "valor");
      
       
       
       
   } 
}
