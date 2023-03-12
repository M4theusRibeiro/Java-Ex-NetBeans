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
public class SwitchCase {
    
    public static void main(String[] args) {
        //Digite um número que faça um print de qual dia da semana esse número representa.
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer numeroDigitado = leitor.nextInt();
        
        switch(numeroDigitado){
            case 1: System.out.println("Segunda"); 
            break; 
            case 2: System.out.println("Terçou");
            break; 
            case 3: System.out.println("Quartou");
            break; 
            case 4: System.out.println("Quintou");
            break; 
            case 5: System.out.println("Sextou");
            break; 
            
            default: System.out.println("Número inválido");
            break;
        }
    }
}
