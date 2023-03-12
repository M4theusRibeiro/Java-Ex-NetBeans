/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author matheus
 */
public class Utilitaria {
    // Método:
        //Retorno: esse não tem, é void!
        //Nome: exibirLinha (camelCase, igual variável)
        //Argumentos: dentro dos (), esse não tem
        //Corpo: dentro das {} 
    void exibirLinha(){
        //Código do método
        System.out.println("*-------------------------------------*");
    }
    
    void exibirNome(String nome){
        System.out.println("Meu nome é " + nome);
    }
         
    void exibirNomeFormatado(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
}
