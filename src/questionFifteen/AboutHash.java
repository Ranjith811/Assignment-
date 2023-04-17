package questionFifteen;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class AboutHash {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> hasPart=new Hashtable<Integer,String>();
		
		hasPart.put(1," a1");
		hasPart.put(2,"b2");
		hasPart.put(3,"c3");
		hasPart.put(4,"d4");
		
        System.out.println("*****************Hash*********************");
        
        for (Map.Entry pa:hasPart.entrySet()) 
        
        {
            System.out.println(pa.getKey()+" "+pa.getValue());
        }
      
        HashMap<Integer,String> hasPart2=new HashMap<Integer,String>();
        
        hasPart2.put(100,"E");
        hasPart2 .put(101,"F"); 
        hasPart2.put(102,"G");
        hasPart2.put(103,"H");
        
        System.out.println("****************Hash************************");
        
        for (Map.Entry m:hasPart2.entrySet()) 
        
        {
            System.out.println(m.getKey()+" "+m.getValue());
	}
	}
}
