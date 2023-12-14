public class StringFunctions {
  public static void main(String[] args) {
    String a = "123 asd fa fs";

    String[] arr = a.split("a");

    for (String str : arr) {
      System.out.println(str);
    }
  }
}
