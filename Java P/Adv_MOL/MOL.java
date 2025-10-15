class Test{
    public void accept(double d){
        System.out.println("Double");
    }

    public void accept(float d){
        System.out.println("Float");
    }
}

public class MOL {
    public static void main(String[] args) {
        Test t = new Test();

        t.accept(6); ///Float
        //ans "Float" Bcoz Type promotion rule 6 is integer "int" type but can not find exact match so he priotiz FLOAT type.
        
        // byte -> short -> "int" -> long -> "float" -> double 

        //char -> int -> long -> float -> double
    }
}
