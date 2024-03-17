package ex.dataStructure;

import java.util.Iterator;

import ex.dataStructure.exception.DataStructureIsEmpty;
import ex.dataStructure.exception.ItemNotTheFirdt;
import ex.dataStructure.exception.NotfoudItemInArray;

/*
 * 
 * Com base no que foi aprendido no módulo 1, 
 * implemente uma classe que represente uma 
 * estrutura de dados de Fila (FIFO – first in, first out). 
 * Sua implementação aceitará somente inteiros e deverá 
 * conter os seguintes métodos:
 * 
 * * enqueue() → Adiciona um inteiro à fila.
 * * dequeue() → Remove um inteiro da fila.
 * * rear() → Retorna o inteiro que está no fim da fila.
 * * front() → Retorna o inteiro que está na frente da fila.
 * * size() → Retorna o tamanho da fila.
 * * isEmpty() → Retorna true ou false dependendo da fila estar vazia ou não.
 * 
 * */

public class DataStructure {

	private int[] elements;
	private int index;

	public DataStructure(int maximumSize) {

		this.elements = new int[maximumSize];
		this.index = 0;
	}

	/**
	 * 
	 * isEmpty() → Retorna true ou false dependendo da fila estar vazia ou não
	 * 
	 * @return booolean : retorna se vazia false ou se cheia true.
	 **/
	public boolean isEmpty() {

		return elements.length == 0;

	}

	/**
	 * metodo para adicionar itens na fila
	 * 
	 * @param element : e o item que sera adicionado na fila
	 * 
	 */
	public void enqueue(int element) {

		elements[index] = element;
		index++;

	}

	/**
	 * metodo para remover itens na fila
	 * 
	 * @param element : e o item que sera removido na fila
	 * 
	 */
	public void dequeue(int element) {

		if (elements[0] == element) {

			boolean check = false;

			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == element) {

					check = true;

				}
			}
			if (check == false) {

				throw new NotfoudItemInArray("Nao encontrado na fila!");

			}
			int[] newRow = new int[elements.length - 1];

			for (int i = 0; i < (elements.length - 1); i++) {
				newRow[i] = elements[i + 1];
			}

			elements = newRow;

		} else {

			throw new ItemNotTheFirdt("Esse numero nao e o primeiro");

		}
	}

	/**
	 * metodo para ver o ultimo elemento da lista
	 * 
	 * @return elements : retorna o ultimo elemento da lista;
	 * 
	 */
	public int rear() {

		int value = 0;

		if (!isEmpty()) {

			value = elements[elements.length - 1];

		} else {

			throw new DataStructureIsEmpty("Lista vazia!");

		}

		return value;
	}

	/**
	 * front() → Retorna o inteiro que está na frente da fila.
	 * 
	 * @return value : retorna o primeiro valor da fila.
	 * 
	 */
	public int front() {

		int value = 0;

		if (!isEmpty()) {

			value = elements[0];

		} else {

			throw new DataStructureIsEmpty("Lista vazia!");
		}

		return value;
	}

	/**
	 * size() → Retorna o tamanho da fila.
	 * 
	 * @return size : retorna o tamanho da fila!
	 **/
	public int size() {
		return elements.length;
	}

	/**
	 * retorna a fila
	 * 
	 * @return elements : fila elementos
	 * 
	 * 
	 **/
	public int[] getAllRow() {
		return elements;
	}

}