package InterviewQuestions;

public class SumDigit {

	public static void main(String[] args) {
		
		for(int num = 100; num<200;num++) {
			
			String str = Integer.toString(num); //int to string 
			int FirstDigit = Character.getNumericValue(str.charAt(0));
			int LastDigit = Character.getNumericValue(str.charAt(2));
			int middleDigit = Character.getNumericValue(str.charAt(1));
			if(FirstDigit + LastDigit == middleDigit) {
				System.out.print(num + " ");
			}		
		}
	}
}
