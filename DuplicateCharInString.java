package InterviewQuestions;

import java.util.HashMap;

public class DuplicateCharInString {

	public static void main(String[] args) {
		
        char s[] = "mjmk".toCharArray();
        int lengthS = s.length;
      System.out.println(removeDuplicate(s, lengthS));
	}
	
	public static char [] removeDuplicate(char [] str,int n) {
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		String result = "";
		for(int i = 0; i<n;i++) {
			
			if (!map.containsKey(str[i])) {
				map.put(str[i], 1);
				result = result + str[i];		
			}
		}
		
		
		return result.toCharArray();
		
	}
	

}
