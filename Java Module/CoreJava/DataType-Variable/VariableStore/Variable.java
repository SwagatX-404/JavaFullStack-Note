// Java Program: Understanding Variables, Objects & Memory Storage
// Compiled by: javac Variable.java
// Run by: java Variable

//---------------- CLASS DEFINITION ----------------
class Example {                  // User Defined Class (Example)
    int x = 20;                  // Instance variable x → stores integer value 20
    int y = 30;                  // Instance variable y → stores integer value 30
}

//---------------- MAIN CLASS ----------------
public class Variable {          // Main Class (Entry point of program)

    public static void main(String[] args) {        // Main method executed by JVM

        int a = 20;                                 // a[20] - Primitive Data Type (int)
        int b = m1();                               // b calls method m1() → returns 60 → b[60] - PDT

        //------------- STRING STORAGE ----------------
        String s1 = "Swagat";                      // s1 is a reference variable (RDT)
                                                    // "Swagat" stored in String Constant Pool (SCP)
                                                    // s1[1010] → address of "Swagat" → 1010["Swagat"]

        String s2 = new String("Murmu");            // s2 creates NEW string object in HEAP
                                                    // first "Murmu" goes into SCP
                                                    // then 'new' makes a separate copy in heap memory
                                                    // s2[2020] → address of heap copy → 2020["Murmu"]

        //------------- OBJECT CREATION ----------------
        Example e1 = new Example();                 // Create new Example object in heap
                                                    // e1[3030] → object address
                                                    // Inside object:
                                                    //   x[20]
                                                    //   y[30]

        //------------- OUTPUT ----------------
        System.out.println(a + "|" + b + "|" + s1 + "|" + s2 + "|" + e1.x + "|" + e1.y);
        // Output → 20|60|Swagat|Murmu|20|30
    }

    //---------------- METHOD SECTION ----------------
    public static int m1() {                        // Static method returns integer value
        return 60;                                  // returns 60 to main()
    }
}


//---------------- STRING MEMORY DIAGRAM ----------------
//
// String s1 = "Swagat";
// String s2 = new String("Murmu");
//
//                +-----------------------------+
//                |     String Constant Pool    |
//                |   "Swagat"   <--- s1        |
//                |   "Murmu"     (reference)   |
//                +-----------------------------+
//                          ↓
//                +-----------------------------+
//                |           Heap              |
//                |   new String("Murmu") <--- s2 |
//                +-----------------------------+
//
// EXPLANATION:
// 1️⃣ Java stores "Swagat" in the String Constant Pool (inside heap area).
// 2️⃣ "Murmu" is placed in the pool (if not already there).
// 3️⃣ The 'new String("Murmu")' statement creates a NEW COPY in the heap (different address).
//
//--------------------------------------------------------
