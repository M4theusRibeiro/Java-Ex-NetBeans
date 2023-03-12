/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer opcaoEscolhida;
        String frase = String.format("Digite o número correspondente a operação desejada:\n\n"
                + " 1 - Soma\n 2 - Multiplicação\n 3 - Divisão\n 4 - Subtração\n 5 - Potencia\n 6 - Resto de divisão\n 0 - Sair");
        do {
            System.out.println(frase);
            opcaoEscolhida = leitor.nextInt();
            
            if (opcaoEscolhida >= 1 && opcaoEscolhida <= 6) {
                System.out.println("Digite um número inteiro:");
                Double numeroDigitado = leitor.nextDouble();
                System.out.println("");
                
                switch (opcaoEscolhida) {
                    case 1:
                        for(double i = 1; i<=10;i++){
                            Double calculo = numeroDigitado + i;
                            System.out.println(String.format("%.0f + %.0f = %.0f", numeroDigitado, i, calculo)); 
                        }
                        System.out.println("");
                        break;
                    case 2:
                         for(double i = 1; i<=10;i++){
                            Double calculo = numeroDigitado * i;
                            System.out.println(String.format("%.0f * %.0f = %.0f", numeroDigitado, i, calculo)); 
                        }
                        System.out.println("");
                        break;
                    case 3:
                         for(double i = 1; i<=10;i++){
                            Double calculo = numeroDigitado / i ;
                            System.out.println(String.format("%.0f / %.0f = %.0f", numeroDigitado, i, calculo)); 
                        }
                        System.out.println("");
                        break;
                    case 4:
                        for(double i = 1; i<=10;i++){
                            Double calculo = numeroDigitado - i;
                            System.out.println(String.format("%.0f - %.0f = %.0f", numeroDigitado, i, calculo)); 
                        }
                        System.out.println("");
                        break;
                    case 5:
                        for(double i = 1; i<=10;i++){
                            Double calculo = Math.pow(numeroDigitado, i);
                            System.out.println(String.format("%.0f ^ %.0f = %.0f", numeroDigitado, i, calculo)); 
                        }
                        System.out.println("");
                        break;
                    case 6:
                        for(double i = 1; i<=10;i++){
                            Double calculo = i % numeroDigitado;
                            System.out.println(String.format("%.0f / %.0f = %.0f", numeroDigitado, i, calculo)); 
                        }
                        System.out.println("");
                        break;
                }
            } else if(opcaoEscolhida == 0){
        
        
        }else {
                System.out.println("Opção inválida, tente novamente");
            }
        } while (opcaoEscolhida != 0);
        System.out.println("Até logo!");
    }
}
