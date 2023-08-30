import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        System.out.println("Hello, World!".toUpperCase());
        double num = 12.1234;
        System.out.printf("%.6f%n", num);

        String name = "Cardeal";
        char gender = 'M';
        int age = 30;

        System.out.printf("%n My name is %s, my gender is %s and my age is %d %n", name, gender, age);

        int a = 3, b = 5;
        double result = (double) a / b;
        System.out.println(result);

        EntriesData entriesData = new EntriesData();

        entriesData.main();
    }
}
