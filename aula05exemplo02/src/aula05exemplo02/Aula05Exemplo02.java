/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05exemplo02;

import javax.swing.JOptionPane;
/**
 *
 * @author Pedro
 */
public class Aula05Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v[] = {100, 140, 75, 28, 4};
	float notas[] = new float[5];
		
	for(int i=0; i<v.length; i=i+1){
            System.out.println(v[i]);
	}
		
	for(int i=0; i<v.length; i++){
            JOptionPane.showMessageDialog(null, v[i]);
	}
		
	for(int i : v){
            System.out.println(i);
	}
		
	//Desafio: como exibir todos os componentes do vetor de uma sÃ³ vez?
	//Dica: salvar em uma String e exibir a String com o JOptionPane
    }
    
}
