package InterviewQuestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class CompressedLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = { 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'a' };
		System.out.println(compress(chars));
	}

	public static int compress(char[] chars) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < chars.length; i++) {
			if (map.containsKey(chars[i])) {
				map.put(chars[i], map.get(chars[i]) + 1);
			} else {
				map.put(chars[i], 1);
			}

		}
		StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		return sb.toString().length();
	}

}
