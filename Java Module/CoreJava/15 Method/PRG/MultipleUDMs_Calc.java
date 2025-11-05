/*
Develop 2 classes
 class 1
	- with 4 methods to perform 
	   4 arithmetic operations 
	   add, sub, mul, div

	   
class 2
   - with main method 
     by calling all above 4 methods
	 
display result on console from each method	 
   
*/

class AO {
	static void add(int a, int b){		
		int c = a + b;
		System.out.printf("The addition \t\tresult of %d and %d is %d%n", a, b, c);
	}

	static void sub(int a, int b){		
		int c = a - b;
		System.out.printf("The subtraction \tresult of %d and %d is %d%n", a, b, c);
	}
	
	static void mul(int a, int b){		
		int c = a * b;
		System.out.printf("The multiplication \tresult of %d and %d is %d%n", a, b, c);
	}
	
	static void div(int a, int b){		
		int c = a / b;
		System.out.printf("The division \t\treuslt of %d and %d is %d%n", a, b, c);
	}
	
}//AO class close

class MultipleUDMs_Calc {
	
	public static void main(String[] args) {
		
	//	add(10,5);		//CE: c f s method add(int, int)
	//	sub(10,5);		//CE: c f s method sub(int, int)
	//	mul(10,5);		//CE: c f s method mul(int, int)
	//	div(10,5);		//CE: c f s method div(int, int)	
	
		AO.add(10, 5);
		AO.sub(10, 5);
		AO.mul(10, 5);
		AO.div(10, 5);
	}
}

/*
Note: 

we can define methods in diff classes
and we can access those method from another classes

For accessing one class method from another class,
we must use classname.methodname(arguments)

*/