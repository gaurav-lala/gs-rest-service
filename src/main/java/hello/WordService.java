package hello;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

/**
 * Service class for checking the characteristics of a word
 * 
 * @author Gaurav
 *
 */
@Service
public class WordService {

	/**
	 * This method checks if the String passed to it is
	 * a Palindrome.
	 * 
	 * @param   word   String to be analysed.
	 * @return  {@code true} if this String is a Palindrome;
	 * 			{@code false} otherwise.
	 */
	public boolean isWordPalindrome(String word) {
		StringBuilder sb = new StringBuilder(word);		
		
		return sb.reverse().toString().equals(word);
	}
	
	/**
	 * This method checks if the String passed to it is
	 * an Anagram.
	 * 
	 * @param   word   String to be analysed.
	 * @return  {@code true} if this String is an Anagram;
	 * 			{@code false} otherwise.
	 */
	public boolean isWordAnagram(String word) {
		Set<Character> set = new HashSet<>();
		
		word.chars().forEach(c -> {
					
				Character letter = (char) c;
				
				if(set.contains(letter)) {
					set.remove(letter);
				}else {
					set.add(letter);
				}
		});
		
		return (set.size() == 0) || (set.size() == 1);
	}
}
