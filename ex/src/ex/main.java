/*
 * Com base no que foi aprendido no modulo 1, implemente uma classe que represente uma estrutura de 
 * dados de pilha. Sua implementacao aceitacao aceitara somente inteiros e devera conter os seguintes metodos:
 *  . Push() --> Coloca um inteiro no topo da pilha.
 *  . Pop() --> Remove o Valor do topo da pilha e o retorna ao chamador.
 * 
 * */

package ex;

import ex.dataStructure.DataStructure;

public class main {

	public static void main(String[] args) {
		
		DataStructure stack = new DataStructure(5);
		
		stack.stackUp(10);
		stack.stackUp(11);
		stack.stackUp(12);
		stack.stackUp(13);
		stack.stackUp(14);
		
		System.out.println("Esta vazia ? "+ stack.empty());
		
		System.out.println("Topo da pilha: " + stack.top());
		
		System.out.println("Desempilhando elementos");
		while(!stack.empty()) {
			System.out.println(stack.unStack());
		}
		
		System.out.println("Esta vazia ? "+ stack.empty());
	}

}