package questionSeventeen;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafePart {
	  public static void main(String args[])   
	    {   
	        CopyOnWriteArrayList<Integer> safe 
	        
	            = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 2, 9, 13 });   
	        Iterator fs = safe.iterator();   
	        while (fs.hasNext()) {   
	            Integer ffss = (Integer)fs.next();   
	            System.out.println(ffss);   
	            if (ffss == 1)   
	                safe.add(25);   
	        }   
	    }  
}
