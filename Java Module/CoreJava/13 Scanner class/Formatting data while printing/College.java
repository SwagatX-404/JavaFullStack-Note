import java.util.Scanner;


//Student.java   
class Student{

	int		sno;
	String	sname;
	String	course;
	double	fee;
	String	email;
	long	mobile;
	char	gender;
	boolean	studyingStatus;
}


//College.java
class College {
    public static void main(String[] args) {
    
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student();
		System.out.println("Enter Student details");

		String width = "-20";
		System.out.printf("  %"+width+"s: ", "sno");
		s1.sno = scn.nextInt();  scn.nextLine();
		
		System.out.printf("  %"+width+"s: ", "sname");
		s1.sname = scn.nextLine();
		
		System.out.printf("  %"+ width +"s: ", "course");
		s1.course = scn.nextLine();
		
		System.out.printf("  %"+width+"s: ", "fee");
		s1.fee = scn.nextDouble();
		
		System.out.printf("  %"+width+"s: ", "email");
		s1.email = scn.next();
		
		System.out.printf("  %"+width+"s: ", "mobile");
		s1.mobile = scn.nextLong();
		
		System.out.printf("  %"+width+"s: ", "gender");
		s1.gender = scn.next().charAt(0);
		
		System.out.printf("  %"+width+"s: ", "studyingStatus");
		s1.studyingStatus = scn.nextBoolean();
		
        scn.close();
		
		System.out.println("\nStudent values");
		System.out.printf("  %"+width+"s: %d\n",	"s1.sno"		, s1.sno);		
		System.out.printf("  %"+width+"s: %s\n",	"s1.sname"		, s1.sname);		
		System.out.printf("  %"+width+"s: %s\n",	"s1.course"		, s1.course);		
		System.out.printf("  %"+width+"s: %,.2f\n","s1.fee"		, s1.fee);		
		System.out.printf("  %"+width+"s: %s\n",	"s1.email"		, s1.email);		
		System.out.printf("  %"+width+"s: %d\n",	"s1.mobile"		, s1.mobile);		
		System.out.printf("  %"+width+"s: %c\n",	"s1.gender"		, s1.gender);		
		System.out.printf("  %"+width+"s: %b\n",	"s1.studyingStatus", s1.studyingStatus);		
		System.out.printf("  %"+width+"s: %b\n",	"s1.studyingStatus", s1.studyingStatus);		
    }
}