package questionSeventeen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastPart {
	   

        public static void main(String[] args)   
        {   
        	
        	
            Map<String, String> em = new HashMap<String, String>();   
            em.put("king", "KING1");   
            em.put("king1", "KING1.5");   
            em.put("king2", "KING2.5");   
            
            Iterator ffp = em.keySet().iterator();   
            
            while (ffp.hasNext()) {   
            	
                System.out.println(em.get(ffp.next()));    
                em.put("king3", "KING3.5");   
            }   
        }   
      
}
