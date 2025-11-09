class FormattingData 
{
	public static void main(String[] args) 
	{
		
		/*
			%d	-> integer (b, s, i, l)
			%f	-> float   (f, d)
			%c	-> char
			%b	-> boolean
			%s	-> string
			
		*/

		//System.out.printf(10);
		System.out.printf("",10);
		System.out.printf("Hi\n",10);
		System.out.printf("Hi%d\n",10);
		
		System.out.printf("Hi%f\n",10.f);
		System.out.printf("Hi%.2f\n",10.f);
		System.out.println();  		
		
		System.out.printf("sno:\n");
		System.out.printf("sname:\n");
		System.out.printf("course:\n");
		System.out.printf("fee:\n");
		System.out.println();  		
		
		System.out.printf("%s:\n", "sno");
		System.out.printf("%s:\n", "sname");
		System.out.printf("%s:\n", "course");
		System.out.printf("%s:\n", "fee");
		System.out.println();  		
		
		System.out.printf("%10s:\n", "sno");
		System.out.printf("%10s:\n", "sname");
		System.out.printf("%10s:\n", "course");
		System.out.printf("%10s:\n", "fee");
		System.out.println();  		
		
		System.out.printf("%-10s:\n", "sno");
		System.out.printf("%-10s:\n", "sname");
		System.out.printf("%-10s:\n", "course");
		System.out.printf("%-10s:\n", "fee");
		System.out.println();  		
		
		System.out.printf("%-10s: %d\n"		, "sno"		, 101);
		System.out.printf("%-10s: %s\n"		, "sname"	, "H K");
		System.out.printf("%-10s: %s\n"		, "course"	, "C J");
		System.out.printf("%-10s: %.2f\n"	, "fee"		, 3500.0);
		
	}
}