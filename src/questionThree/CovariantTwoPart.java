package questionThree;

import questionThree.CovariantOnePart;
import questionThree.CovariantTwoPart;

public class CovariantTwoPart extends CovariantOnePart{
    @Override  
    CovariantTwoPart foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("covariant class");  
    }  

}
