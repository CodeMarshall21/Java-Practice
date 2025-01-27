import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int reversed = 0;

        System.out.print("Number : ");
        number = input.nextInt();

        while (number != 0){
            reversed = number % 10 + reversed * 10;
            number /= 10;
        }
        System.out.printf("Reversed = %d", reversed);

        input.close();

    }
}
