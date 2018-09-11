//faça um programa que, atraves de caixas de dalogo, solicite dois numeros inteiros e exiba o resultado 
//da soma desses numeros.

package aula05exemplo01;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Aula05Exemplo01{
	
	public static void main(String[] args){
		
		//exibe a caixa de diÃ¡logo de digitaÃ§Ã£o
		String n1 = JOptionPane.showInputDialog("Primeiro numero: ");
		String n2 = JOptionPane.showInputDialog("Segundo numero: ");
		
		//converter para numeros inteiros
		int a = Integer.parseInt(n1);
		int b = Integer.parseInt(n2);
		//Integer.parseInt() : converte para tipo int
		//Float.parseFloat() : converte para tipo float
		//Double.parseDouble() : converte para tipo double
		//String.valueOf() : converte para tipo String
		
		int soma = a + b;
		
		//exibe a caixa de dialogo com o resultado
		JOptionPane.showMessageDialog(null, "Resultado: " + soma, "Exemplo 01", JOptionPane.WARNING_MESSAGE);
	}
}