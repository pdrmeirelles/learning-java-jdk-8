/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03exemplo01.modelo;

/**
 *
 * @author Aluno
 */
public class Aluno {
    
    //atributos
    private int matricula;
    private String nome;
    
    //métodos construtores
    
    //primeiro método construtor (opcional)
    
    public Aluno() //vai seguir Aluno a1 = new Aluno();
    {
        //pode ficar vazio ou previamente setado
        //matricula = 0; //valor inicial especificado (previamente setado)
        //nome = ""; //valor inicial especificado (previamente setado)
    }
    
    
    //segundo método construtor (obrigatório) (parâmetros obrigatórios)
    
    public Aluno(int matricula, String nome) //vai seguir Aluno a1 = new Aluno(201703196309, "Pedro");
    {
        //nomeAtributo = nomeParametro;
        this.matricula = matricula;
        this.nome = nome;
    }
    
    //segundo método construtor (obrigatório) (parâmetros obrigatórios) (sem usar this)
    /*
    public Aluno(int m, String n)
    {
        //nomeAtributo = nomeParametro;
        matricula = m;
        nome = n;
    }
    */
    
    //métodos get e set (para cada um dos atributos)
    public int getMatricula()
    {
        return matricula;
    }
    
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
       this.nome = nome; 
    }
    
}
