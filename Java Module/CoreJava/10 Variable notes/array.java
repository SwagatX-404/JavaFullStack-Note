/*
Working with an array
======================
01. What is an array?
	- An array is a collection of variables of same type in 
	  continuation memory locations with single variable name
	  
	- It is a referenced data type, it is an object.

02. Why array?
	- An array is used for storing multiple values of similar type
	  in continuation memory locations as one group with single variable name

	- It is also used for passing or returning muliple values as one group 
	  to a method and from a method with single parameter and return type.

03. How can we create an array object?
	- by using data type either PDT or RDT class name

	- for storing multiple mathematical values 
		we will create an array by using PDT

	- for storing mulitple objects,
		we will create an array by using class name

04. Syntax for creating an array object?
		DT[] arrayVarName = {values or objects with , separator};
	
		//for storing values
		PDT[] arrayVarName = {v1, v2, v3, ...};
		
		//for storing objects
		RDT[] arrayVarName = {o1, o2, o3, ...};
		
		For example:
			int[]		ia = {3, 4, 5};
			String[]	sa = {"HK", "BK", "PK"};
			
05. Syntax for reading array values? 
       arrayVariableName[index]
    
	For example: 
	   - Reading and printing array values
		System.out.println(ia[0]);  //3                      
		System.out.println(ia[1]);	//4

		System.out.println(sa[0]);  //HK                        
		System.out.println(sa[1]);	//BK

06.	Syntax for storing or modifying values in array locations?
   	   arrayVariableName[index] = value;
   	   arrayVariableName[index] = obj;
	   
		ia[0] = 345;     
		ia[1] = 432;  
		
		sa[0] = "Hari";
		sa[1] = "Balayya";

07. Rule in accessing array location?
     'index must be >=0 && must be <length', else 
	 we will get exception java.lang.ArrayIndexOutOfBoundsException
     	sopln(ia[-1]); //no CE, RE: AIOOBE
     	sopln(ia[5]);  //no CE, RE: AIOOBE

08. Below program shows creating int[] array object, 
    storing multiple integers as one group with single variable name
	and later reading and printing those values console

*/
class Example {
	public static void main(String[] args) {
		
				  //0  1  2  3  4	
		int[] ia = {3, 4, 5, 6, 7};

		System.out.println("ia   : "+ ia);	//[I@1010  <- classname@reference
	
//Approach #1: Reading and printing directly	//Problem: This code is 
		//System.out.println("ia[0]: "+ ia[0]);	//static nature code because
		//System.out.println("ia[1]: "+ ia[1]);	//as and when the number of
		//System.out.println("ia[2]: "+ ia[2]);	//values in array object are 
		//System.out.println("ia[3]: "+ ia[3]);	//increased on decreased
		//System.out.println("ia[4]: "+ ia[4]);	//we must add and remove	
												//these printing stmts
		
		//System.out.println("ia[5]: "+ ia[5]);	 //RE: j.l.AIOOBE
		//System.out.println("ia[-1]: "+ ia[-1]);//RE: j.l.AIOOBE
		
 //Solution: we must develop dynamic code by using for loop

//Approach #2: Reading and printing	by using loop with index	
		for(int i=0; i<ia.length; i++){				
		
			System.out.println(ia[i]); 
		}
		System.out.println();
		
//Approach #3: Reading and priting by using for-each loop (Java 5v new feature)	

		for(int value : ia){					
			System.out.println(value); 
		}
		System.out.println();
		
//Approach #4: Directly printing by using predefiend method Arrays.toString(-)
		System.out.println(java.util.Arrays.toString(ia)); //[3, 4, 5, 6, 7]


//09. Limitation of an array object	
//    - It can store only same or similar type values
//	  - It can store either same type or lesser range type values
//	  - If we try to store different type values, or higher range type values,
//	    we will get CE: incompatible types
	  
//	- For example  			

//	int[] ia2 = {5, 6, 7};		//same type of values
	
//	int[] ia3 = {5, 'a', 7};	//similar type of values int and char
								//here 'a' is stored as 97, because location is of int type
								
//	int[] ia4 = {5, 7L, 10.5, true}; //incompatible types and higer range 
							//values are not allowed to store, we will get CE: i c t
	
	//solution: we must use class
/**/	
	}
}

/*
Assignment #1: 
  Develop a program to store floating-point values as one group by using  
  array object. Read and print those values in 2 approaches.

Assignment #2: 
  Develop a program to store String objects(names) as one group by using  
  array object. Read and print those objects in 2 approaches.

*/