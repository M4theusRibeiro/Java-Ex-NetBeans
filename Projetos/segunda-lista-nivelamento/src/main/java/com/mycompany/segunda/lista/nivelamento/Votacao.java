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
public class Votacao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer saborMussarela = 0;
        Integer saborCalabresa = 0;
        Integer saborQuatroQueijos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite seu voto(Mussarela é 5, Calabresa é 25 e "
                    + "Quatro Queijos é 50):");
            Integer numeroDigitado = leitor.nextInt();
            System.out.println(i);
            switch (numeroDigitado) {
                case 5:
                    saborMussarela++;
                    break;
                case 25:
                    saborCalabresa++;
                    break;
                case 50:
                    saborQuatroQueijos++;
                    break;
                default:
                    System.out.println("Número inválido, preencha novamente");
                    i = i - 1;
            }

        }
        String saborFavorito = "";
        if(saborMussarela > saborCalabresa && saborMussarela > saborQuatroQueijos){
            saborFavorito = "Mussarela";
        }else if(saborCalabresa > saborQuatroQueijos){
            saborFavorito = "Calabresa";
        }else{
            saborFavorito = "Quatro Queijos";
        }
        String frase = String.format("O sabor favorito é o sabor: %s.\nO sabor mussarela recebeu %d votos, "
                + "o sabor calabresa recebeu %d votos e o sabor quatro queijos recebeu %d votos", 
                saborFavorito,saborMussarela, saborCalabresa, saborQuatroQueijos);
        
        System.out.println(frase);
    }

}
