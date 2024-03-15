package InterviewQuestions;
import java.util.*;
 
class GFG {
     
    public static String reverseString(String s)
    {
        StringBuilder result = new StringBuilder();
        String temp = "";
        for(int i=0;i<s.length();i++) 
        {
        	char ch = s.charAt(i);
        	
        	if(ch == ' ') 
        	{
        		if(!temp.equals("")) 
        		{
        			result.insert(0,temp+" ");
        		}
        		temp="";
        	}
        	else 
        		temp = temp+ch;
        	     
        }
       return (temp+" "+result).toString();
		
        
    }
     
    public static void main(String[] args) {
         
        String s1="Hello Monika Jadhav";      
        String result1=reverseString(s1);
        System.out.println(result1);
         
    }
    /*
     * static String reverseWords (String s1) {
		
		String str []= s1.split(" ");
		String result ="";
		
		for(int i=str.length-1;i>=0;i--) {    //"Hello Monika Jadhav"; 
			
			result =result +" "+ str[i];
		}
		
		return result.trim();
		
	}*/
     
}