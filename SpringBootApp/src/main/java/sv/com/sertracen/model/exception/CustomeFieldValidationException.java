package sv.com.sertracen.model.exception;

public class CustomeFieldValidationException extends Exception{

	private static final long serialVersionUID = -4995433707591853255L;
	
	private String fieldName;
	
	public CustomeFieldValidationException(String message, String fieldName) {
		super();
		this.fieldName = fieldName;
	}
	
	public String getFieldName() {
		return this.fieldName;
	}
}
