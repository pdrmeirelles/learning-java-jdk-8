/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_exemplo01.fabrica;

/**
 *
 * @author Administrador
 */
public class Carro {
    
    //atributos
    private String modelo;
    private Motor motor;
    
    //metodos construtores
    public Carro() //para new Carro();
    {
        modelo = ""; //aqui tb aceitaria null porque modelo eh do tipo Classe String 
        motor = null; //valor nulo para Classes e objetos
    }
    
    //construtor sobrecarregado
    public Carro(String modelo, Motor motor) //para new Carro(modelo, motor);
    {
        this.modelo = modelo;
        this.motor = motor;
    }
    
    //metodos de acesso set e get
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public void setMotor(Motor motor)
    {
        this.motor = motor;
    }
    
    public Motor getMotor()
    {
        return motor;
    }
    
    //metodo velocidade maxima
    public float obterVelocidadeMaxima()
    {
        float vm = 0;
        
        if(motor.getCilindrada() <= 1.0)
            vm = 140;
        else
            if(motor.getCilindrada() <= 1.6)
                vm = 180;
        else
            if(motor.getCilindrada() <= 2.0)
                vm = 220;
        else
                vm = 260;
        return vm;
    }
}
