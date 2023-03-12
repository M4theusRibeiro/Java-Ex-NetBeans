/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo desconto = new DescontoProgressivo();
                
        System.out.println("Bem vindo ao sistema de desconto progressivo!\n");
        System.out.println("Digite o valor unitário do produto:");
        Double precoProduto = leitor.nextDouble();
        System.out.println("Digite a quantidade:");
        Integer quantidade = leitor.nextInt();
        
        Double valorComDesconto = desconto.calcularDesconto(precoProduto, quantidade);
        desconto.exibirNotaFiscal(precoProduto, quantidade, valorComDesconto);
        
        
      } 
   
}
