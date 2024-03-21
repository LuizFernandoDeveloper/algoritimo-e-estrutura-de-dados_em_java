/*
 * Com base no que foi aprendido no modulo 1, implemente uma classe que represente uma estrutura de 
 * dados de pilha. Sua implementacao aceitacao aceitara somente inteiros e devera conter os seguintes metodos:
 *  . Push() --> Coloca um inteiro no topo da pilha.
 *  . Pop() --> Remove o Valor do topo da pilha e o retorna ao chamador.
 * 
 * */

package ex;

import ex.dataStructure.DataStructure;
import ex.dataStructure.Node;

public class main {

	public static void main(String[] args) {
		
        DataStructure list = new DataStructure();
        
        list.push(new Node(1));
        list.push(new Node(2));
        list.push(new Node(3));

        System.out.println("Lista original:");
        list.printList();

        list.insert(1, new Node(4));
        System.out.println("Lista após inserção:");
        list.printList();

        list.remove(2);
        System.out.println("Lista após remoção:");
        list.printList();

        System.out.println("Tamanho da lista: " + list.size());
	}

}