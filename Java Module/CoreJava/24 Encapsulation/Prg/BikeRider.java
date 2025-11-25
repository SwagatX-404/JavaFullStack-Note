import java.util.InputMismatchException;
import java.util.Scanner;
class BikeRider{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		Bike b1 = new Bike();
		while(true){
			try{
				System.out.print("\nChange gear: ");
				b1.setGear(scn.nextInt());
				b1.currentGear();
			}catch(InputMismatchException e){
				System.out.println("Pass only integer");
				scn.nextLine();
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
		}
		 
	}

};

///Bike.java
class Bike{
	private int gear;

	public void setGear(int gear) throws IllegalArgumentException{
		if(gear<0  || gear >5)
			throw   new IllegalArgumentException(
					"Invalid gear. Its value must be in between(0,5)");
		
		this.gear = gear;
	}

	public int getGear(){
		return gear;
	}

	public void currentGear(){
		if(gear == 0){
			System.out.println("Bike is in Neutral");
		}else{
			System.out.println("Bike is running on gear "+ gear);
		}
	}
}