/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

/**
 *
 * @author matheus
 */
public class DescontoProgressivo {

    Double calcularDesconto(Double valor, Integer quantidade) {
        valor *= quantidade;
        Double desconto;
        if (quantidade == 1) {
            desconto = 0.1;
        } else if (quantidade == 2) {
            desconto = 0.2;
        }else{
            desconto = 0.3;
        }
        Double valorComDesconto = valor - (valor*desconto);
        return valorComDesconto;
    }
    void exibirNotaFiscal(Double valorProduto, Integer quantidade, Double valorComDesconto){
        System.out.println(String.format(""
                + "-------------------------------\n"
                + "Valor do produto: R$%.2f\n"
                + "Quantidade: %d\n"
                + "-------------------------------\n"
                + "Valor com desconto: R$%.2f",valorProduto, quantidade, valorComDesconto));
    }
}
