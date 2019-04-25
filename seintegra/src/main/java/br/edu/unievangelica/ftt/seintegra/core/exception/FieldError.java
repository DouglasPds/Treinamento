package br.edu.unievangelica.ftt.seintegra.core.exception;

public class FieldError {

	private String field;
	private String message;
	private String codeError;
	
	public FieldError(String field, String message, String codeError) {
		this.field = field;
		this.message = message;
		this.codeError = codeError;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCodeError() {
		return codeError;
	}

	public void setCodeError(String codeError) {
		this.codeError = codeError;
	}
	
}
