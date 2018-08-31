/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//nome do pacote
package aula02exemplo01;

import java.util.Scanner;

//nome da Classe
public class Aula02Exemplo01 {

    //método principal
    public static void main(String[] args) {
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        idade = teclado.nextInt();
        System.out.println("Idade = " + idade);
        
    }//fim do método principal
    
}//fim da Classe
