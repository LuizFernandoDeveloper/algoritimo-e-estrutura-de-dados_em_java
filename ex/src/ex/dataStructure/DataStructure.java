package ex.dataStructure;

public class DataStructure {
	private int maximumSize;
	private int top;
	private int[] elements;
	
	public DataStructure(int maximumSize) {
		
		this.maximumSize = maximumSize;
		this.top = -1;
		this.elements = new int[maximumSize];
		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean full() {
		return top == maximumSize - 1;
	}
	
	public void push(int element) {
		
		if(full()) {
			
			throw new IllegalStateException("A pilha esta cheia!");
			
		}
		
		top ++;
		elements[top] = element; 
			
	}
	
	public int pop() {
		
		if(isEmpty()) {
			
			throw new IllegalStateException("A pilha esta vazia!"); 
			
		}
		
		int elementUnStack = elements[top];
		top--;
		return elementUnStack;
			
		}
	
	public int top() {
		
		if(isEmpty()) {
			
			throw new IllegalStateException("A pilha esta vazia!"); 	
			
		}
		
		return elements[top];
	}
	
	public int size() {
		
		return elements.length;
		
	}
		
}