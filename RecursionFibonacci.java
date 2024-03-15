package InterviewQuestions;
class RecursionFibonacci {
    public static void main(String args[])
    {
    	RecursionFibonacci obj = new RecursionFibonacci();
    	int N = 10;
    	for(int i =0;i<=N;i++) {
    		System.out.print(obj.fib(i)+" ");
    	}
    	
    }
    
   int fib(int i){
    	
    	if(i<=1)
    		return i;
    	else
    		return fib(i-1)+fib(i-2);
    
}
}

