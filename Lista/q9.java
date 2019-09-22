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
public class q9 {
    public static void main(String args[]){
    
     Scanner sc = new Scanner(System.in);
    
           double custoFabrica;
           double custoConsumidor;
           double porcentagemDistribuidor = 28.0;
           double PercentualImpostos = 45.0;
           double Destribuidor;
           double ValorImpostos;
 
        System.out.printf("Informe o custo de fábrica de um carro novo: ");
              custoFabrica = sc.nextDouble();
       
                ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
 
               Destribuidor = ((custoFabrica + PercentualImpostos) * porcentagemDistribuidor) / 100.000;
 
              custoConsumidor = (Destribuidor + ValorImpostos);
 
        System.out.println("O custo ao consumidor de um carro novo é: " + custoConsumidor);
    }
} 

