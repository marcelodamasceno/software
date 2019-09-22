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
public class q21 {
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int num;
    int maior;
    int menor;
    
    System.out.printf("\n informe um numero: ");
    num = sc.nextInt();
    
    if(num > 10){
    
    System.out.printf("\n o numero e maior do que 10 ");
    }else{
    System.out.printf("\n o numero e menor do que 10");
   }
}

}