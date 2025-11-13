/*
06. Below program explains initializing NSVs

*/

//Test02.java
class Example {
	
	private int x;
	private int y;
	
		
	Example() {	 //no VS, hence compiler adds this. to NSV x and y
		x = 10;
		y = 20;
	}
	
	Example(int x, int y) { //VS, hence compiler does not add this. to NSV
		this.x = x;			//we must add this.
		this.y = y;
	}
	
	void display(){
		System.out.println(" x: "+ x);	
		System.out.println(" y: "+ y);	
	}
	
}//Example close


class Test02 {
	public static void main(String[] args) 	{
		System.out.println("Test MM start");
		
		//Creating Example class objects
		Example e1 = new Example();
		
		
		Example e2 = new Example(15, 16);
		
		//printing object values
		System.out.println("\ne1 object values");
		e1.display();
		
		System.out.println("\ne2 object values");
		e2.display();
		
	}
}

