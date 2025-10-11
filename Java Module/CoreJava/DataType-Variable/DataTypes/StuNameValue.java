import java.util.Scanner;

public class StuNameValue {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        System.out.println("Enter ID No:");
        id = sc.nextInt();

        System.out.println("Enter Yr Name:");
        name = sc.next();

        System.out.println("ID is :"+id);
        System.out.println("Name is :"+ name);



        sc.close();
    }
}
