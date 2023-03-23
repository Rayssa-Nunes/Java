/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex02;

import java.util.Random;

/**
 *
 * @author rayss
 */
public class Guerreiro {
    private int codigo;
    private String nome;
    private int energia;
    
    public Guerreiro(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }
    
    public void incremento() {
        //energia++;
        if (energia < 5) {
            energia++;
        }
    }
    
    public void decremento() {
        energia--;
        if (energia == 0) {
            System.out.println(this.nome + " está sem energia!");
        }
    }
    
    public void alimentarSe() {
        this.incremento();
    }
    
    public int atacar() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(2);
    }
    
    public void lutarLoop(Guerreiro oponente) {
       int ataque1, ataque2;
       
       while (this.energia > 0 && oponente.getEnergia() > 0) {
           ataque1 = this.atacar();
           ataque2 = oponente.atacar();
           if (ataque1 == 1) {
               oponente.decremento();
           }
           if (ataque2 == 1) {
               this.decremento();
           }
       } if (this.energia == 0) {
           System.out.println(oponente.getNome() + " venceu a luta");
       } else {
           System.out.println(this.getNome() + " venceu a luta");
       }
       
    }
    
    public void lutarRecursivo(Guerreiro oponente) {
        int ataque1, ataque2;
        ataque1 = this.atacar();
        ataque2 = oponente.atacar();
        if (ataque1 == 1) {
            oponente.decremento();
        }
        if (ataque2 == 1) {
            this.decremento();
        }
        if (this.energia == 0) {
            System.out.println(oponente.getNome() + " venceu a luta");
        } else if (oponente.getEnergia() == 0) {
            System.out.println(this.nome + " venceu a luta");
        } else {
            this.lutarRecursivo(oponente);
        }
    }
    
    public String toString() {
        return "Guerreiro " + this.codigo + " - " + this.nome + "(energia: " + this.energia + ")";
    }
    
    
    
    
}
