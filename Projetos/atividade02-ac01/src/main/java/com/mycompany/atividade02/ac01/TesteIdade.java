/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class TesteIdade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Idade idade = new Idade();
        
        System.out.println("Digite sua idade:");
        Integer idadePessoa = leitor.nextInt();
        
        idade.classificaIdade(idadePessoa);
        
    }
}
