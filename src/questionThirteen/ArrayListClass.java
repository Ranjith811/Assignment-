package questionThirteen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
	
	public static void main(String args[]){

	    List<String> names=new ArrayList<String>();
	    names.add("Ran1");
	    names.add("Ran2");
	    names.add("Ran3");
	    names.add("Ran4");
	    
	    
	    System.out.println("List of arrayList Elements: ");
	    
	    Iterator Arr1=names.iterator();
	    
	    while(Arr1.hasNext()){
	      System.out.println(Arr1.next());
	    }
	  }
}
