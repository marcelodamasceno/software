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
public class q22 {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int num;
    int Positivo;
    int Negativo;
    
    System.out.printf("\n informe um numero: ");
    num = sc.nextInt();
    
    if(num>=0){
    
    System.out.printf("\n o numero digitado "+num+"\n e Positivo ");
    }else{
    System.out.printf("\n o numero e que foi digitado "+num+ "\n e Negativo");
   }
}

}