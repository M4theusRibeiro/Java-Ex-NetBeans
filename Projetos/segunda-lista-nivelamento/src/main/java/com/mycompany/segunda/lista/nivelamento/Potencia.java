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
public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer base;
        Integer expoente;
        
        do{
            System.out.println("Digite um número inteiro para ser a base:");
            base = leitor.nextInt();
          
        }while(base <= 0);
       
        do{
            System.out.println("Digite um número inteiro para ser o expoente:");
            expoente = leitor.nextInt();
            
        }while(expoente <= 0);
        
        Integer potencia = base;
        
        for(int i = 1; i<expoente;i++){
            potencia *= base;
            
        }
        System.out.println(potencia);
    }
}
