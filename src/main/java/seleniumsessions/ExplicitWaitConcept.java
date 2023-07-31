package seleniumsessions;

public class ExplicitWaitConcept {

	public static void main(String[] args) {


		// ExpicitWait:
			//1. WebDriverWait
			//2. FluentWait
		
		//Wait(I):until()------->FuentWait(ParentClass)----->WebDriverWait(ChildClass)
									//until(){}              //inherit from FluentWait
									//+other methods
		
		// Explicit is not a global wait
		//will be applied for specific element
		//for username we can apply 10 sec, fro pw we can apply 5 sec and so on.
		//can be applied for  non web elements: url, title, alerts
		//expectedconditions-----> various conditions
		
		
		
	}

}
