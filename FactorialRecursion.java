package InterviewQuestions;

public class FactorialRecursion {

	public static void main(String[] args) {
		int N = 4;
		FactorialRecursion obj = new FactorialRecursion();
		
		System.out.println(obj.factorial(N));
	}
	
	int factorial(int N) {
		
		if(N == 0) {
			return 1;
		}
		else
			return N*factorial(N-1);
		
	}
	
	

}
