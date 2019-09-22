/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){   
Scanner sc = new Scanner(System.in);       
String nomeVendedor; 
double salarioFixo; 
double vendas; 
double comissao; 
double salarioFinal;     
System.out.print(" Digite o nome do vendedor:" ); 
nomeVendedor = sc.nextLine();  
System.out.print("Digite o salário fixo do vendedor:" );     
salarioFixo = sc.nextDouble();       
System.out.print("Digite o total de vendas efetuadas pelo vendedor:" );      
vendas = sc.nextDouble();       
  comissao = ( vendas * 15 ) / 100;       
 salarioFinal = comissao + salarioFixo;       
   System.out.print("Nome do Vendedor: " +nomeVendedor );
  System.out.print(" Salario Fixo: " +salarioFixo+  "reais");        

System.out.println("Salario Final: " +salarioFinal+ "reais");   

}

} 
     

