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
public class Motor {
    
    //atributos
    private float cilindrada;
    
    //metodos construtores
    public Motor()
    {
        cilindrada = 0;
    }
    
    public Motor(float cilindrada)
    {
        this.cilindrada = cilindrada;
    }
    
    //metodos de acesso set e get
    public void setCilindrada(float cilindrada) //ou public void setCilindrada(float c)
    {
        this.cilindrada = cilindrada; //ou cilindrada = c;
    }
    
    public float getCilindrada()
    {
        return cilindrada;
    }
    
    //mais metodos que digam respeito a Motor
}
