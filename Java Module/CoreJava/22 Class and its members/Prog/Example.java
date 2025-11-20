 class Example {

    static int a = m1();//1st O/P

    static int m1(){
        System.out.println("SV1 : a"); //1st O/P
        return 10;
    }

    static{
        System.out.println("SB1"); //2nd
    }

    static int b = m2(); //3rd

    static int m2(){
        System.out.println("SV2: b");  //3rd
        return 20;
    }

    static void m4(){
        System.out.println("SM");
    }

    public static void main(String[] args) {
        System.out.println("MM");           //6th  //last
    }

    static int c = m3();   //4th

     static int m3(){
        System.out.println("SV3 : c");  //4th
        return 30;
     }

     static {
        System.out.println("SB2");   //5th
     }

}
