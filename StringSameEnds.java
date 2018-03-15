package pl.edu.agh.java.exercises.strings;

/**
 * Given a string, return the longest substring that appears at both the beginning and end of the string without
 * overlapping. For example, sameEnds("abXab") is "ab".
 * <p>
 * Dla danego ciągu znaków zwróć najdłuższy podciąg, który występuje na początku i na końcu, bez nachodzenia na siebie.
 * Przykłądowo, sameEnds("abXab") to "ab".
 *
 * @see http://codingbat.com/prob/p131516
 */
public class StringSameEnds {
    public String sameEnds(String string) throws UnsupportedOperationException {
		if (string.contains("\n") || string.contains(" ")) {  // czy potrzebny drugi warunek?
			
			throw new UnsupportedOperationException("Invalid operation for string.");
			
		} else {
			
			String output = "";
			int maxIndex = (string.length() / 2) + 1;
			
	        for (int i = 1; i < maxIndex; i++) {
	        	String twin = string.substring(0, i);
	        	if ( string.startsWith(twin) && string.endsWith(twin) ) {
	        		output = twin;
	        	}
	        }
	        
	        System.out.println("Najdluzszy podciag = " + output);
	        return output;
		}
    }
}
