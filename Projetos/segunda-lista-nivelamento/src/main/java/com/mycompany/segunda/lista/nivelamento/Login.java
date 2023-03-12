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
public class Login {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String loginCerto = "admin";
        String senhaCerta = "#SPtech2022";
        String loginDigitado = "";
        String senhaDigitada = "";

        while (!loginCerto.equals(loginDigitado) && !senhaCerta.equals(senhaDigitada)) {

            System.out.println("Digite o nome de usuário:");
            loginDigitado = leitor.nextLine();
            System.out.println("Digite a senha:");
            senhaDigitada = leitor.nextLine();

            if (!loginCerto.equals(loginDigitado) || !senhaCerta.equals(senhaDigitada)) {
                System.out.println("Login e/ou senha inválidos");

            }
        }

        System.out.println("Login realizado com sucesso!");

    }

}
