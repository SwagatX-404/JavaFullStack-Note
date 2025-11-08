/*
Variable realated topics
==========================
01) What is a variable?
02) Why variable?
03) How can we create a variable?
04) Syntax for creating a variable?
05) Sample program for creating PV and RV?
06) What is the value allowed to store in PV and RV?
07) How can we create an object?
08) Difference between PV and RV?

Below program shows all above proints


*/
class Example {
	public static void main(String[] args) {
		//10;			//CE: not a statement
		//a = 10;		//CE: c f s variable a
		
	//primitive variables					
		int a;			//primitive variable creation without value
		a = 10;			//initializing (storing value in) primitive variable a
		
		int b = 20;		//creating and initalizing primitive variable b
			
		System.out.println("a: " + a);  //reading and printing variable a
		System.out.println("b: " + b);	//reading and printing  varaible b
	//=========================================================================	
		//"Hari";			
		//s1 = "Hari";	
		
	//Referenced variables	
		String s1;			//Referenced variable creation
		s1 = "Hari";		//initializing (storing object in) referenced variable s1
	
		String s2 = "NiT"; //creating and initalizing referenced variable s2

		System.out.println("s1: " + s1);  //reading and printing variable s1
		System.out.println("s2: " + s2);	//reading and printing  varaible s2
	
	//========================================================================
	
		//int		i1 = "Hari";	//CE: i c t:  String and int
		//String	s3 = 101;		//CE: i c t: int and String
		
	}
}