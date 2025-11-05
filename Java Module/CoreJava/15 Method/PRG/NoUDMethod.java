public class NoUDMethod {
    public static void main(String[] args) {
		
		//adding 2 numbers
		int i1 = 10;
		int i2 = 20;
		int i3 = i1 + i2;
		System.out.printf("The addition of %d and %d is %d%n", i1, i2, i3);
		
		int i4 = 50;		//the same above logic is repeated for new set of values
		int i5 = 60;			//hence this code is called redundent
		int i6 = i4 + i5;
		System.out.printf("The addition of %d and %d is %d%n", i4, i5, i6);
		
		int i7 = 70;		//the same above logic is repeated for new set of values
		int i8 = 80;			//hence this code is called redundent
		int i9 = i7 + i8;
		System.out.printf("The addition of %d and %d is %d%n",i7, i8, i9);
		
		//writing code more than once and doing changes at mulitple places
		//is called code redundency
		
		//Solution: write code only once, change code only one place
		           //and reuse that code by calling it mulitple times 
				   //for either same or diff values
		//this style of writing code is called code reusablility
		//For developing reusable code, we must use method
	}
}
