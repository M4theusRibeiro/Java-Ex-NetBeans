/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segunda.lista.nivelamento;

import java.util.Scanner;


/**
 *
 * @author matheus
 */
public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
//        for(int i = 0; i <= 10; i++){
//            System.out.println(i);
//        }
//        for(int i = 10; i >= 0; i--){
//            System.out.println(i);
//        }
        int i = 0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        
        System.out.println("while - Adivinhe o número");
        System.out.println("Digite um número:");
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != 42){
            System.out.println("Adivinhe um número:");
            numeroDigitado = leitor.nextInt();
        }
        System.out.println("Acertou!");
//        
        
        System.out.println("do while - Adivinhe o número");
        Integer numeroDigitado2;
        do {
            System.out.println("Adivinhe um número:");
            numeroDigitado2 = leitor.nextInt();
        }while(numeroDigitado2 != 42);
        System.out.println("Acertou!");
    }
}
