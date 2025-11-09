import java.util.Scanner; 
class ReadNumName{
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int sno = scn.nextInt();		
                //scn.nextLine();

		System.out.print("Enter name: ");
		String sname = scn.next();//Line();  

		System.out.println("\n\nYou entered");
		System.out.println(" Student num\t: "+ sno);
		System.out.println(" Student name\t: "+ sname);

        scn.close();
	}
}
