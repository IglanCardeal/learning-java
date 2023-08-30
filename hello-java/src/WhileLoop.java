import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) throws Exception {
    System.out.println("WHILE LOOP");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    while (num != 0) {
      System.out.println("Enter another number: ");
      num = sc.nextInt();

      if (num > 10)
        break;
    }

    System.out.println("Program finished!");

    sc.close();
  }
}
