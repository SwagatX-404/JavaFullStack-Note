class College {
	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println("s1 object is created");
		s1.display();

		s1.setSno(101);
		s1.setSname("HK");
		
		System.out.println("\ns1 object values");
		System.out.println("  sno\t\t: "		+ s1.getSno());
		System.out.println("  sname\t\t: "		+ s1.getSname());
	}
}


//Student.java
class Student {

	private int sno;
	private String sname;

	void setSno(int sno){
		this.sno = sno;
	}

	int getSno(){
		return sno;
	}

	void setSname(String sname){
         this.sname = sname;
	}

	String getSname(){
		return sname;
	}

	public void display(){
		System.out.println(sno + "  " + sname);
	}
}