/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03exemplo01;

import aula03exemplo01.modelo.Aluno;

/**
 *
 * @author Aluno
 */
public class Aula03Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Aula 03 Exemplo 01");
        
        //criar o objeto a1uno1:
        
        //Aluno aluno1 = new Aluno();
        //System.out.println("Matrícula: " + aluno1.getMatricula());
        //System.out.println("Nome: " + aluno1.getNome());
        
        //Aluno aluno1 = new Aluno(2017001, "Pedro");
        //System.out.println("Matrícula: " + aluno1.getMatricula());
        //System.out.println("Nome: " + aluno1.getNome());
        
        Aluno aluno1 = new Aluno();
        
        aluno1.setMatricula(2017001);
        aluno1.setNome("Pedro");
        
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno1.getNome());
    }
    
}
