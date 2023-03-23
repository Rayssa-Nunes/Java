/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula10;

/**
 *
 * @author rayss
 */
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    /*public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }*/

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAumento(float aumento) {
        this.salario += aumento;
        System.out.println("Professor(a) " + getNome() + " recebeu R$" + aumento + " de aumento");
        System.out.println("Salário Atual: " + salario);
    }
}
