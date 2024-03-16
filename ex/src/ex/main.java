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
		
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		
		System.out.println("Esta vazia ? "+ stack.isEmpty());
		
		System.out.println("Topo da pilha: " + stack.top());
		
		System.out.println("Desempilhando elementos");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("tamhanho da pilha: " + stack.size());
		
		System.out.println("Esta vazia ? "+ stack.isEmpty());
	}

}