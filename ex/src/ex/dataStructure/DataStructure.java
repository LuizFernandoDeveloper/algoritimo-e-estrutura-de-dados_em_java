package ex.dataStructure;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import javax.naming.ContextNotEmptyException;

import ex.dataStructure.exception.DataStructureIsEmpty;
import ex.dataStructure.exception.ItemNotTheFirdt;
import ex.dataStructure.exception.NotfoudItemInArray;

// LinkedList

//Com base no que foi aprendido no módulo 1, implemente uma classe que represente uma estrutura de dados de Lista Encadeada. Sua implementação aceitará somente inteiros e deverá conter os seguintes métodos:
//
//A - void push(<Node> node) → Adiciona o nó ao fim da lista.
//B - <Node> pop() → Remove o nó no fim da lista e retorna o mesmo.
//C - void insert(int index, <Node> node) → Adiciona um nó na posição da lista indicada via parâmetro.
//D - void remove(int index) → Remove um nó na posição da lista indicada via parâmetro.
//E - <Node> elementAt(int index) → Retorna o elemento que está no índice da lista indicado via parâmetro.F - int size() → Retorna o tamanho da lista.
//G - void printList() → Retorna uma representação em texto da lista.


public class DataStructure {
	
	private Node head;
	private int size;
	
	public DataStructure() {
		
		this.head = null;
		this.size = 0;
		
	}
	
	public void push(Node node) {
		
		if (head == null) {
			
			head = node;
			
		} else {
			Node current =  head;
			while (current.next != null) {
				
				current = current.next;
				
			}
			
			current.next = node;
		}
		
		size ++;
	}
	
	
	public Node pop() {
		
		if(head == null) {
			return null;
		}
		
		Node current = head;
		Node previous = null;
		
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		
		if(previous != null) {
			previous.next = null;
		} else {
			head = null;
		}
		size --;
		return current;
		
	}
	
	
	public void insert(int index, Node node) {
		
		if(index < 0 || index > size) {
			throw new  IndexOutOfBoundsException("Index out of bounds");
		}
		
		if(index == 0 ) {
			
			node.next = head;
			head = node;
		}else {
			Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
		}
		size ++;
	}
	
	public void remove(int index) {
		
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		if (index == 0 ) {
			head  = head.next;
		} else {
			
			Node current = head;
			Node previous = null;
			
			for (int i = 0 ; i < index ; i++) {
				previous = current;
				current = current.next;
			}
			
			previous.next = current.next;
		}
		
		size --;
	}
	
	public  Node elementAt (int index) {
		
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		
		 Node current = head; 
		 for (int i = 0;  i < index; i++) {
			 current = current.next;
		 }
		 
		 return current;
	}
	
	public int size() {
		return size;
	}
	
	public  void printList () {
		Node  current = head;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
	}
	
}