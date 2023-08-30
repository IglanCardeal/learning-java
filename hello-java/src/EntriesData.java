import java.util.Scanner;

public class EntriesData {
  public void main() throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please, enter a letter:");
    char x = sc.next().charAt(0);
    System.out.println("Entry data: " + x);

    System.out.println("Write 3 lines: ");
    String a = sc.nextLine();
    String b = sc.nextLine();
    String c = sc.nextLine();
    System.out.println("a " + a);
    System.out.println("b " + b);
    System.out.println("c " + c);

    sc.close();
  }
}
