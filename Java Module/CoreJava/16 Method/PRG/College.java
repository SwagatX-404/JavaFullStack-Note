class Mark{
    int CSE;
    int CD;
    int CN;

    void marksheet(){
        System.out.println("CSE:"+CSE);
        System.out.println("CD:"+CD);
        System.out.println("CN:"+CN);
        System.out.println(".................................");
    }
}

public class College {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Mark m1 = new Mark();
        Mark m2 = new Mark();

        s1.sno = 1;
        s1.name = "Swagat";
        m1.CSE = 98;
        m1.CD = 92;
        m1.CN = 88;

        s2.sno = 2;
        s2.name = "HK";
        m2.CSE = 78;
        m2.CD = 42;
        m2.CN = 68;

        s1.display();
        m1.marksheet();
        
        s2.display();
        m2.marksheet();

        
    }
}
