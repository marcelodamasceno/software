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
public class q15 {
    
    public static main(String aregs[]){
        
        Scanner sc = new Scanner(System.in);
        
     int area;
       int altura;
       int base;
    
    
    
       System.out.printf("infor a base do retangulo:  ");
       base = sc.nextInt();
       System.out.printf("infor a altura do retangulo:  ");
       altura = sc.nextInt();
        
       area = base * altura;
       
        System.out.printf("a area do retangulo em cm e: "+area );
              
    
    
    }    
}
