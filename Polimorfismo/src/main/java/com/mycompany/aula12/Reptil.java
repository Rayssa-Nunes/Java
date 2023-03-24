/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author rayss
 */
public class Reptil extends Animal {
    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    
    @Override
    public void alimentarSe() {
        System.out.println("Comendo Vegetais");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("som do Reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
