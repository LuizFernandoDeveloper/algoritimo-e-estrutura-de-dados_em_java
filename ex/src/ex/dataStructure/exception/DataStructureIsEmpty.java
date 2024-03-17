package ex.dataStructure.exception;

public class DataStructureIsEmpty  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataStructureIsEmpty(String message) {
		super(message);
	}
}
