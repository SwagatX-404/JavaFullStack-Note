import java.util.Scanner;
class ReadAllTypesofValuesByUsingScanner {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter byte value: ");
		byte b1 = scn.nextByte();

		System.out.print("Enter short value: ");
		short s1 = scn.nextShort();

		System.out.print("Enter int  value: ");
		int i1 = scn.nextInt();

		System.out.print("Enter long value: ");
		long l1 = scn.nextLong();

		System.out.print("\nEnter float value: ");
		float f1 = scn.nextFloat();

		System.out.print("Enter double value: ");
		double d1 = scn.nextDouble();

		System.out.print("\nEnter char value: ");
		char c1 = scn.next().charAt(0);

		System.out.print("Enter boolean value: ");
		boolean bo = scn.nextBoolean();
		
		System.out.print("\nEnter String value one word: ");
		String str1 = scn.next();  
                      scn.nextLine();
		
		System.out.print("\nEnter String value one line: ");
		String str2 = scn.nextLine();

		System.out.println("\nb1: "+ b1);
		System.out.println("s1: "+ s1);
		System.out.println("i1: "+ i1);
		System.out.println("l1: "+ l1);
		System.out.println("f1: "+ f1);
		System.out.println("d1: "+ d1);
		System.out.println("c1: "+ c1);
		System.out.println("bo: "+ bo);
		System.out.println("st2: "+ str1);
		System.out.println("str1: "+ str2);

        scn.close();
	}
}