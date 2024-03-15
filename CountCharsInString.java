package InterviewQuestions;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class CountCharsInString {

	public static void main(String[] args) {
		
		String input = "aaabbccca";
		System.out.println(compressedString(input));
		System.out.println(compressedString(input).length());
	}
	
	public static String compressedString(String input) {
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++) {
			if(map.containsKey(input.charAt(i))){
				map.put(input.charAt(i), map.get(input.charAt(i))+1);
			}
			else {
				map.put(input.charAt(i), 1);			
			}
			
		}
		StringBuilder sb = new StringBuilder ();
		for(Entry<Character, Integer> entry : map.entrySet() ) {
		    sb.append(entry.getKey());
		    sb.append(entry.getValue());
	     }
		return sb.toString();  	
	}

}
