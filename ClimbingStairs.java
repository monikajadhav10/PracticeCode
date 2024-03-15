package InterviewQuestions;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(climbStairs(n));

	}

	public static int climbStairs(int n) {

		int first = 1;
		int second = 2;
		int ways = 0;
		int i = 2;
		if (n == 0 || n == 1) {
            return 1;
        } 
		else if(n==2) {
			return 2;
		}
		while(i<n) {//fibbonaci 1 1 2 3 5 8 13
				ways = first + second;
				first = second;
				second = ways;
				i++;
			
		}
		return ways;
		
	}

}
