/**
Copy constructor
==================
 - A constructor whose 'parameter'  type is same as 'current class' and 
   has logic to copy non-static fields data from argument object into 
   current object is called copy constructor 
   
		For example:
			class Example {
			   int x;
			   int y;
			   
			   Example(Example e) {  //copy constructor
				   this.x = e.x;
				   this.y = e.y;
			   }
			   
			}
			
 - In the above class we have only one constrcutor, copy constructor
 - It does not have default constructor because , we have defined a contructor.
   So if we create object by using default consturctor means without passing 
   argumentswe will get CE
	For example:   
			Example e1 = new Example(); //CE
   
 - Hence for creating object of this class, we must call copy constructor
   by passing other object of this class Example.
   
Q1) How can we create other object without containing other constructors
   either no-param or param constructor?
     Not possible
	 
Q2) Can we create the 1st object of a class by using copy constructor?
	- No, not possible
	
- If a class contains only copy constructor,
  we can not create object from this class
 	  
- Hence along with copy constructor we must also contains
  either NPC or PC. 
  
- Then create 1st object by using either NPC or PC, 
  next create 2nd object by using copy constructor
  by passing this 1st object as argument.
  
- Then the 2 object contains same data of 1st object, 
  because of copy operation  

- Below program explains 
	1. creating NPC, PC and copy constructor
	2. creating object by using NPC, PC and copy constructor
*/
class Example {
	
	int x;
	int y;

	//no-param constructor
	Example() {
		x = 10;
		y = 20;
	}

	//param constructor
	Example(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//copy constructor
	Example(Example e) {
		this.x = e.x;
		this.y = e.y;
	}

	public void display(){
		System.out.println(x + "  " + y);
	}
}	

class Test02 {
	public static void main(String[] args) {
		Example e1 = new Example();	//creating object by calling NPC			
		e1.display();

		Example e2 = new Example(15, 16);	//creating object by calling PC	
		e2.display();

		System.out.println();

		e2.x = 45;	//modifying e2 object data
		e2.y = 55;

		Example e3 = new Example(e2);	//creating object by calling Copy Constructor	
		e2.display();					//this new object e3 data is same as			
		e3.display();					//e2 object data				
		System.out.println(e2 == e3);   //data is same but memory is different	
		System.out.println();
		
		Example e4 = e2;		//copying e2 object ref into e4				
		e2.display();			//both e4 and e2 pointing to same object					
		e4.display();			//here new object is not created					
		System.out.println(e2 == e4); 

/**/
	}
}
/*
=======================================================
- The difference in C++ and Java copy constructor
=======================================================
   - In Java, we must call Copy constrctor explicity by using 
     new keyword by passing other object
   
   - In C++, we no need call it expliity, 
     with '=' opertor it is implicitly called
   
	- In Java 
		Example e4 = e2; //here copy constructor is not called
		                 //just e2 reference is stored in e4 
						 //both e2 and e4 are pointing to same object
						 
	- In C++ 
		Example e4 = e2; //here copy constructor is called internally,
		                 //new object is created by copying e2 object data
						 //both e2 and e4 are pointing to 2 different objects
						 //whose data is same
						 
Q) Does Java support copy constructor?
A) Yes, we can create copy constructor
   but we must call it explicity 
   by using new kw by passing already created object
   
   
*/