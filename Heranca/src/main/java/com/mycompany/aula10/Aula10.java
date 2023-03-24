<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula10;

/**
 *
 * @author rayss
 */
public class Aula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("João");
        p3.setNome("Maria");
        p4.setNome("Joana");
        
        p1.setIdade(25);
        p2.setIdade(18);
        p3.setIdade(43);
        p4.setIdade(37);
        
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        // Utilizando os métodos
        System.out.println("-----------------");
        p2.setMatricula(01212);
        p2.setCurso("tsi");
        p2.cancelarMatricula();
        System.out.println("-----------------");
        p3.setSalario(1250f);
        p3.receberAumento(500f);
        
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula10;

/**
 *
 * @author rayss
 */
public class Aula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("João");
        p3.setNome("Maria");
        p4.setNome("Joana");
        
        p1.setIdade(25);
        p2.setIdade(18);
        p3.setIdade(43);
        p4.setIdade(37);
        
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        // Utilizando os métodos
        System.out.println("-----------------");
        p2.setMatricula(01212);
        p2.setCurso("tsi");
        p2.cancelarMatricula();
        System.out.println("-----------------");
        p3.setSalario(1250f);
        p3.receberAumento(500f);
        
    }
}
>>>>>>> 19392a9d6ec12f851d8adc322e2ccd1a134c697e
