package arraypackage;

import java.util.HashMap;
import java.util.Map;
public class Array {

	public static void main(String[] args) {
		String[] names = {"Esraa", "Jannah", "Esraa", "Alice"};

	    Map<String, Integer> counts = new HashMap<>();

	    for (String name : names) {
	      if (counts.containsKey(name)) {
	        counts.put(name, counts.get(name) + 1);
	      } else {
	        counts.put(name, 1);
	      }
	    }

	    for (Map.Entry<String, Integer> entry : counts.entrySet()) {
	      if (entry.getValue() > 1) {
	        System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
	      }
	    }
		
		
		
				
	}

}
