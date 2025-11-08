/**
09) Compiler and JVM activties w.r.t variable creation statement?
	 - Compiler verifies syntax by applying 5 rules 
	 - JVM allocates memory based on the given data type, name 
	   and stores the given value in this memory
	 
Below program shows all above proints
*/
class Example {
	
	public static void main(String[] args) {
	
		/*
		 Rules in compiling a variable creation statement
		 ==================================================
			1. Data type valid or not
			2. Identifier valid or not
			3. Value is valid or not 
			4. Value type compatible to variable type or not 
			5. Value range 'lesser than or equals to' variable type range or not
		   
		  Q) Just apply above rules and find "are below statements compiled or not"? 
		      ****** Don't show your talent ******
		*/
		
		//int1 i1 = 10;		//CE: can not find symbol class int1 (Rule #1 is failed)
		//int  i@2 = 20;	//CE: <identifier> expected          (Rule #2 is failed) 	
		//int  i3 = 3r4;	//CE: invalid value					 (Rule #3 is failed)	
		//int  i4 = true;	//CE: i c t: boolean and int		 (Rule #4 is failed)
		//int  i5 = 10.5;	//CE: p l c from double to int		 (Rule #5 is failed)
		
				
		int x = 5;		//no CE, no RE, 4 bytes of int type memory is allocated 
						//with name x and value 5 is stored
		System.out.println(x);

	}
}