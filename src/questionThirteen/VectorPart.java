package questionThirteen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorPart {

	public static void main(String[] args) {
		
		Vector<String> names=new Vector<String>();
	    names.add("Ran1");
	    names.add("Ran2");
	    names.add("Ran3");
	    names.add("Ran4");
	    
	    System.out.println("List Of Vector Class Elements: ");
	    
	    Iterator Vector1=names.iterator();
	    
	    while(Vector1.hasNext()){
	    	
	      System.out.println(Vector1.next());
	      
	    }
	  }
	

}
