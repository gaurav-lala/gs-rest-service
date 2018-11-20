package hello;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

/**
 * Test class for verifying the methods of {@link hello.WordService} class.
 * 
 * @author Gaurav
 *
 */
public class WordServiceTest {

	@InjectMocks
    WordService wordService;
	
	@Before
    public void setUp() throws Exception {
        initMocks(this);
    }
	
	@Test
	public void testCheckWordForPalindrome() {
		String []arr = {"kayak", "sagas", "foo", "bar"};
		
		assertTrue(wordService.isWordPalindrome(arr[0]));
		assertTrue(wordService.isWordPalindrome(arr[1]));
		assertFalse(wordService.isWordPalindrome(arr[2]));
		assertFalse(wordService.isWordPalindrome(arr[3]));
	}
	
	@Test
	public void testCheckWordForAnagram() {
		String []arr = {"kkppd", "buzzbu", "eleven", "pizza"};
		
		assertTrue(wordService.isWordAnagram(arr[0]));
		assertTrue(wordService.isWordAnagram(arr[1]));
		assertFalse(wordService.isWordAnagram(arr[2]));
		assertFalse(wordService.isWordAnagram(arr[3]));
	}

}
