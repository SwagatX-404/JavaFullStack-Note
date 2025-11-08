/*
==================================
Data type and Types of data types
==================================
01. Need of this chapter?
	- In this chapter we will learn 'different data types' available in Java 
	  for creating 'variables and objects' for 'storing single value' and 
	  'multiple values' as group in a program.
	  
	- For storing a value in a program we must allocate memory
	
	- To to tell to Compiler and JVM for allocating memory, 
	  we must use a set of keywords those keywords are called as data types
	
02. What is a data type?
	- A 'keyword or a class name' that is used for creating
	  a variable or an object memory for storing 'single value' or 
	  'multiple values as one group' is called data type.
	  
03. Why data type?
	- A data type is used for allocating variable or object memory
	  for storing values in the program.
	  
04. What is the information provided by the data type to the compiler and JVM?
   	- A data type (keyword or classname) provides below information 
		1. The type of memory (Integer/Floating-point/Character/Boolean/String)
		2. The size of the memory (1 or 2  or 4 or 8 bytes)
		3. The type of the value and the range of the value can be stored		
		4. The allowed operators to apply on this variable
		5. The result type comes out from an expression
		
	- Whichever the keyword or classname provides above information 
	  that keyword and classname is called data type  
	  
	  For example:
		- int, double, char, boolean, etc... are data type keywords
		- public, void, if, ... are not  data type keywords

		- String, Integer, Double, Character, Boolean, etc... are data type class names
		
05. Can we store a value in a program direclty?
	- No, it leads CE: not a statement
	- we must store value in a variable
	
06. Can we store a value in a variable without creating it?
	- No, it leads CE: can not find symbol variable
	- First we must create the variable 
	  by using data type
	  then we must store value
	  
07.	What is the sytax for creating a variable?
		
		DT variableName;
		DT variableName = value;
		
			DT can be either PDT or RDT
		
		Ex:
			int		i1;	 <---- PDT variable for storing value
			String	s1;  <---- RDT variable for storing object
					
08. Below program explains 
	1. creating a variable
	2. storing value in the variable
	3. reading variable value and printing 
	4. printing variable name and its value by using + operator
	5. diff compile time errors occured in storing value
*/
class Test01_StoringData {
	public static void main(String[] args) {
		//5		//CE: ; expected
		//5;	//CE: not a statement
		
		//x = 5;	//CE: can not find symbol variable x
		
		int x;		//no error, creating new variable
		x = 5;		//no error, storing value in this varaible x
		System.out.println("x: " + x);  //reading and printing 
										//varaible name and its value
		
		int y = 7;  //no error, creating a new variable and 
					//storing value in it in a single line
		System.out.println("y: " + y);			
					
		
	}
}


