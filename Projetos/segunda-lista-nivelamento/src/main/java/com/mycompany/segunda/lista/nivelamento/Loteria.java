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
public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número entre 0 e 10");
        Integer numeroDigitado = leitor.nextInt();
        Integer numeroSorteado = -1;
        Integer tentativas = 0;
        while (numeroDigitado != numeroSorteado){
            numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
            String frase = String.format("O número sorteado foi %d", numeroSorteado);
            System.out.println(frase);
            tentativas++;
        }
        
        if(tentativas <= 3){
            System.out.println("Você é MUITO sortudo");
            
        }else if(tentativas >= 4 && tentativas <= 10){
            System.out.println("Você é sortudo");
        
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
    }
}
