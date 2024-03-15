package InterviewQuestions;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                list.add(2);
                list.add(2);
                list.add(4);
                
                for(Integer integer: list) 
                	System.out.print(list);
                
	}

}
