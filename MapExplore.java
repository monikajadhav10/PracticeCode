package InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExplore {

	public static void main(String[] args) {
		
 HashMap<String, Integer> map = new HashMap<String,Integer>();
     map.put("m",1);
     map.put("o",2);
     map.put("n",3);
     map.put("i",4);
     map.put("k",5);
     map.put("a",6);
     
     System.out.println(map.size());
     System.out.println(map);
     System.out.println(map.values());
     System.out.println(map.keySet());
     System.out.println(map.get("m"));
     System.out.println(map.entrySet());
     
     
    Set<Entry<String, Integer>> entry = map.entrySet() ;
     
//     for(Entry<String, Integer> entryset : map.entrySet() ) {
//    	 System.out.println("key is"+ ": "+ entryset.getKey());
//    	 System.out.println("Value is"+ ": "+ entryset.getValue());
//     }
    
    Iterator<Entry<String, Integer>> itr = entry.iterator();
    
    while(itr.hasNext()) {
    	Entry<String, Integer> entryset = itr.next();
    	System.out.println(entryset.getKey() + ":" + " " +entryset.getValue());
    }
    
	}

}
