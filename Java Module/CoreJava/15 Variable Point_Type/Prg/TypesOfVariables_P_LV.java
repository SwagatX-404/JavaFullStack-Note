/*
Method level variables
======================
- The method level variables are divided into 2 types
	1. Paramter
	2. Local variable
	
- The variable declared in method paranthesis is called parameter
  it is used for recieving inputs from this method caller 
  for executing this method logic
  
	For example: here 'int a & int b' are parameters
		static void add(int a, int b) { 
			
			
		}
		
		add(10, 20); 
		   //here 10 and 20 are inputs to the parameters
		   //inputs are technically called arguments
  
- The variable declared inside method body is called local variable.
  It is used for storing a value or a result specific to this method operation.
  
		static void add(int a, int b) {
			 
			  int c = a + b;
			  
		      //here int c is local variable	  
		}

- A Parameter and a LV gets memory only when thier enclosing method is called
	in the above program add() method is the enclosing method of 
	the parameters a,b & LV c
- After method execution is completed, those memories are destroyed.	

- A parameter and LV gets memory multiple times, 
  one copy memory every time when method is called
  
- Below program explains 
	1. creating parameters and LV
	2. memory allocation, destorying and
	3. allocating multiple times
*/

//Addition.java
class Addition {

	static void add(int a, int b) {
		
		int c = a + b;
		
		System.out.println("Result: "+ c);
	}

	public static void main(String[] args) {
		System.out.println("main start");
		add(10, 20);
		
		add(30, 40);
		System.out.println("main end");
	}
		
}