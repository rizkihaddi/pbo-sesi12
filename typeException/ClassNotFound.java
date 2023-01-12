package typeException;

// Java program to demonstrate ClassNotFoundException
// public class ClassNotFound {
//     public static void main(String[] args) {
//         try {
//             Class.forName("Class1"); // Class1 is not defined
//         } catch (ClassNotFoundException e) {
//             System.out.println(e);
//             System.out.println("Class Not Found...");
//         }
//     }
// }

class ClassNotFound {
    public static void main(String[] args) {
        try {
            Class.forName("Class1"); 
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: Class1 is not found in classpath.");
        }
    }
}
