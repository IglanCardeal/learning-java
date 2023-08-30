import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    boolean again = true;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Digite a temperatura em Celsius: ");

      float temperature = sc.nextFloat();
      float tempInFahrenheit = convertCelsiusToFahrenheit(temperature);

      System.out.println("Equivalente em Fahrenheit: " + tempInFahrenheit);
      System.out.println("Deseja repetir (s/n)?");

      char entry = sc.next().charAt(0);
      again = entry == 's';
    } while (again);

    System.out.println("Program finished!");
    sc.close();
  }

  private static float convertCelsiusToFahrenheit(float celsiusTemp) {
    return (9 * celsiusTemp / 5) + 32;
  }
}
