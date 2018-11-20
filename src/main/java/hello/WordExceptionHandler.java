package hello;

import java.util.Date;

import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Gaurav
 *
 */
@RestControllerAdvice
public class WordExceptionHandler{

    /**
     * @param   ex   An instance of JSONException
     * @return  json message with HTTP error code      
     */
    @ExceptionHandler(JSONException.class)
    public ResponseEntity<Object> handleAuthorizationException(JSONException ex) {
		
    	return new ResponseEntity<>(new Date() 
    			+ ": Exception occurred while dealing with JSON object!!!"
				, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
