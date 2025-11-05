class Student{
	int sno;
	String sname;
	String course;
	double fee;
}

class College {
	void displayStudent(){
		Student s1  = new Student();

		s1.sno = 101;
		s1.sname = "HK";
		s1.course = "CJ";
		s1.fee = 2500;

		System.out.println(
			s1.sno + "  " + s1.sname + "  " + s1.course + "  " + s1.fee );
	}

	Student getStudent(){
		Student s2 = new Student();

		s2.sno = 102;
		s2.sname = "BK";
		s2.course = "Acting";
		s2.fee = 3500;

		return s2;
	}

}

class VoidNV_Project {
	public static void main(String[] args) {
		College clg = new College();

		clg.displayStudent();
		System.out.println();	
		
		Student s3 = clg.getStudent();
		System.out.println(
			s3.sno + "  " + s3.sname + "  " + s3.course + "  " + s3.fee);

		System.out.println();
		clg.getStudent();

		System.out.println();
		System.out.println(clg.getStudent());
/**/
	}
}