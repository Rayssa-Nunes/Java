/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author rayss
 */
public class Mamifero extends Animal {
    private String corPelo;
    
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    
    @Override
    public void alimentarSe() {
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("som do Mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
            
}
