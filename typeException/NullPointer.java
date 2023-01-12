package typeException;

//Java program to demonstrate NullPointerException
// class NullPointer_Demo {
//     public static void main(String args[])
//     {
//         try {
//             String a = null; //null value
//             System.out.println(a.charAt(0));
//         } catch(NullPointerException e) {
//             System.out.println("NullPointerException..");
//         }
//     }
// }

class NullPointer {
    public static void main(String args[]) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch(NullPointerException e) {
            System.out.println("NullPointerException occurred: variable 'name' is null.");
        }
    }
}
