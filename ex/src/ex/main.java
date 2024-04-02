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
		
		stack.enqueue(10);
		stack.enqueue(11);
		stack.enqueue(12);
		stack.enqueue(13);
		stack.enqueue(14);
		
		System.out.println("Esta vazia ? "+ stack.isEmpty());
		
		System.out.println("Topo da pilha: " + stack.front());
		
		for(int element: stack.getAllRow())System.out.println(element);
		
		System.out.println("Desempilhando elementos");
		int index = 0;
		int[] listcheck = stack.getAllRow();
		while(index !=  5) {
			
			stack.dequeue(listcheck[index]);
			index ++;
		}
		
		for(int element: stack.getAllRow())System.out.println(element);
		
		System.out.println("tamhanho da pilha: " + stack.size());
		
		System.out.println("Esta vazia ? "+ stack.isEmpty());
	}



}