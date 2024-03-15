package InterviewQuestions;

import java.util.Stack;

class ReverseIndiWord { // Hello World!

//	static void reverseWords(String str) {
//		Stack<Character> st = new Stack<Character>();
//
//		for (int i = 0; i < str.length(); ++i) {
//			if (str.charAt(i) != ' ')
//				st.push(str.charAt(i));
//
//			else {
//				while (st.empty() == false) {
//					System.out.print(st.pop());
//				}
//				System.out.print(" ");
//			}
//		}
//
//		while (st.empty() == false) {
//			System.out.print(st.pop());
//		}
//	}

	static String reverseWords(String str) {
		String arr[] = str.split(" ");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				result = result + arr[i].charAt(j);
				if(j==0) {
					result = result + " ";
				}
			}
		}
		return result.trim();

	}

	public static void main(String[] args) {
		String str = "Hello World!";
		System.out.print(reverseWords(str));
	}
}
