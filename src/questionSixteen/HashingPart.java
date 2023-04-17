package questionSixteen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashingPart {
	  public static void main(String[] args) {
		  
	        Map<String, Long> hashPart1 = new HashMap<String, Long>();
	        hashPart1.put("Din",80L);
	        hashPart1.put("Sam",50L);
	        hashPart1.put("Ron",10L);

	        Iterator<String> HshP = hashPart1.keySet().iterator();

	        while (HshP.hasNext()){
	            String key = HshP.next();
	            if ("Din".equals(key)){
	                hashPart1.put("Sam",90L);
	            }
	        }
	    }
}
