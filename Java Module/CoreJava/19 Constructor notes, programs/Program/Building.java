//Building.java
class  Building {
	public static void main(String[] args) {

		Room r1 = new Room();
		System.out.println("r1 values: ");
		r1.display();
		System.out.println( );	

		r1.setL(100);
		r1.setB(30);

		System.out.println("r1 values: ");
		r1.display();
		System.out.println( );	

		r1.findArea();
		r1.findPerimeter();

		System.out.println();
/**/
	}
}