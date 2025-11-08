/*
8. After creating variables, for reading and printing those variables values,
   we must access them from main method.

9. Just by declaring variables, we cannot access them 
   either for reading or for modifying their values, it leads to CE,
   because the variables created inside a class doesn't have memory by default.
   
10. We must request JVM to provide a memory to the class level variables 
   either by using 'static keyword or by using new keyword' 
   
   - for creating all variables memory as one group with single name
     we must use new keyword
	 
   - The new keyword provided group memory is called object
   
11. Below program shows providing memory to all variables of the class Example
    as one group by creating object by using new keyword
*/
class Example{
	int i1=5;
	double d1=6.7;
	char ch = 'a';
	int la[] = {8,9};
	String s1 = "hari";

}

//Test06_class.java
class testclass {
	public static void main(String[] args) {
		
		//creating object of the class Example
			//means providing memory to all non-static variables  
			//available in the class Example as one group 
			//with the single variable name e1
		Example e1 = new Example();	
		
		//printing members of the above object
		System.out.println(e1.i1);		//5
		System.out.println(e1.d1);		//6.7
		System.out.println(e1.ch);		//a
		System.out.println(e1.la[0]);	//8	
		System.out.println(e1.la[1]);	//9
		System.out.println(e1.s1);		//Hari
		
	}//main close
}//class close

/*
- Save above 2 classes in 2 different java files in the same folder as below
	1. Example.java
	2. Test06_class.java

- We 'no need to compile' both java files
  just compile Test.java, automatically 
  Compiler compiles Example.java file, 
  because we have used its name in Test.java file

>javac Test06_class.java
	|-> Test06_class.class
	|-> Example.class
	
>java Test06_class
	|-> O/P
	
	
- class object memory diagram





*/