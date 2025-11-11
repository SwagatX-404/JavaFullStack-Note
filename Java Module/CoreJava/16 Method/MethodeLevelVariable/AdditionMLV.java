public class AdditionMLV {

    //Methode 
    static void add(int a, int b){  //int a, int b -> are parameter
        int c = a+b;
        System.out.println("Result: "+ c);
    }

    public static void main(String[] args) {
        //methode calling ...
        add(10,20);  // passing argument 10,20
        add(30,40);
        add(100,78);

    }
}