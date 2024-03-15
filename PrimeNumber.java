package InterviewQuestions;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 11%i= 0
		//31
		boolean flag = false;
		int val =4;
		
		for(int i=2;i<val;i++)
		{
			
			if(val%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("it is not prime");
		else
			System.out.println("it is prime");
			
		
	}

}
