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
public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica validacao = new ValidacaoNumerica();
        Integer numero = 0;
        System.out.println("Seja bem vindo(a)! Quando quiser parar o programa, digite um número negativo!");
        do {
            System.out.println("Digite um número para ver se ele é primo:");
            numero = leitor.nextInt();
            validacao.verificarPrimo(numero);
        } while (numero >= 0);
        
    }
}
