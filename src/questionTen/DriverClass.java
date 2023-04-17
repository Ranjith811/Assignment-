package questionTen;

import questionTen.subClass;
import questionTen.superClass;

public class DriverClass extends superClass {

	public static void main(String[] args) {
		
    superClass ran = new subClass();
    
    ran.methodOfSuperClass();
	}

}
