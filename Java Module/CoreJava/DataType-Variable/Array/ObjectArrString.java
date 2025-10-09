public class ObjectArrString {
    String name;
    ObjectArrString (String n)
    {
        name = n;
    }
    public static void main(String[] args) {

        ObjectArrString[] stu = new ObjectArrString[3];

        stu[0] = new ObjectArrString("Swagat");
        stu[1] = new ObjectArrString("Raju");
        stu[2] = new ObjectArrString("Anuu");
        
        for (int i=0; i<stu.length; i++)
        {
            System.out.println("Student  :"+ (i+1)+"*"  + stu[i].name );
        }
        
    }
}
