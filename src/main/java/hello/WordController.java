package hello;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for word processing requests
 * 
 * @author Gaurav
 *
 */
@RestController
public class WordController {
    
	@Autowired
	WordService service;
	
	/**
	 * This method will receive all the GET requests
	 * 
	 * @param   word  String parameter to be fetched from the url
	 * @return  json object with the right HTTP status code
	 * @throws  JSONException
	 */
	@RequestMapping(value="/words/{word}", method=RequestMethod.GET)
	public ResponseEntity<String> getWordFeature(@PathVariable String word) throws JSONException{
		
		JSONObject jsonObject = new JSONObject();	
		jsonObject.put("word", word);
		jsonObject.put("palindrome", service.isWordPalindrome(word));
		jsonObject.put("anagramOfPalindrome", service.isWordAnagram(word));
		
		return ResponseEntity.ok(jsonObject.toString());
	}
}
