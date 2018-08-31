/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02exercicio01;

import java.util.Scanner;

/**
 *
 * @author teste
 */
public class Aula02Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2, soma, sub, multi, quociente, resto;
        Scanner v1 = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        valor1 = v1.nextInt();
        Scanner v2 = new Scanner(System.in);
        System.out.println("Digite o valor 2: ");
        valor2 = v2.nextInt();
        
        soma = valor1 + valor2;
        sub = valor1 - valor2;
        multi = valor1 * valor2;
        quociente = valor1 / valor2;
        resto = valor1 % valor2;
        
        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + sub);
        System.out.println("Multiplicação = " + multi);
        System.out.println("Quociente = " + quociente);
        System.out.println("Resto da divisão de " + valor1 + " por " + valor2 + " = " + resto);
        
    }
    
}
