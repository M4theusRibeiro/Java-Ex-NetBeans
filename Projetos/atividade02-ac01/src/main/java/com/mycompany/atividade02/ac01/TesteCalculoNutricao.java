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
public class TesteCalculoNutricao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoNutricao calculo = new CalculoNutricao();
        Integer escolha = 0;
        System.out.println("Seja bem vindo(a)! Quando quiser parar o programa, digite 0!");

        do {
            System.out.println("Digite sua altura:");
            Double altura = leitor.nextDouble();
            System.out.println("Digite seu peso:");
            Double peso = leitor.nextDouble();

            calculo.calculaIMC(peso, altura);
            System.out.println("Deseja calcular o imc de outra pessoa?");
            escolha = leitor.nextInt();
        } while (escolha != 0);

    }
}
