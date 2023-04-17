package questionTwelve;

import questionTwelve.FinalizePart;

public class FinalizePart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FinalizePart ran = new FinalizePart();        
	              
	        ran = null;  
	       
	        System.gc();     
	        System.out.println("Last GC ");     
	    }       
	    protected void finalize()     
	    {     
	        System.out.println("Calling the finalize()");     
	    }     
	

}
