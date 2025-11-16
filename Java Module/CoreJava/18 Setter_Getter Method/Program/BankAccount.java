
public class BankAccount {
	private static String bankName;
	
	private long accNum;
	private boolean active;

	public static void setBankName(String bankName) {
		//this.bankName = bankName;
	}

	public static String getBankName() {
		return bankName;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}


	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isActive() {
		return active;
	}

	public void display(){
		System.out.println("  bankName\t: "	+ bankName);
		System.out.println("  accNum\t: "	+ accNum);
		System.out.println("  active\t: "	+ active);
	}
}


//Company.java
class Bank {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		System.out.println("acc1 object is created");

		System.out.println("\nacc1 object values");
		acc1.display();
		System.out.println();
		
		if(acc1.isActive())
			System.out.println("acc1 is active");
		else
			System.out.println("acc1 is not active");
		
		//initializing object via setter methods
		//acc1.setBankName("HDFC");
		acc1.setAccNum(12345);
		acc1.setActive(true);

		System.out.println("\nacc1 object values");
		acc1.display();
		System.out.println();
		
		System.out.println(
			acc1.isActive() ? "acc1 is active" : "acc1 is not active");
		
	}
}