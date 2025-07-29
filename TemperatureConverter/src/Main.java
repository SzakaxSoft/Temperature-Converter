import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("What do you want?");
        System.out.println("1) C to F");
        System.out.println("2) F to C");

        Scanner option = new Scanner(System.in);

        System.out.print("Enter 1 or 2: ");
        int option1 = option.nextInt();
        if (option1 == 1) {
            Scanner celsius = new Scanner(System.in);
            System.out.print("Enter the Celsius: ");
            double celsius1 = celsius.nextDouble();
            double result = celsius1 * 9/5 + 32;
            System.out.println(celsius1 + "°C" + "=" + result + "°F");
        } else if (option1 == 2) {
            Scanner fahrenheit = new Scanner(System.in);
            System.out.print("Enter the Fahrenheit: ");
            double fahrenheit1 = fahrenheit.nextDouble();
            double result1 = (fahrenheit1 - 32) / 1.8;
            System.out.println(result1);
        } else {
            System.out.println("Please enter a valid number!");
        }
    }
}
