/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author matheus
 */
public class Calculadora {
    
    Double somar(Double numero01, Double numero02){
        
        return numero01+numero02;
    }
    
    Double somar(Double numero01, Double numero02, Double numero03){
        
        return numero01+numero02+numero03;
    }
    
    void exibirSoma(Double numero01, Double numero02){
        
        System.out.println(numero01 + numero02);
    }
    
    //Faça os métodos para divisão, subtração e multiplicação
    //Com retorno
    
    Double dividir(Double numero01, Double numero02){
        
        return numero01/numero02;
    }
    
    Double subtrair(Double numero01, Double numero02){
        
        return numero01-numero02;
    }
    
    Double multiplicar(Double numero01, Double numero02){
        
        return numero01*numero02;
    }
}
