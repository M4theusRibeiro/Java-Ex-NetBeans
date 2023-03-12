/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao.continuada1.matheus.ribeiro;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class MatheusRibeiro {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Double saldoAtual = 0.0;

        String borda = "------------------------------";
        String borda2 = "---------------------------------";
        String menu = String.format(""
                + "%s\n"
                + "|    Sptech  Investimentos   |\n"
                + "%s\n"
                + "| Olá, o que deseja fazer:   |\n"
                + "%s\n"
                + "| 1 - Depositar              |\n"
                + "| 2 - Sacar                  |\n"
                + "| 3 - Simular rendimentos    |\n"
                + "| 0 - Sair                   |\n"
                + "%s", borda, borda, borda, borda);
        Integer escolhaMenu;
        do {
            System.out.println(menu);
            escolhaMenu = leitor.nextInt();
            if (escolhaMenu >= 1 && escolhaMenu <= 3) {
                switch (escolhaMenu) {
                    case 1:
                        System.out.println("Digite o valor do depósito:");
                        Double deposito = leitor.nextDouble();
                        if (deposito > 0) {
                            saldoAtual += deposito;
                            System.out.println(String.format("Depósito realizado - Saldo atual: R$%.2f\n", saldoAtual));
                        } else {
                            System.out.println("Valor inválido\n");
                        }
                        break;
                    case 2:
                        System.out.println("Digite o valor do saque:");
                        Double saque = leitor.nextDouble();
                        if (saque > 0 && saldoAtual > 0) {
                            saldoAtual -= saque;
                            System.out.println(String.format("Saque realizado - Saldo atual: R$%.2f\n", saldoAtual));
                        } else {
                            System.out.println("Valor inválido\n");
                        }
                        break;
                    case 3:
                        if (saldoAtual > 0) {
                            Double rendimento = saldoAtual * 0.1;
                            Double saldoProjetado = rendimento + saldoAtual;
                            System.out.println(String.format("%s\n| Saldo Atual: R$%.2f         |", borda2,saldoAtual));
                            for (int i = 1; i <= 12; i++) {
                                String simularRendimento = String.format("%s\n| Mês %d | Saldo Atual: R$%.2f |\n%s", borda2, i, saldoProjetado, borda2);
                                System.out.println(simularRendimento);
                                saldoProjetado += (saldoProjetado * 0.1);
                            }

                        } else {
                            System.out.println("Saldo zerado, opção inválida\n");
                        }

                        break;
                }
            }else if(escolhaMenu == 0){
                System.out.println("Até logo!");
            }else{
                System.out.println("Opção inválida\n");
            }

        } while (escolhaMenu != 0);
    }
}
