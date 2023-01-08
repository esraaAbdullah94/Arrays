package arraypackage;

import java.util.HashMap;
import java.util.Map;
public class Array {

	public static void main(String[] args) {
		String[] names = {"Esraa", "Jannah", "Esraa", "Alice","Jannah"};

		Map<String, Integer> counts = new HashMap<>();

	    for (String name : names) {
	      if (counts.containsKey(name)) {
	        counts.put(name, counts.get(name) + 1);
	      } else {
	        counts.put(name, 1);
	      }
	    }

	    for (String name : names) {
	      if (counts.get(name) > 1) {
	        System.out.println(name + " appears " + counts.get(name) + " times");
	      }
	    }
		
		
				
	}

}
