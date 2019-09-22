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
public class q24 {
    
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        
        int nota1;
        int nota2;
        float media;
        
        System.out.printf("informe a  nota1: ");
        nota1 = sc.nextInt();
        
        System.out.printf("informe a  nota2: ");
        nota2 = sc.nextInt();
        
        
        media = (nota1+nota2)/2;
        
     if (media > 6){
         
       System.out.printf("\n aluno aprovado na media");
       
     }else
     {
         System.out.printf("\n aluno reprovado na media");
     }
        System.out.printf("\n a media calculada e: "+media);
        
        
        
        
        
    }




}
