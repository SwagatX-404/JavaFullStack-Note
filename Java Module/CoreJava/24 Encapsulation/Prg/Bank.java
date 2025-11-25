
//Bank.java
import java.util.Scanner;
class Bank{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		BankAccount acc1 = new BankAccount();  //[balance=0.0]
		
		while(true) {
			try {
				
				System.out.print("\nEnter balance: ");
				acc1.setBalance(scn.nextDouble());
				
				System.out.println("Current Balance: "+ acc1.getBalance());
				break;		
				
			}catch(IllegalArgumentException e) {
				System.out.println("Error: "+ e.getMessage());	
			}

		}//while(true) close
	}//main close
}//class close

//1. In above program we have used try/catch 
	//1. for catching the exception thrown from setBalance() method
	//2. for stop terminating main method execution abnormally and
	//3. for displaying error message on console in user understand way

//2. We also used e.getMessage() method, it is a predefined method available in
//   IllegalArgumentException class. It reads and returns the error message available 
//   in this exception object that is caught by catch block

//3. We used while loop for reexecuting the same code, when wrong values are passed

//4. Inside loop we used break, for terminating loop, when correct value is passed

//5. final conclusion: Just Encapsulation code[privare fields with setter and getter methods]
//   does not provide security, can not stop storing wrong values. 
//		For providing security and for stop storing wrong values 
//		we must develop validation code[if condition with exception handling]
//		inside setter and getter methods where ever it is needed {
    

//Develop BankAccount application by encapsulating balance variable
//also develop validation to stop storing -ve values and zero

//BankAccount.java
class BankAccount {

	private double balance;
	
	public void setBalance(double balance) throws IllegalArgumentException {
		if(balance <=0 )
			throw new IllegalArgumentException("Do not pass -ve balance or zero");
		
		this.balance = balance;	
	}
	
	public double getBalance() {
		return balance;	
	}

}

//in above program 
	//throw is used for throwing an exception, when wrong values are passed

	//throws is used for reporting or informing the thrown exception to this method caller
		//then by seeing throws Exception, this method caller will come to know that 
		//this method is throwing an Exception, hence he will catch that exception 
		//by using try/catch in his code when he calls this method.


