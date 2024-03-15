package InterviewQuestions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String string = "xabcdey";
        String sub = "ab*de";
        
        if (sub.contains("*")) {
            int index = sub.indexOf("*");
            int before = string.indexOf(sub.substring(0, index));
            int after = string.indexOf(sub.substring(index + 1));
            
            if (string.charAt(before + sub.substring(0, index).length() + 1) == string.charAt(after)) {
                System.out.println(before);
            }
        } else {
            System.out.println(string.indexOf(sub));
        }
    }
}

