package com.tcs.conditionalStatements;

/*
Conditional statements- Execute a statment in code based on a condition.
If the condition is satisfied  a line of coed will be exectued 

There are three conditional statements

1) if
2) if else
3) if Else if
4) Ternary operator
5) switch case

*/

public class ConditionalStatements {

	public ConditionalStatements() {
		// TODO Auto-generated constructor stub
	}
	
	public void ConditionalStatmentsExample(){
		// condition - returns a true or false on evaluation
		int a =10;
		// condition = a==10 -> returns true or false
		System.out.println((a==10));
		
		// basic If with a condition
		if(a==10){
			// Executed only if the condition is satisfied
			System.out.println(" a is 10 !!!");
		}
		
		// If Else
		if(a == 10)
		{
			// Executed only if the condition is satisfied
			System.out.println(" a is 10 !!!");
		}
		else{
			// Executed only if the condition is NOT  satisfied
			System.out.println(" a is not a 10 !!!");
		}
		
		// Ternary operator is a shorthand - one line of if else
		// syntax - resultValue = conditon ? true case : false case
		// Always return result must be saved in a variable
	
		String result = (a==10) ? " a is 10 !!!" : " a is not a 10 !!!";
		
		System.out.println(result);
		
		
		// if - else if - else
		// Check for no  0 or positive or negative
		// can be only one if 
		if(a >0 ){
			// Executed only if the condition is satisfied
			System.out.println(" a is positive");
		}
		//  - only if is false na else if checked
		// Can add many else if 
		else if (a < 0){
			// Executed only else if  condition is satisfied
			System.out.println(" a is negative");
		}
		//Executed only when if , all the else if condition are all false
		else{
			System.out.println(" a is Zero");
		}
		
		
	}
	
	
	

}
