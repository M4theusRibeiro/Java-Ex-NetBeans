/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

/**
 *
 * @author matheus
 */
public class CalculoNutricao {
    void calculaIMC(Double peso, Double altura){
        Double imc = peso / (altura * altura);
        
        System.out.println(String.format("O imc dessa pessoa é: %.2f\n", imc));
    }
}
