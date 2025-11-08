/**
10) Limitation of a variable?
    - A variable can store only one value at a time

    - If we try to store multiple values, 
      old value is replaced with new value

    - Then when we read variable, always it returns
      the latest modified value

- Below program shows the limitaion of a variable

*/
class Example {
	public static void main(String[] args) {
		int a;
		
		a = 10;
		System.out.println("a: "+ a);
		
		a = 20;
		System.out.println("a: "+ a);
	//==============================================
		String s1;
		
		s1 = "Hari";
		System.out.println("s1: "+ s1);
		
		s1 = "HK";
		System.out.println("s1: "+ s1);
		
	}
}