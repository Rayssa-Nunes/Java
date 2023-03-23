/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula10;

/**
 *
 * @author rayss
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private boolean matriculado;
    
    //PODEMOS FAZER O MÉTODO CONSTRUTOR PARA FACILITAR  
    /*public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }*/
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
        this.matriculado = true;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMatricula() {
        if (matriculado) {
            System.out.println("Matrícula cancelada!");
            this.matriculado = false;
        } else {
            System.out.println("Aluno não está matriculado ainda.");
        }
        
        //System.out.println("Matrícula cancelada");
    }
    
}
