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
public class TesteCalculoAluno {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        CalculoAluno calc = new CalculoAluno();
        
        System.out.println("Digite a primeira nota: ");
        Double nota01 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        Double nota02 = leitor.nextDouble();
        
        Double media = calc.calcularMedia(nota01, nota02);
        System.out.println("Sua média é:" + media);
        
                
        
    }
}
