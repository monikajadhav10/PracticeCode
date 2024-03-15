package InterviewQuestions;
public class AdjacentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Max difference between any adjacent index in array
		int[] a = {1,4,8,14,17}; //3 4,7,2
	System.out.println(maxDifference(a));
		
	}
	
	public static int maxDifference(int[]a) {
		
		
		int currentDiff = a[0];
		int maxDifference = 0;
		
		for(int i =0;i<a.length-1;i++) {
			
			currentDiff = a[i+1] - a[i] ;
			if(currentDiff > maxDifference) {
				maxDifference = Math.max(maxDifference, currentDiff);
			}			
		}
//		int diff =0;
//		for(int i=0;i<a.length-1;i++)
//		{
//			  if(a[i+1] - a[i]>diff)
//			  {
//				  diff=a[i+1] - a[i];
//			  }
//		}
		return maxDifference;
	}

}
