/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02exercicio06;

import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Aula02exercicio06 {

    public static void main(String[] args) {
        
        String op;
        float a, b, resultado;
        Scanner operador = new Scanner(System.in);
        System.out.println("Digite o operador aritmético: ");
        op = operador.nextLine();
        
        Scanner numeroA = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        a = numeroA.nextFloat();
        
        Scanner numeroB = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        b = numeroB.nextFloat();
        
        resultado = a op b;
        
        System.out.println("a " + a + "op " + op + "b " + "= " + resultado);
    }
    
}
