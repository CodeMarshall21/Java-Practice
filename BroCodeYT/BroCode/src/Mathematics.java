import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        /*
        you do not need to create an object of the Math class to use its methods or constants.
        All the methods and constants in the Math class are static, meaning they belong to
        the class itself rather than to an instance of the class.

        Math is a classic example of a utility class where all methods are shared and do not depend on object state.

        */

        System.out.println("PI Value: "+ Math.PI);
        System.out.println("E Constant: "+ Math.E);

//        double result;

        System.out.println("power: " + Math.pow(3, 4));
        System.out.println("absolute: " + Math.abs(-5));
        System.out.println("SquareRoot: " + Math.sqrt(16));
        System.out.println("Round: " + Math.round(3.14));
        System.out.println("Ceil: " + Math.ceil(3.14));
        System.out.println("Floor: " + Math.floor(3.14));
        System.out.println("Max: " + Math.max(10, 20));
        System.out.println("Min: " + Math.min(10, 20));

//      HYPOTENUSE C = sqrt(A²+B²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse is: " + c + "cm");




        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n", volume);

        scanner.close();

    }
}
