/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celeste.mini.projeto.individual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author matheus
 */
public class Celeste {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Utils util = new Utils();

        //Dados do perfil 
        String personagemFavorito = "Nenhum personagem foi selecionado";
        String gostaDeMorango = "O teste ainda não foi feito";
        Double totalMorangos = 0.0;
        Integer totalPontos = 0;

        //Programa
        String borda = "0";
        String continuar = "";
        Integer opcaoEscolhida;
        Integer opcaoEscolhida2;

        util.ExibirBorda();
        System.out.println("Olá tudo bem? Qual o seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Quantos anos você tem?(Apenas números)");
        Integer idade = leitor.nextInt();
        util.ExibirBorda();
        System.out.println(String.format("    Seja bem vindo(a) %s!", nome));

        do {
            util.ExibirMenuPrincipal();
            opcaoEscolhida = leitor.nextInt();
            switch (opcaoEscolhida) {

                case 1:
                    System.out.println("Quantos produtos que possuem morango você acredita que já consumiu durante sua vida?");
                    Double respostaTotalProdutosMorango = leitor.nextDouble();
                    totalMorangos = respostaTotalProdutosMorango * 10;

                    gostaDeMorango = util.ExibirConsumoMorangos(totalMorangos, idade);
                    util.ExibirMensagemDigiteAlgo();
                    util.ExibirBorda();

                    continuar = leitor.next();

                    break;
                case 2:
                    do {
                        util.ExibirMenuPersonagens();
                        opcaoEscolhida2 = leitor.nextInt();

                        if (opcaoEscolhida2 >= 1 && opcaoEscolhida2 <= 7) {
                            switch (opcaoEscolhida2) {
                                case 1:
                                    util.ExibirBorda();
                                    System.out.println("A Madeleine é bem determinada e insistente, mesmo com muitas inseguranças ainda tem sua "
                                            + "coragem notada por outros personagens,\nalguns até a repreendendo e chamando-a de tola, avisando-a para parar antes "
                                            + "que ela se machuque. Ainda assim, ela continua em frente.\n");
                                    util.ExibirMensagemDigiteAlgo();
                                    util.ExibirBorda();

                                    continuar = leitor.next();
                                    break;
                                case 2:
                                    util.ExibirBorda();
                                    System.out.println("A Badeline é a parte insegura de Madeline, representando seus medos: SOLIDÃO, INADEQUAÇÃO,"
                                            + "FRACASSO e DESESPERANÇA.\nEla acredita em lidar com seus problemas de antemão, em vez de cometer erros e resolvê-los "
                                            + "mais tarde.\n");
                                    util.ExibirMensagemDigiteAlgo();
                                    util.ExibirBorda();
                                    continuar = leitor.next();
                                    break;
                                case 3:
                                    util.ExibirBorda();
                                    System.out.println("Theo é um jovem descontraído, amigável e despreocupado, com uma obsessão por mídia social. "
                                            + "Ele adora tirar fotos e só quer \nse divertir explorando a Montanha. Ele mostra maturidade para querer "
                                            + "tirar o máximo proveito de sua vida e atua como apoio\nemocional para Madeline durante a escalada.\n");
                                    util.ExibirMensagemDigiteAlgo();
                                    util.ExibirBorda();
                                    continuar = leitor.next();
                                    break;
                                case 4:
                                    util.ExibirBorda();
                                    System.out.println("O Oshiro é uma alma perdida que está preso a um hotel, ele acredita que o hotel é maravilhoso "
                                            + "mas ele precisa de ajuda para \nseguir em frente e não consegue reconhecer isso. "
                                            + "Ele representa a parte de você que não quer seguir em frente e esquecer o passado.\n");
                                    util.ExibirMensagemDigiteAlgo();
                                    util.ExibirBorda();
                                    continuar = leitor.next();
                                    break;
                                case 5:
                                    util.ExibirBorda();
                                    System.out.println("Sendo uma das únicas pessoas que moram na Montanha, a vovó demonstra um grande conhecimento\n"
                                            + "sobre a montanha e sempre alerta Madeleine sobre seus perigos. Sua atitude tende a ser despreocupada,\n"
                                            + "servindo principalmente como meio para Madeline desabafar sobre seus sentimentos.\n");
                                    util.ExibirMensagemDigiteAlgo();
                                    util.ExibirBorda();
                                    continuar = leitor.next();
                                    break;
                                case 6:
                                    Integer escolha;
                                    do {
                                        util.ExibirMenuEscolhaPersonagem();
                                        escolha = leitor.nextInt();

                                        switch (escolha) {
                                            case 1:
                                                personagemFavorito = "Madeleine";
                                                break;
                                            case 2:
                                                personagemFavorito = "Badeleine";
                                                break;
                                            case 3:
                                                personagemFavorito = "Theo";
                                                break;
                                            case 4:
                                                personagemFavorito = "Oshiro";
                                                break;
                                            case 5:
                                                personagemFavorito = "Vovó";
                                                break;
                                            case 6:
                                                System.out.println("Voltando para o menu anterior...");
                                                break;
                                            case 0:
                                                escolha = 0;
                                                opcaoEscolhida2 = 0;
                                                break;
                                            default:
                                                System.out.println("Escolha inválida");
                                                break;

                                        }
                                        if (escolha != 0 && escolha != 6) {
                                            String personagemSelecionado = String.format("Seu personagem favorito agora foi definido como: %s\n"
                                                    + "Voltando para o menu anterior\n", personagemFavorito);
                                            util.ExibirBorda();
                                            System.out.println(personagemSelecionado);
                                            util.ExibirMensagemDigiteAlgo();
                                            util.ExibirBorda();
                                            continuar = leitor.next();
                                            escolha = 6;
                                        } else if (escolha == 0) {
                                            util.ExibirBorda();
                                            System.out.println(String.format("Voltando para o menu principal\n"));
                                            util.ExibirMensagemDigiteAlgo();
                                            util.ExibirBorda();
                                            continuar = leitor.next();
                                        }
                                    } while (escolha != 0 && escolha != 6);

                                    break;
                                case 7:
                                    break;
                            }
                        } else if (opcaoEscolhida2 == 0) {
                        } else {
                            System.out.println(String.format("Essa opção não é valida"));
                        }
                    } while (opcaoEscolhida2 != 0);

                    break;
                case 3:
                    util.ExibirPerfil(nome, personagemFavorito, gostaDeMorango, totalMorangos, totalPontos);
                    continuar = leitor.next();
                    break;
                case 4:
                    System.out.println("Você é bom de matemática?\n"
                            + "Está começando agora o jogo para testar seu nivel!!\n"
                            + "A cada questão respondida certa, vocÊ ganha 10 pontos!\n"
                            + "A cada 5 questões certas você ganha 100 pontos bonus\n"
                            + "Você terá 3 vidas, caso erre 3 vezes você perde."
                            + "A cada 200 pontos você ganha uma vida extra");
                    util.ExibirBorda();
                    System.out.println("JO jogo está começando!!");
                    util.ExibirBorda();
                    Integer vidas = 3;
                    Integer rodada = 1;
                    Integer acertos = 0;
                    do {
                        Integer resultado = util.NovaRodada(rodada);
                        Integer resposta = leitor.nextInt();
//                        String acerto = verificarAcerto(resposta, resultado);
                        if (!resposta.equals(resultado)) {
                            vidas--;
                            System.out.println(String.format("Você errou!\n"
                                    + "A resposta certa era %d!\n"
                                    + "Você perdeu uma vida e agora está com %d vidas", resultado, vidas));
                        } else {
                            System.out.println("Parabéns você acertou!");
                            totalPontos += 10;
                            acertos++;
                            if (acertos % 5 == 0) {
                                totalPontos += 100;
                                System.out.println("Você ganhou mais 100 pontos bônus");
                            }
                            if (totalPontos % 200 == 0) {
                                vidas++;
                                System.out.println("Parabéns você ganhou uma vida");
                            }
                        }
                        util.ExibirBorda();
                        rodada++;
                    } while (vidas != 0);
                    System.out.println(String.format("Game over!!!!\n "
                            + "Você fez %d pontos"
                            + "", totalPontos));
                    util.ExibirBorda();

                    break;
                default:
                    System.out.println("Opção inválida, escolha a opção novamente!");
                    System.out.println("");
                    break;
            }

        } while (opcaoEscolhida
                != 0);
        System.out.println(
                "Até logo!");
    }
}
