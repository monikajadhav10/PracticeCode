package InterviewQuestions;

public class OccurenceOfChar {

	public static void main(String[] args) {
		String str = "Monnika";
		char ch = 'n';
		System.out.println(count(str,ch));
	}
	
	public static int count (String s,char c) {
		
		int result = 0;
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i)==c)
				result++;
		}		
		return result;
		
	}

}
