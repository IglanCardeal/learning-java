package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    Triangle x = new Triangle();
    Triangle y = new Triangle();

    System.out.println("Enter triangle X: ");
    x.a = scanner.nextDouble();
    x.b = scanner.nextDouble();
    x.c = scanner.nextDouble();
    System.out.println("Enter triangle Y: ");
    y.a = scanner.nextDouble();
    y.b = scanner.nextDouble();
    y.c = scanner.nextDouble();

    double areaX = x.calculateArea();
    double areaY = y.calculateArea();

    if (areaX > areaY) {
      System.out.println("Larger area: X");
    } else {
      System.out.println("Larger area: Y");
    }

    scanner.close();
  }
}
