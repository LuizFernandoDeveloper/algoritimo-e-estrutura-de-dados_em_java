package ex.dataStructure.exception;

public class ItemNotTheFirdt extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ItemNotTheFirdt(String Message) {
		super(Message);
	}
}
