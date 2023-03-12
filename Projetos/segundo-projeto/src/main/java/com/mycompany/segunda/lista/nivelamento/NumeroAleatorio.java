/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segunda.lista.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author matheus
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
     
        //No java temos a classe Math.random
        //Mas precisamos criar objeto, tipo scanner
        
        //Inteiro aleatório:
        Integer numeroInteiroAleatorio = ThreadLocalRandom.current().nextInt(0, 2);
        System.out.println("Aleatório inteiro: "+ numeroInteiroAleatorio);
        
        Double numeroQuebradoAleatorio = ThreadLocalRandom.current().nextDouble(0, 10);
        String frase = String.format("Esse é o número quebrado : %.3f", numeroQuebradoAleatorio);
        System.out.println(frase);
    }
}
