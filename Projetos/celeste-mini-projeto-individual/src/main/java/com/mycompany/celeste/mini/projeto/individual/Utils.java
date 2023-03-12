/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celeste.mini.projeto.individual;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author matheus
 */
public class Utils {

    String personagens = String.format(" 1 - Madeleine\n 2 - Badeleine\n 3 - Theo\n 4 - Oshiro\n 5 - Vovó\n");

    void ExibirBorda() {
        System.out.println(
                "——————————————————————————————————————————————————————————"
                + "————————————————————————————————————————————————————————"
                + "———————————————————————————————————————————————————————");
    }

    void ExibirMenuPrincipal() {
        String menuPrincipal = String.format(""
                + "O que deseja fazer agora?\n "
                + "1 - Ver quantos morangos você já consumiu na vida\n "
                + "2 - Abrir menu de personagens\n "
                + "3 - Exibir meu perfil\n "
                + "4 - Jogar \n "
                + "0 - Encerrar o programa");
        ExibirBorda();
        System.out.println(menuPrincipal);
        ExibirBorda();
    }

    String ExibirConsumoMorangos(Double totalMorangos, Integer idade) {
        Double kgMorangos = totalMorangos / 240;
        Double mediaMorangos = (totalMorangos / 10) / idade;

        String gostaDeMorango = mediaMorangos > 5 ? "Verdadeiro(a) apreciador(a) de morangos" : "Não gosta tanto assim";

        ExibirBorda();
        System.out.println(String.format(""
                + "Levando em consideração que uma porção de morango possui cerca de 240g e 10 unidades,"
                + "e por você ter %d de idade, durante todo o seu tempo de\nvida, você consumiu em média %.1f de produtos que possuem morango por ano e "
                + "cerca de %.2f kg de morango.\n"
                + "%s\n", idade, mediaMorangos, kgMorangos, gostaDeMorango));

        return gostaDeMorango;
    }

    void ExibirMensagemDigiteAlgo() {
        System.out.println("Por favor, digite algo e dê enter para continuar...");

    }

    void ExibirPerfil(String nome, String personagemFavorito, String gostaDeMorango, Double totalMorangos, Integer totalPontos) {
        ExibirBorda();
        System.out.println(String.format(""
                + "Exibindo perfil de %s:\n"
                + "Seu personagem favorito é: %s\n"
                + "Gosta de morango: %s\n"
                + "Comeu por volta de %.0f morangos durante a vida\n"
                + "Total de pontos: %d", nome, personagemFavorito, gostaDeMorango, totalMorangos, totalPontos));
        ExibirBorda();
        ExibirMensagemDigiteAlgo();
    }

    void ExibirMenuPersonagens() {
        ExibirBorda();
        System.out.println(String.format(""
                + "No jogo Celeste existem 5 personagens memóraveis, "
                + "escolha uma das opções abaixo e veja mais sobre os personagens.\n"
                + "%s"
                + " 6 - Escolher personagem favorito\n"
                + " 7 - Descobrir com qual personagem você se parece mais\n 0 - Voltar ao menu principal", personagens));
        ExibirBorda();
    }

    void ExibirMenuEscolhaPersonagem() {
        ExibirBorda();
        String menuEscolherPersonagem = String.format(""
                + "Qual dos cinco personagens você gostou mais?\n"
                + "%s "
                + "6 - Mudei de ideia, quero ler mais sobre eles antes\n "
                + "0 - Voltar ao menu principal", personagens);
        System.out.println(menuEscolherPersonagem);
        ExibirBorda();
    }

    Integer NovaRodada(Integer rodada) {
        System.out.println(String.format("Rodada %d:", rodada));
        Integer numeroAleatorioOperacao = ThreadLocalRandom.current().nextInt(1, 4);
        Integer numeroAleatorio1 = ThreadLocalRandom.current().nextInt(0, 100);
        Integer numeroAleatorio2 = ThreadLocalRandom.current().nextInt(0, 100);
        Integer resultado;
        //Soma
        if (numeroAleatorioOperacao.equals(1)) {
            resultado = numeroAleatorio1 + numeroAleatorio2;
            System.out.println(String.format("Digite a soma dos números a seguir:\n"
                    + "%s + %s = ?", numeroAleatorio1, numeroAleatorio2));
        } //Subtração
        else if (numeroAleatorioOperacao.equals(2)) {
            resultado = numeroAleatorio1 - numeroAleatorio2;
            System.out.println(String.format("Digite a soma dos números a seguir:\n"
                    + "%s - %s = ?", numeroAleatorio1, numeroAleatorio2));
        } //        //Divisão
        //        else if (numeroAleatorioOperacao.equals(3)) {
        //            resultado = numeroAleatorio1 / numeroAleatorio2;
        //            System.out.println(String.format("Digite a soma dos números a seguir:\n"
        //                    + "%s / %s = ?", numeroAleatorio1, numeroAleatorio2));
        //        } //Multiplicação
        else {
            resultado = numeroAleatorio1 * numeroAleatorio2;
            System.out.println(String.format("Digite a soma dos números a seguir:\n"
                    + "%s * %s = ?", numeroAleatorio1, numeroAleatorio2));
        }

        return resultado;
    }
//    String VerificarAcerto(Integer resposta, Integer resultado) {
//
//    }
}
