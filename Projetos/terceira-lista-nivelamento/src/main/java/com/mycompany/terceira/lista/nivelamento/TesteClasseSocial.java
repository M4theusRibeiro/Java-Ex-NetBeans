/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terceira.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class TesteClasseSocial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClasseSocial calc = new ClasseSocial();
        
                
        System.out.println("Digite sua renda:");
        Double rendaPessoa = leitor.nextDouble();
        System.out.println("");
        Double qntSalariosMin = calc.calcularSalarioMinimo(rendaPessoa);
        System.out.println(String.format("Você recebe aproximadamente %.1f salários mínimos.",qntSalariosMin));
        System.out.println("");
        String classeSocial = calc.identificarClasseSocial(qntSalariosMin);
        System.out.println(String.format("Você pertence a classe social: %s", classeSocial));
    }
}
