package InterviewQuestions;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
class HashMapProblem {
    static void characterCount(String inputString)
    {
       
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
 
     
        char[] strArray = inputString.toCharArray();
 
        
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
 
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
 
               
                charCountMap.put(c, 1);
            }
        }
 Set<Entry <Character, Integer>> entrySet = charCountMap.entrySet();
        for (Entry entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
 
    
    public static void main(String[] args)
    {
        String str = "AjitAjit";
        characterCount(str);
    }
}