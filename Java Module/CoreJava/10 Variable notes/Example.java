/**
Working with a class?
==============================
01. What is a class?
	- A class is a user defefined data type
	- It is a referenced data type

02. Why a class?
	- A class is used for storing single and multiple values
	  of same or different type as one group with single variable name
	  
03. How can we create a class?
	- by using the keyword 'class' followed by 'class name'
	
04. Syntax for creating a class?
		class <ClassName> {
			
		}

05. How can we store data inside this class object?
	- Inside this class we must create variables
	  based on the type of values and number of values 
	  we want to store
	  
06. Full syntax of a class for storing values?	  
	class <ClassName> {
	    -- variables  	
			--	of PDT and RDT
			--	based on the type of
			--  values and type of objects 
			--  we want to store
	}
	
07. Below program shows create a class 
    as user defined data type for 
	storing primitive values, array object and 
	String class object as one group

*/
//Example.java
class Example {			//class Example is a Data type class, 
							//the name of the data type is the class name 'Example'
	int		i1 = 5;			//by using this class name 'Example' (data type name)
	double	d1 = 6.7;		//we can create 'variable and object' in user class Test
	char	ch = 'a';
	long[]	la = {8, 9};
	String  s1 = "Hari";	
	
}