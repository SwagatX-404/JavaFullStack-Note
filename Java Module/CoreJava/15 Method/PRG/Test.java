

//Test.java
public class Test {
    public static void main(String[] args) {

            Example.m1();
            Example.m2();

            //Student s3 = Example.m2();

            System.out.println(Example.m2());

    }
}

//Student.java
class Student {
    int sno;
    String sname;
    String course;
    double fee;
}

//Example.java
class Example{
    static void m1(){

        Student s1 = new Student();
        s1.sno = 101;
        s1.sname = "Swagat Murmu";
        s1.course = "Java FS";
        s1.fee = 20000;

        System.out.println(s1.sno+"     "+s1.sname+"     "+s1.course+"      "+s1.fee);
    }

    static Student m2(){

        Student s2 = new Student();
        s2.sno = 104;
        s2.sname = "Anugata Murmu";
        s2.course = "Python FS";
        s2.fee = 40000;

        return s2;

    }
}
