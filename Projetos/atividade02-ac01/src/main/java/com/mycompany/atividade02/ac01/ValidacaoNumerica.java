/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

/**
 *
 * @author matheus
 */
public class ValidacaoNumerica {
    void verificarPrimo(Integer numero){
        Integer vezesDividido = 0;
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                vezesDividido++;
            }
        }
        if(vezesDividido == 2){
            System.out.println(String.format("O número %d é primo\n", numero));
        }else{
            System.out.println(String.format("O número %d não é primo\n", numero));
        }
    }
}
