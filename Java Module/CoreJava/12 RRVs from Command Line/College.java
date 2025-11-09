/* 
Develop a program to read student values from command line
store those values in the Student class object, and read
those values from Student object print on console

You must read 
   sno, sname, course, fee, email, mobile, 
   gender and studyingStatus
   
   
For developing above project we must create 2 classes	
	1. Student 
		for representing Student object and 
		for storing values
		
	2. College 
		for executing the project with main method
		by creating Student object
		reading values from command line
		storing in Student object 
		printing student values on console
*/
//Student.java   
class Student {

	int	sno;
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
    
	//creating Student object    
	Student s1 = new Student();
	
	//reading values from command line and storing in student object
	s1.sno		= Integer.parseInt(args[0]);
	s1.sname	= args[1];
	s1.course	= args[2];
	s1.fee		= Double.parseDouble(args[3]);
	s1.email	= args[4];
	s1.mobile	= Long.parseLong(args[5]);
	s1.gender	= args[6].charAt(0);  //"M" -> 'M' 
	s1.studyingStatus= Boolean.parseBoolean(args[7]);
	
	System.out.println("Student values");
	System.out.println(" s1.sno\t\t\t: "		+ s1.sno);
	System.out.println(" s1.sname\t\t: "		+ s1.sname);
	System.out.println(" s1.course\t\t: "		+ s1.course);
	System.out.println(" s1.fee\t\t\t: "		+ s1.fee);
	System.out.println(" s1.email\t\t: "		+ s1.email);
	System.out.println(" s1.mobile\t\t: "		+ s1.mobile);
	System.out.println(" s1.gender\t\t: "		+ s1.gender);
	System.out.println(" s1.studyingStatus\t: "	+ s1.studyingStatus);
	
    }

}
  
/* 
Commmand for compiling and exeucting above project
>javac College.java  

>java College 101 HK CJ 3500 jhk@gmail.com 9010454584 M true
output

>java College 102 BK Acting 4500 nomail@gmail.com 9010454585 M true
output
*/