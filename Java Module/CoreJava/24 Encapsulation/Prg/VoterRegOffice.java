import java.util.InputMismatchException;
import java.util.Scanner;
class VoterRegOffice {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while(true){
			Voter v = new Voter();
			System.out.print("\nEnter name: ");
			v.setName(scn.nextLine());
			try{
				System.out.print("Enter age: ");
				v.setAge(scn.nextInt()); 

				System.out.println("Hi "+v.getName() + " your details are saved ");			
				System.out.println("Please collect your voter card ");
				System.out.println("from eseva after 30 days");			

			}catch(InputMismatchException e){
				System.out.println("Pass only integer");
				scn.nextLine();
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
		}
	}
}


///Voter.java
 class Voter {
	private int age;
	private String name;

	public void setAge(int age) throws IllegalArgumentException{

		if(age < 18 || age > 120)
			throw new IllegalArgumentException(
								"You are not eligible for voting");
	
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}

	public void setName(String name){

		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}