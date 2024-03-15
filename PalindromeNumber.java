package InterviewQuestions;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 4344;
		int reversedNumber = PalindromeNum(num);
		if(reversedNumber == num) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}

	}
	
	public static int PalindromeNum(int n) {
		int result = 0;
		while(n>0) {
			result = result * 10 + n % 10;
			n = n/10; //n - dividend, 10 - divisor , n/10 = quotient
		}		
		return result;		
	}

}
