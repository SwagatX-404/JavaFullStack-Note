//The problem in the above program is 
	//the method caller does not know
	//that the m2() method is initializing SV a
	//because parameter name is not same as SV name
	
//Solution: 
	//Implement Variable shadowing, means take parameter name
	//same as Static Variable name

//the differentiate SV from parameter by using classname
//as shown below

class Example {

     private static int a ;
     
	 static void m1(){
		 System.out.println(a);
	 }
	 
	 //intializing SV a with variable shadowing
	 static void m2(int a){ 
		 Example.a = a;
	 }
	 
}

class Test {
	
     public static void main(String[] args) {
		//System.out.println(a); //CE
     
		Example.m1();
			//Example.m2(Integer.parseInt(IO.readln("Enter value for a: ")));
		Example.m1();
		
	 }
	 
}