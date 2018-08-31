/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02exercicio02;

import java.util.Scanner;

/**
 *
 * @author teste
 */
public class Aula02Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float valor1, valor2, soma, sub, multi, quociente;
        Scanner v1 = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        valor1 = v1.nextFloat();
        Scanner v2 = new Scanner(System.in);
        System.out.println("Digite o valor 2: ");
        valor2 = v2.nextFloat();
        
        soma = valor1 + valor2;
        sub = valor1 - valor2;
        multi = valor1 * valor2;
        quociente = valor1 / valor2;
        
        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + sub);
        System.out.println("Multiplicação = " + multi);
        System.out.println("Quociente = " + quociente);
        
    }
    
}
