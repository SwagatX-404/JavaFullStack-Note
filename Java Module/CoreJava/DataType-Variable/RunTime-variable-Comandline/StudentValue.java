public class StudentValue {
    
   public static void main(String[] args) {
        int sno = Integer.parseInt(args[0]);
        String sname = args[1];
        String course = args[2];
        double fee = Double.parseDouble(args[3]);
        String email = args[4];
        long mob = Long.parseLong(args[5]);
        char gender = args[6].charAt(0);
        boolean status = Boolean.parseBoolean(args[7]);

//101 Swagat MCA 45000.50 swagat@gmail.com 9876543210 M true

        System.out.println("----- Student Details -----");
        System.out.println("Student No : " + sno);
        System.out.println("Name       : " + sname);
        System.out.println("Course     : " + course);
        System.out.println("Fee        : " + fee);
        System.out.println("Email      : " + email);
        System.out.println("Mobile No  : " + mob);
        System.out.println("Gender     : " + gender);
        System.out.println("Status     : " + status);
    }
}
