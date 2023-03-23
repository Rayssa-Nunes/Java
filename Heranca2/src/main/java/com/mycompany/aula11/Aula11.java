/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula11;

/**
 *
 * @author rayss
 */
public class Aula11 {

    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("Rayssa");
        v1.setIdade(30);
        v1.setSexo("F");
        System.out.println(v1.toString());*/
        
        /*Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setIdade(17);
        a1.setSexo("F");
        a1.setCurso("TSI");
        a1.setMatricula(1212);
        a1.pagarMensalidade();*/
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Maria");
        b1.setIdade(25);
        b1.setSexo("F");
        b1.setCurso("Ciência de Dados");
        b1.setMatricula(2525);
        b1.setBolsa(12.5f);
        b1.renovarBolsa();
        b1.pagarMensalidade();
        
    }
}
