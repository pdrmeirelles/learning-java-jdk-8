/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02exercicio07;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Aula02exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Usando for:
        
        //Fazendo o algoritmo com a Classe System:
        
        /*
        //variaveis
        int n, count;
        float nota, somaDasNotas, media;
        
        //inicializando variaveis auxiliares em 0
        somaDasNotas = 0;
        count = 0;
        
        //objeto para digitacao no console de texto
        Scanner teclado = new Scanner(System.in);
        
        //entrada de dados
        System.out.println("Digite o numero de alunos: ");
        n = teclado.nextInt();
        
        //processamento
        for(int i=0; i < n; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i);
            nota = teclado.nextFloat();
            somaDasNotas = somaDasNotas + nota;
            count = count + 1;
        }
        
        //checagem das quantidades
        System.out.println("Numero de alunos: " + n);
        System.out.println("Numero de notas: " + count);
        
        //processamento
        media = somaDasNotas / count;
        
        //saida de dados
        System.out.printf("Media da turma: %.2f\n", media);
        */
        
        
        
        
        
        //Fazendo o algoritmo com a Classe JOptionPane:
                
        /*
        //variaveis
        int n, count;
        float nota, somaDasNotas, media;
        
        //inicializando variaveis auxiliares em 0
        somaDasNotas = 0;
        count = 0;
        
        //objeto para digitacao no console de texto
        Scanner teclado = new Scanner(System.in);
        
        //entrada de dados
        System.out.println("Digite o numero de alunos: ");
        n = teclado.nextInt();
        
        //processamento
        for(int i=0; i < n; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i);
            nota = teclado.nextFloat();
            somaDasNotas = somaDasNotas + nota;
            count = count + 1;
        }
        
        //checagem das quantidades
        System.out.println("Numero de alunos: " + n);
        System.out.println("Numero de notas: " + count);
        
        //processamento
        media = somaDasNotas / count;
        
        //saida de dados
        System.out.printf("Media da turma: %.2f", media);
        */
        
        //usando while:
        
        //eu ia fazer do jeito mais dificil, sem saber qual o numero de alunos:
        /*
        while(nota != "x") {
            System.out.printf("Digite a nota do aluno %d", count);
        }
        */
        
        //mas o prof ja leva o numero de alunos (n) em consideracao:
        
        //variaveis
        int n, i;
        float nota, somaDasNotas, media, mediaTeste;
        
        //objeto para digitacao no console de texto
        Scanner teclado = new Scanner(System.in);
        
        //entrada de dados
        System.out.println("Digite o numero de alunos: ");
        n = teclado.nextInt();
        
        //inicializando variaveis auxiliares em 0
        i = 0;
        somaDasNotas = 0;
        
        while(i < n) {
            System.out.printf("Digite a nota do aluno %d: \n", i);
            nota = teclado.nextFloat();
            somaDasNotas = somaDasNotas + nota;
            i = i + 1;
        }
        
        //checagem das quantidades
        System.out.println("Numero de alunos: " + n);
        System.out.println("Numero de notas: " + i);
        
        //processamento
        media = somaDasNotas / n;
        
        //processamento teste
        mediaTeste = somaDasNotas / i;
        
        //exibicao do resultado
        System.out.printf("Media da turma de %d alunos: %.2f \n", n, media);
        
        //exibicao do resultado teste
        System.out.printf("Media Teste da turma de %d alunos: %.2f \n", i, mediaTeste);
    }
    
}
