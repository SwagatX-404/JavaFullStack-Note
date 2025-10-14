class Test {
    public static int m(int a) {
        return a + 1;
    }

    public static int m(int a, int b) {
        return a + b;
    }

    public static int m(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(Test.m(2));          // calls m(int)
        System.out.println(Test.m(2, 3));       // calls m(int, int)
        System.out.println(Test.m(2, 3, 4));    // calls m(int, int, int)
    }
}
