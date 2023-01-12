// Code Sebelum Buat Studi Kasus

// package typeException;

// class NumberFormat {
//     public static void main(String args[]) {
//         try {
//             // "akki" is not a number
//             int num = Integer.parseInt("akki");

//             System.out.println(num);
//         } catch (NumberFormatException e) {
//             System.out.println("Number format exception");
//         }
//     }
// }

package typeException;
import java.io.*;

public class NumberFormat {
    public static void main(String args[]) {
        try {
            // Membaca file dengan nama "input.txt"
            File file = new File("input.txt");
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String input = br.readLine();

                // Konversi string ke integer
                int num = Integer.parseInt(input);

                System.out.println(num);
            }
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}