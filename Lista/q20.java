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
public class q20 {
    public static void main(String args[]){
       
     Scanner sc = new Scanner(System.in);
     
    int NumCarrosVendidos;
    double TotalVendas;
    double salariofixo;
    double comissao;
    double salariofinal;
 
    
    System.out.printf("informe o numero de carros vendidos: ");
    NumCarrosVendidos = sc.nextInt();
    
    System.out.printf("informe o numero de vendas: ");
    TotalVendas = sc.nextDouble();
    System.out.printf("informe o salario fixos: ");
    salariofixo = sc.nextDouble();
    System.out.printf("informe a comissao: ");
    comissao = sc.nextDouble();
    
    salariofinal = (NumCarrosVendidos*comissao)+(TotalVendas *0.05)+salariofixo;
    
    System.out.printf("o salario final e: "+salariofinal);
    
    }
}
