/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Teste {
    public static void main(String[] args) {
        String nome01 = "Matheus";
        String nome02 = "Ribeiro";
        
        // Para ter acesso aos métodos
        // precisamos criar um objeto da classe
        // onde esse método foi criado
        // Instânciar para transformar em objeto
        
        Utilitaria util = new Utilitaria();
        Calculadora cal = new Calculadora();
        Scanner leitor = new Scanner(System.in);
        
        //Chamar método = invocar
        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);
        
        //Usando a calculadora
        Double soma = cal.somar(10.0, 32.0);
        Double subtracao = cal.subtrair(10.0, 32.0);
        Double divisao = cal.dividir(10.0, 32.0);
        Double multiplicacao = cal.multiplicar(10.0, 32.0);
        
        System.out.println("Soma: "+soma);
        System.out.println("Subtrair: "+subtracao);
        System.out.println("Dividir: "+divisao);
        System.out.println("Multiplicar: "+multiplicacao);
        
        
        
    }
}
