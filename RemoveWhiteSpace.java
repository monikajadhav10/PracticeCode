package InterviewQuestions;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		RemoveWhiteSpace ob = new RemoveWhiteSpace();
		String s = "Monika     is  a good   girl";
				String results = ob.RemoveSpace(s);
		System.out.print(results);

	}

	String RemoveSpace (String str) {
		String[] s = str.split(" ");//[Monika, , , , , is, , a, good, , , girl]
		String result = "";
		int n =  s.length;
		for(int i =0; i<n;i++) {
			
			if(s[i]!=" ") {
		result = result + s[i];
//			result = result + " " + s[i];
			}
		}
		
			
		return result;
		
	}

}
