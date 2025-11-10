//Develop a program to initalize a NSV with variable shadowing
//Example.java
class Example {

     private int x ;
     
	 void m1(){
		 System.out.println(x);
	 }
	 
	 //intializing NSV x with variable shadowing
	 void m2(int x){ 
		 this.x = x;
	 }
}

//Test02.java
class Test02 {
	
     public static void main(String[] args) {
		Example e1 = new Example();
		
		e1.m1();
			//e1.m2(Integer.parseInt(IO.readln("Enter value for x: ")));
		e1.m1();
		
	 } 
}