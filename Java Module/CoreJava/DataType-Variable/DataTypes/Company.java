import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double sal;
    String dept;
    long mobile;
    String email;
    char gender;
    boolean work_status;
}

class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ENO: ");
        emp.eno = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        emp.ename = sc.next();

        System.out.print("Enter Employee Salary: ");
        emp.sal = sc.nextDouble();

        System.out.print("Enter Employee Department: ");
        emp.dept = sc.next();

        System.out.print("Enter Employee Mobile No: ");
        emp.mobile = sc.nextLong();

        System.out.print("Enter Employee Email: ");
        emp.email = sc.next();

        System.out.print("Enter Employee Gender: ");
        emp.gender = sc.next().charAt(0);

        System.out.print("Enter Employee WORK STATUS (true/false): ");
        emp.work_status = sc.nextBoolean();

        sc.close();

        System.out.println("\n----- EMPLOYEE DETAILS -----");
        System.out.printf("%-15s : %d%n", "ENO", emp.eno);
        System.out.printf("%-15s : %s%n", "ENAME", emp.ename);
        System.out.printf("%-15s : %.2f%n", "SALARY", emp.sal);
        System.out.printf("%-15s : %s%n", "DEPARTMENT", emp.dept);
        System.out.printf("%-15s : %d%n", "MOBILE", emp.mobile);
        System.out.printf("%-15s : %s%n", "EMAIL", emp.email);
        System.out.printf("%-15s : %c%n", "GENDER", emp.gender);
        System.out.printf("%-15s : %b%n", "WORK STATUS", emp.work_status);
    }
}
