/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_exemplo01;

import aula06_exemplo01.fabrica.Motor;
import aula06_exemplo01.fabrica.Carro;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Aula06_Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // metodo principal
        //Motor motor1 = new Motor();
        //ou:
        //Motor motor1 = new Motor(1.0F) - o Netbeans interpreta 1.0, 2.0 ou 3.0 sempre como tipo double
        
        //o professor resolveu usar o metodo construtor com parametros:
        Motor motor1 = new Motor(1.0F);
        Motor motor2 = new Motor(2.0F);
        
        //o professor usou o metodo construtor sem parametros:
        //carro 1
        Carro carro1 = new Carro();
        //o professor usou o metodo construtor com parametros:
        //carro 2
        Carro carro2 = new Carro("FIAT", motor1);
        //carro 3
        Carro carro3 = new Carro("VW", motor2);
        
        //exibir os dados dos carros:
        //carro 2
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Motor: " + carro2.getMotor().getCilindrada());
        
        //carro 3
        JOptionPane.showMessageDialog(null, "Modelo: " + carro3.getModelo() + "\nMotor: " + carro3.getMotor().getCilindrada());
        
        carro1.setModelo("Renault");
        carro1.setMotor(motor1);
        
        //carro 1
        JOptionPane.showMessageDialog(null, "Modelo: " + carro1.getModelo() + "\nMotor: " + carro1.getMotor().getCilindrada());
        
        System.out.println("Velocidade Maxima: " + carro1.obterVelocidadeMaxima());
        System.out.println("Velocidade Maxima: " + carro2.obterVelocidadeMaxima());
        System.out.println("Velocidade Maxima: " + carro3.obterVelocidadeMaxima());
    }
    
}
