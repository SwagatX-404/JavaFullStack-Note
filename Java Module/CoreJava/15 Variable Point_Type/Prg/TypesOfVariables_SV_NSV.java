/*
- Class level variables are again divided into 2 types
	1. static variables
	2. non-static variables
	
- A static varible is used for storing a value common to all objects of this class
- A non-static varible is used for storing a value separately for every object of this class

- All SVs are provided memory when thier class is loaded
- All NSVs are provided memory when thier class object is created

- All SVs are provided memory inside the class common to all objects
  and all objects are provided access to the SVs memory avaiable inside this class
- All NSVs are provided memory inside object, in each object with separate copy memory
  one object's NSV memory can not access by other object
  
- When we modify SV value by using one object,  
  that modification is effected all objects of this class
- When we modify NSV value by using one object,
  that modification is not effected to other objects
  
Below program explains 
	1. creating SV and NSV
	2. reading and printing values
	3. modifying values and 
	4. checking effect to other objects

*/

//Example.java
class Example {
	//static variables
	static int a = 10;
	static int b = 20;
	
	//non-static variables
	int x = 30;
	int y = 40;
}

//Test07_TypesOfVariables_SV_NSV.java 
class Test07_TypesOfVariables_SV_NSV {
	public static void main(String[] args) {
		
		Example e1 = new Example();
		Example e2 = new Example();
		
		System.out.println( e1.a + " " + e1.b + " " + e1.x  + " " + e1.y );
		System.out.println( e2.a + " " + e2.b + " " + e2.x  + " " + e2.y );
		System.out.println();
		
		e1.a = 15;		e1.b = 16;
		e1.x = 17;		e1.y = 18;
		
		System.out.println( e1.a + " " + e1.b + " " + e1.x  + " " + e1.y );
		System.out.println( e2.a + " " + e2.b + " " + e2.x  + " " + e2.y );
		System.out.println();
	}
}