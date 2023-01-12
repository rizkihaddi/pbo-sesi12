package typeException;

// class GFG {
//   public static void print(int a) {
//     if (a >= 18) {
//       System.out.println("Eligible for Voting");
//     } else {

//       throw new IllegalArgumentException("Not Eligible for Voting");

//     }

//   }

//   public static void main(String[] args) {
//     GFG.print(14);
//   }
// }

class GFG {
  public static void checkAge(int age) {
      if (age >= 18) {
          System.out.println("Eligible for Voting");
      } else {
          throw new IllegalArgumentException("Not Eligible for Voting");
      }
  }
  public static void main(String[] args) {
      try {
          checkAge(-5);
      } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());
      }
  }
}