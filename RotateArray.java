package InterviewQuestions;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		int k = 2;
		System.out.print(Arrays.toString(rotate(nums,k)));
	}

	    public static int[] rotate(int[] nums, int k) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if ((i + k) < nums.length) {
				result[i + k] = nums[i];
			} else {
				result[(i + k) % nums.length] = nums[i];
			}
		}
		return result;
	}

}
