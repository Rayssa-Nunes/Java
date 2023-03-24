/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author rayss
 */
public class Ave extends Animal{
    private String corPena;
    
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    
    @Override
    public void alimentarSe() {
        System.out.println("Comendo frutas");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("som da Ave");
    }
    
    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
