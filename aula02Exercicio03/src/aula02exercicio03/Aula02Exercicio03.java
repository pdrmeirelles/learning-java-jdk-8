/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02exercicio03;

import static java.lang.Math.pow;
import java.util.Scanner;

//final double PI = 3.14159;

/**
 *
 * @author teste
 */
public class Aula02Exercicio03 {
    
    final static float PI = 3.14159F;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float raio, comp, area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do raio do círculo: ");
        raio = entrada.nextFloat();
        
        comp = 2 * PI * raio;
        area = PI * (float)pow(raio, 2);
        
        System.out.println("Comprimento do círculo de raio = " + raio + " : " + comp);
        System.out.println("Área do círculo de raio = " + raio + " : " + area);
        
    }
    
}
