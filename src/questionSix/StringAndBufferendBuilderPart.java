package questionSix;

public class StringAndBufferendBuilderPart {
	
	 public static String concatWithString()    {  
	        String b = "Hello";  
	        for (int i=0; i<1000; i++){  
	            b = b + "Hi";  
	        }  
	        return b;  
	    }  
	    public static String concatWithStringBuffer(){ 
	    	
	        StringBuffer sb = new StringBuffer("Hello");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Hi");  
	        }  
	        return sb.toString();  
	    }
}
