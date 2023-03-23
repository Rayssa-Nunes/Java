/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02;

/**
 *
 * @author rayss
 */
public class Ex02 {

    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro(1, "Guerreiro 1");
        Guerreiro g2 = new Guerreiro(2, "Guerreiro 2");
        
        // Apressentar oss guerreiros
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        
        // Começar uma luta com loop
        /*g1.lutarLoop(g2);
        System.out.println(g1.toString());
        System.out.println(g2.toString());*/
        
        // Começar uma luta recurssiva
        g1.lutarRecursivo(g2);
        System.out.println(g1.toString());
        System.out.println(g2.toString());
    }
}
