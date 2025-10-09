//💡 Purpose:This program performs addition of two numbers given dynamically through command-line arguments.
//javac DynamicAddition.java  
//java DynamicAddition 20 30
//Result : 50


class DynamicAddition{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int c = a+b;
        System.out.println("Result :"+ c);
    }
}


//🧠 Concepts Used:

// Command-Line Arguments: Values passed to the main() method through the command line.
// Example: In java DynamicAddition 20 30,

// args[0] = "20"
// args[1] = "30"

// Type Conversion:
// Integer.parseInt() converts a string (like "20") to an integer (20).
// Basic Arithmetic Operation: Addition of two integers.

// ⚠️ Important Notes:
// Command-line arguments are always strings, so they must be converted before performing arithmetic.
// If you run the program without arguments, it will cause an ArrayIndexOutOfBoundsException.
// Always pass two integer arguments when running this program.