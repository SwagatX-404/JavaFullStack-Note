/*
1. What is a constructor?
	- A named block whose name is same as current class name and 
	  does not have return type is called constructor
  
2. Why constructor?
	- A constructor is used for initializing an object's non-static fields
	  at the time of object creation. It means constructor stores values
	  inside object's non-static fields at the time of object creation.
	  
	- Once object creation is completed in the next lines,
	  object is available with user given values, 
	  but not default values
	  
3. Syntax for creating constructor?
	
		AM <classname>(parameters) throws exceptions {
			
			----	
			----			initialization logic
			----	(logic for validations and storing values in non-static fields)
			----	
		}

		AM - Accessiblity modifiers
		  allowed all 4 -> private, <default>, protected and public

4. Syntax for calling constructor?
	- we must call constructor by using 'new' keyword
	
		new classname(args);
		
		ClassName varName = new ClassName(args);

5. Below program explains 
	1. creating a consturctor 
	2. calling and executing constructor


*/

//Test01.java
class Example {
	
	
	Example() {
		System.out.println("NPC is executed");		
	}
	
	Example(int p) {
		System.out.println("IPC is executed");		
	}
	
	public static void main(String[] args) {
		
		System.out.println("MM start");
		
		//creating object and calling constructor with out assign to a variable
		new Example();
		new Example(5);
		
		//creating object and calling constructor by assign to a variable
		Example e1 = new Example();
		Example e2 = new Example(7);
		
		//just creating a variable, here object is not created and constructor is not executed
		Example e3;
		Example e4;
			
		System.out.println("MM end");
	}
}


/*
Compilation and execution
>javac Test01.java

>java Example

*/