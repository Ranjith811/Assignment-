package questionFourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedPart {

	public static void main(String[] args) {
		
		
		 List<String> synsc = new ArrayList<String>();
	      synsc.add("BVRM");
	      synsc.add("HYD");
	      synsc.add("KKD");
	      synsc.add("TEL");
	      
	      
	      List<String> namesCity = Collections.synchronizedList(synsc);
	      
	      synchronized(namesCity) {
	    	  
	         Iterator<String> city1 = namesCity.iterator();
	         
	         while(city1.hasNext()) 
	         
	         {
	            String city2 = city1.next();
	            System.out.println(city2);
	         }
	      }
	   }
}
