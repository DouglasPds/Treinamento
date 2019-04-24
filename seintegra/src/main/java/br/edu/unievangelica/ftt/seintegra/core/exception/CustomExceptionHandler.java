package br.edu.unievangelica.ftt.seintegra.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	/* BAD REQUEST - 400 */
	@ExceptionHandler({BadRequestException.class})
	public ResponseEntity<?> handlerBadRequestException(BadRequestException e){
		
		List<FieldError> fieldErrors = new ArrayList<>();
		
		e.getErrors().getFieldError().forEach(error -> fiedErrors.add)
			new FieldError(error.getField(),error.getDefault)
		
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	/* NOT FOUND - 404 */
	@ExceptionHandler({NotFoundException.class})
	public ResponseEntity<?> handlerNotFoundException(NotFoundException e){
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
