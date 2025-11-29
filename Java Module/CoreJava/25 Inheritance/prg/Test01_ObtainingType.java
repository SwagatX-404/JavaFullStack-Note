//Test01_ObtainingType.java
class Person { }
class Student extends Person { }
class Faculty extends Person { }
class Admin { }

class Test01_ObtainingType{
	public static void main(String[] args) {

		Person p1 = new Person();	System.out.println(p1);
		Person p2 = new Student();	System.out.println(p2);
		Person p3 = new Faculty();	System.out.println(p3);
		//Person p4 = new Admin();    System.out.println(p4);  //type mismatch : not convert Admin to person

		//Student s1 = new Person();  			//type mismatch : not convert  person to student
		//Student s2 = new Student();
		//Student s3 = new Faculty();
		//Student s4 = new Admin();

		allow(new Person());
		allow(new Student());
		allow(new Faculty());
		//allow(new Admin());
/**/
	}//main close

	static void allow(Person p){}

	static Person  get1(){
		return new Person();
	}
	static Person  get2(){
		return new Student();
	}
	static Person  get3(){
		return new Faculty();
	}
	// static Person  get4(){
	// 	return new Admin();
	// }
	static Student get5(){
		return new Student();
	}
	// static Student get6(){
	// 	return new Person();
	// }
	// static Student get7(){
	// 	return new Facutly();
	// }
/*	*/
}