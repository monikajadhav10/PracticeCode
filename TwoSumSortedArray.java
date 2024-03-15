package InterviewQuestions;

import java.util.Arrays;

//Array sorted => Binary search
public class TwoSumSortedArray {

	public static void main(String[] args) {
		TwoSumSortedArray obj = new TwoSumSortedArray ();
        int array [] = {2,7,11,15};
         //int arraySample [] = new int [] {1,2,3,4};
        //int arraySample [] = new int [4]
      int result [] = obj.twoSumSorted(array, 9);
      System.out.println(Arrays.toString(result));

	}
	
	public static int [] twoSumSorted (int nums [],int target) {
		int leftPointer = 0;
		int rightPointer = nums.length-1;
		
		while(leftPointer<rightPointer) {
			int currentSum = nums[leftPointer]+nums[rightPointer];
			if(currentSum < target) {
				leftPointer = leftPointer+1;
			}
			else if (currentSum > target) {
				rightPointer = rightPointer-1;
			}
			else {
				return new int [] {leftPointer+1,rightPointer+1};
			}
		}		
		return null;
		
	}

}
