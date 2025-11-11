/*
	Develop a Addition class with add() method to take two integers as arguments
	add those two values and return result
*/
//Addition.java
class Addition {
	
	static int add(int p, int q) {
		int r = p + q;
		return r;
	}
	
}

//Calc.java
class Calc {
	public static void main(String[] args) {
		
		int res = Addition.add(10, 20);
		System.out.println(res);
	}
}

/*
>javac Calc.java
  |-> Calc.class
  |-> Addition.class
  
>java Calc  
	
*/