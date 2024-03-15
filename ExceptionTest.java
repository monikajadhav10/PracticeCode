package InterviewQuestions;

public class ExceptionTest {
	
	public static void print(int a,int b) {
		System.out.println("addition is :" +(a+b));
	}

	public static void main(String[] args)  {
		int n1 = 7;
		int n2 = -3;
		
		if(n1>=0 && n2>=0) {
			ExceptionTest.print(n1, n2);
		}
		else {
			throw new IllegalStateException("number should be positive");
		}
	}

}
