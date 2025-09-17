# Java Interview Q&A Flashcards

## 1. What is Java?
👉 Java is a **high-level, object-oriented, platform-independent language** developed by James Gosling at Sun Microsystems in 1995.

---

## 2. What are the main features of Java?
👉 Simple, Object-Oriented, Platform-Independent, Robust, Secure, Multithreaded, Distributed.

---

## 3. Difference between JDK, JRE, and JVM?
- **JVM**: Executes bytecode.  
- **JRE**: JVM + libraries to run Java programs.  
- **JDK**: JRE + development tools (compiler, debugger).

---

## 4. What makes Java platform-independent?
👉 Java code is compiled into **bytecode**, which runs on the **JVM** across different platforms.

---

## 5. Difference between Java and C++?
👉 Java is platform-independent, has garbage collection, does not support multiple inheritance directly, and is purely object-oriented (except primitives).

---

## 6. Explain OOP concepts in Java.
- **Encapsulation** → Binding data & methods in a class.  
- **Inheritance** → Reuse of parent class properties.  
- **Polymorphism** → One task in multiple forms (overloading/overriding).  
- **Abstraction** → Hiding implementation details.

---

## 7. What is Garbage Collection in Java?
👉 Automatic memory management that clears unused objects from **heap memory**.

---

## 8. Difference between Checked and Unchecked Exceptions?
- **Checked**: Checked at compile time (IOException).  
- **Unchecked**: Occur at runtime (NullPointerException).

---

## 9. What are `final`, `static`, `this`, and `super` used for?
- **final** → Constants, prevent inheritance/overriding.  
- **static** → Belongs to class, not object.  
- **this** → Refers to current object.  
- **super** → Refers to parent class.

---

## 10. Why is Java popular?
👉 Because of **WORA (Write Once, Run Anywhere)**, security, strong memory management, community support, and wide usage in **Web, Mobile, Enterprise, Cloud** applications.

## 11.Why java invented ?
 - The java was invented for achieving platform independency.  For develope both 
         - I. Stand alone 
         - II. Internet applications

         Note: Using java language we can develope Both.

## 12. Types Of applications ?
- All available softwares of project on applications are broadly divided into 2 types.
                 - I. Stand alone  - Single comp. and single user app
                 - II. Internet applications - Multi comp. and multi user app 

       **Stand alone app** : An app that is install in one computer and it is accesible within the same computer  and if it is not accesible from other computer via internet is called stand alone app.

       - **Example** - Calculator, Notepade, MS- Office , Antivirus, OS, VLC player etc.           

       **Internet applications** : An app that is install in one computer and if it can be accesible from other computers via internet is called internet application.

       - **Example** - tcs.com, shaddi.com, bookmytrip.com etc....

       **NOTE** - In simple way we can say, 
                - If we download, insatll then access an app then it is stand alone app.
                - without downloading, installing if we access an app. then it is internet app.
---
---
## 13. Platform, Platform dependency, Platform independency ?

- **Platform** - A platform is an environment in which a program is loaded. executed and generates outputs.
     
         - A platform can be a software only or hardware only or Both.
         - A computer Platform is both SW and HWs That is OS+HW devices, [RAM, ROM, Processor].

- C an C++ Platform is OS. it means C and C++ programs are directly executed by OS.
- Java program Platform is JVM and JVM platform is OS.
- Python program platform is PVM.
- C# .net ----> CLR
- HTML -------> Browser
- Video file -----> Media player (VLC player)   etc.

**Platform Dependency** - A program develope and compiled by OS if it is not executed in diffrent OS is called platform dependent Program.
         - EX : C , C++

**Platform Independency** - A program that is develope and compiled by OS, If it can be executed in different OS is called platform independent program.
        - EX : JAVA, C# .Net, Python.

## Why C and C++ Programming language are Platform Dependent ?

- Window |   Source code   |  Compiled code       |   Executed code     |   ---> O/P
-        |      Abc.c      |  Compiler-> Abc.obj  |   Abc.exe           |   O/P
                                            ---->Machine Language Of Window 

- Similarly Linux and Mac Os has there own diff. Machine Language.
      - ---->Machine Language Of Linux
      - ---->Machine Language Of Mac OS
- Due to diff. ML Abc.c is run on Window but not in Linux and Mac OS

- **NOTE**
- The C and C++ Program are compiled targetting to one particular OS.
- Hence, the C and C++ programs compiled code contain ML of one particular OS Whose fromat is not understandable to different OS. Hence, C and C++ programs compiled code can not be executed by other OS. Hence, It is called Platform Independent.

- Not only C program PD, But also C SWs is PD becoz, all its Copmponents and PD.
- Hence, we will have separate C SWs for each OS.
