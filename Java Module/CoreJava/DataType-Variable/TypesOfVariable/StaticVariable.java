class StaticDemo{
    //Static Variable
    static int a = 10;
    static int b = 20;

    //Non-Static Variable
        int x = 30;
        int y = 40;

}

public class StaticVariable {
    public static void main(String[] args) {
        
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        System.out.println(s1.a+" "+s1.b+" "+s1.x+" "+s1.y);
        System.out.println(s2.a+" "+s2.b+" "+s2.x+" "+s2.y);

        System.out.println("--------------------------------");
        s1.a = 17;
        s1.b = 67;
        s1.x = 99;
        s1.y = 45;

        System.out.println(s1.a+" "+s1.b+" "+s1.x+" "+s1.y);
        System.out.println(s2.a+" "+s2.b+" "+s2.x+" "+s2.y);

    }
}
