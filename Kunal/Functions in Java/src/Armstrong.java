import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int number;


        System.out.print("Number : ");
        number = in.nextInt();

        System.out.println(armCheck(number));
    }
    static boolean armCheck(int num){
        int lastDigit;
        double sum = 0;
        double duplicate = num;
        while (num > 0){
            lastDigit = num % 10;
            sum += Math.pow(lastDigit,3);
            num /= 10;
        }
//        if (sum == duplicate){
//            return true;
//        }
//        else{
//            return false;
//        }

        return sum == duplicate;
    }
}
