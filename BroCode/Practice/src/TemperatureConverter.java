import java.io.PrintStream;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp;
        double newTemp;
        String CelOrFar;

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        CelOrFar = input.next().toUpperCase();


        System.out.print("Enter the temperature: ");
        temp = input.nextDouble();

        newTemp = (CelOrFar.equals("C")) ? (temp - 32) * (5.0 / 9.0) :  (temp * (9.0 / 5.0)) + 32;

        PrintStream c = (CelOrFar.equals("F")) ? System.out.printf("%.2f °Celsius is %.2f °Fahrenheit ", temp, newTemp) : System.out.printf("%.2f °Fahrenheit is %.2f °Celsius ", temp, newTemp);


    }
}
