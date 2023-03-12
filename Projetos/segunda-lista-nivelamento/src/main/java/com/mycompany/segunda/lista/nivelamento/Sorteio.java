/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segunda.lista.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author matheus
 */
public class Sorteio {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 100");
        Integer numeroDigitado = leitor.nextInt();
        Integer primeiroNumero = 0;
        Integer numeroPar = 0;
        Integer numeroImpar = 0;
        
        
        for(Integer i = 0; i <= 200; i++){
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0,numeroDigitado);
            
            if(i.equals(0)){
                primeiroNumero = numeroSorteado;
                
            }else if(numeroSorteado % 2 == 0){
                numeroPar++;
            }else{
                numeroImpar++;
            }
        }
        
        String frase = String.format("O primeiro número que foi sorteado foi o número: %d. "
                + "Foram sorteados %d números pares e %d números impares", primeiroNumero, numeroPar, numeroImpar);
        System.out.println(frase);
    }
}
