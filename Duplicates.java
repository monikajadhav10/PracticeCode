package InterviewQuestions;
import java.util.HashMap;
import java.util.HashSet;

public class Duplicates {
	
	static String reverseWords (String s1) {
		
		String str []= s1.split(" ");
		String result ="";
		
		for(int i=str.length-1;i>=0;i--) {    //"Hello Monika Jadhav"; 
			
			result =result.trim() +" "+ str[i];
		}
		
		return result.trim();
		
	}
	

//	public boolean containsDuplicate(int[] nums) {
//
//		// solution with HashSet
//
//		/*
//		 * HashSet<Integer> h = new HashSet<Integer>(); for (int x : nums) { if
//		 * (h.contains(x)) { return true; } h.add(x); } return false;
//		 */
//
//		// solution with Hashmap
//
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			if (map.containsKey(nums[i])) {
//				return true;
//			}
//			map.put(nums[i], i);
//
//		}
//		return false;
//	}

	public static void main(String[] args) {
		 String s1 = " Hello Monika Jadhav "; 
	        System.out.println(reverseWords(s1)); 
	        
//		int nums[] = { 1, 2, 3, 1 };
//		Duplicates objDup = new Duplicates();
//		System.out.println(objDup.containsDuplicate(nums));

	}

}
