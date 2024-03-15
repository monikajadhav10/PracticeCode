package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
            TwoSum obj = new TwoSum ();
            int array [] = {2,7,11,15};
          int result [] = obj.twoSum(array, 9);
          System.out.println(Arrays.toString(result));
           
	}
	
	public static int[] twoSum (int [] nums,int target) {
		HashMap <Integer, Integer> map = new HashMap <Integer, Integer> ();		
		for(int i =0;i<nums.length;i++) {
			if(map.containsKey(target -nums[i] )) {
				return new int [] {map.get(target -nums[i]), i};
			}
			else {
				map.put(nums[i], i);
			}
		}
		return null;
	}

}
