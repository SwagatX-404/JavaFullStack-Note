//Class object example
public class ClassObject {

    //these are instance variable
        int i1=5;
        float f1=3.1314f;
        double d1=6.7;
        char ch = 'a';
        long[] la = {8,9,7};
        String s1 = "Swagat kumar";
    public static void main(String[] args) {
        

        //this area is local variable

        //Create an object of ClassObject -(it is a group memory allocated to ob1 through 'new' keyword )
        ClassObject ob1 = new ClassObject(); 

        //access instance variable through Object
        System.out.println(ob1.i1);
        System.out.println(ob1.f1);
        System.out.println(ob1.d1);
        System.out.println( ob1.ch);
        System.out.println( ob1.s1);
        System.out.println( ob1.la[0]);
        System.out.println( ob1.la[1]);
        System.out.println(ob1.la[2]); 


         // Using Object class methods
        System.out.println("\nUsing Object class methods:");
        System.out.println("Class Name: " + ob1.getClass());    //class ClassObject
        System.out.println("Hash Code: " + ob1.hashCode());     //1933863327
        System.out.println("To String: " + ob1.toString());     //ClassObject@7344699f
      
    }
   
   
}
