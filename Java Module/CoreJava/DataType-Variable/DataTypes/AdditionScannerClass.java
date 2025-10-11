import java.util.Scanner;
class AdditionScannerClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first No: ");
        int a = sc.nextInt();

        System.out.println("Enter first No: ");
        int b = sc.nextInt();

        int x = a + b ;
        System.out.println("Result :" + x);

        sc.close();
    }
}