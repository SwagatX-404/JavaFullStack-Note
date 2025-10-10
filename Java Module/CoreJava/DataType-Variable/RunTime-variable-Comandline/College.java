//for executing the project with main method by creating Student object
		//reading values from command line
		//storing in Student object 
		//printing student values on console
//404 Swagat MCA 75000 swg123@gmail.com 8018737234 M true

public class College {
    
    public static void main(String[] args) {
        
    //From "Student.java" file   -->Creating Student Object 
        Student s = new Student();

    //reading values from command line
        s.sno = Integer.parseInt(args[0]);
        s.sname = args[1];
        s.course = args[2];
        s.fees = Double.parseDouble(args[3]);
        s.email = args[4];
        s.mob = Long.parseLong(args[5]);
        s.gender = args[6].charAt(0);  //"M" = 'M'
        s.studying_status = Boolean.parseBoolean(args[7]);
       
    //printing student values on console
        System.out.println("Student S.NO             : " + s.sno);
        System.out.println("Student NAME             : " + s.sname);
        System.out.println("Student COURSE           : " + s.course);
        System.out.println("Student FEES             : " + s.fees);
        System.out.println("Student EMAIL            : " + s.email);
        System.out.println("Student MOBILE NO.       : " + s.mob);
        System.out.println("Student GENDER           : " + s.gender);
        System.out.println("Student STUDYING STATUS  : " + s.studying_status);



    }
}
