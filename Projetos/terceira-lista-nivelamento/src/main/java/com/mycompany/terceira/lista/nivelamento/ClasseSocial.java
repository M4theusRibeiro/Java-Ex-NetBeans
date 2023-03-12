/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terceira.lista.nivelamento;

/**
 *
 * @author matheus
 */
public class ClasseSocial {

    Double calcularSalarioMinimo(Double salario) {

        Double conta = salario / 1045;

        return conta;
    }
    
    String identificarClasseSocial(Double qntSalariosMin){
        
        String classeSocial = "E";
        if(qntSalariosMin > 2 && qntSalariosMin <= 4){
            classeSocial = "D";
        }else if(qntSalariosMin > 4 && qntSalariosMin <= 10){
            classeSocial = "C";
        }else if(qntSalariosMin > 10 && qntSalariosMin <= 20){
            classeSocial = "B";
        }else if(qntSalariosMin > 20){
            classeSocial = "A";
        }
        
        return classeSocial;
    }
}
