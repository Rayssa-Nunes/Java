/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula12;

/**
 *
 * @author rayss
 */
public class Aula12 {

    public static void main(String[] args) {
        // POLIMORFISMO DE SOBREPOSIÇÃO
        
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        
        Canguru c1 = new Canguru();
        Cachorro k1 = new Cachorro();
        Tartaruga t1 = new Tartaruga();
        
        m1.setPeso(5.5f);
        m1.setIdade(3);
        m1.setMembros(4);
        m1.setCorPelo("Marrom");
        m1.locomover();
        m1.alimentarSe();
        m1.emitirSom();
        
        System.out.println(m1.toString());
        System.out.println("--------------");
        
        r1.setPeso(0.300f);
        r1.setIdade(2);
        r1.setMembros(4);
        r1.setCorEscama("Cinza");
        r1.locomover();
        r1.alimentarSe();
        r1.emitirSom();
        
        System.out.println(r1.toString());
        System.out.println("--------------");
        
        c1.setPeso(15f);
        c1.setIdade(5);
        c1.setMembros(4);
        c1.locomover();
        c1.alimentarSe();
        c1.emitirSom();
        c1.usarBolsa();
        
        System.out.println(c1.toString());
        System.out.println("--------------");
        
        t1.idade = 7;
        t1.membros = 4;
        t1.peso = 3.4f;
        t1.locomover();
        t1.alimentarSe();
        t1.emitirSom();
        
        System.out.println(t1.toString());
        System.out.println("--------------");
        
        k1.setPeso(12.7f);
        k1.setIdade(4);
        k1.setMembros(4);
        k1.locomover();
        k1.alimentarSe();
        k1.emitirSom();
        
        System.out.println(c1.toString());
   }
}
