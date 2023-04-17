package questionThree;

import questionThree.CovariantOnePart;
import questionThree.CovariantOnePart;

public class CovariantPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CovariantOnePart k1 = new CovariantOnePart();  
	       k1.foo().print();    
	       CovariantTwoPart k2 = new CovariantTwoPart();  
	       ((CovariantTwoPart)k2.foo()).print();  
	}

}
