package InterviewQuestions;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		 String s1 = "Hello Monika Jadhav"; 
	        System.out.println(reverseStringWords(s1)); 

	}
	
	public static String reverseStringWords(String str) {
		
		String[] NewStr = str.split(" ");
		String result = "";
		for(int i =NewStr.length-1;i>=0;i--) {
			result = result.trim()+ " " + NewStr[i];
		}
		return result;
		
	}
}
