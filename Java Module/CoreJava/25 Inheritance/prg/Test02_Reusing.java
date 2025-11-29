//Below program shows reusing super class members by using sub class reference
//we can access super class members in sub class
//  1) directly by their name   ( Note: Super class NSMs can be access directly only in NSMs in sub class)
//  2) by using sub class name
//  3) by using sub class object

//In below program class B is created as sub class of class A
//so class A all members are inherited to class B

//Inherited means 'not copy and paste' class A members in class B
	//Inherited means 'class B obtain permission to access class A members'
	//either directly by their name or by using class B name or 
	//by using class B object reference

class A {
		//#4
	static int a = 10;
	int x  = 20;
}

class B extends A {
	   //#3:  
	   
	public static void main(String[] args){	//#2
		          
				   //#1:

		System.out.println(a);			//apply LPA
		//System.out.println(x);		
		
		System.out.println(B.a);		
		//System.out.println(B.x);	

		B b1 = new B();
		//System.out.println(b1.a);		
		System.out.println(b1.x);		
	}
}

//>javac Test03_Reusing.java
//		|- A.class	
//		|- B.class	

//>java B	