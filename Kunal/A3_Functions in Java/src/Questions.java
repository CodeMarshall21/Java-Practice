import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Number : ");
        number = input.nextInt();

        boolean isPrime = IsPrime(number);
        System.out.println(isPrime);

    }

    static boolean IsPrime(int num){
        if (num <= 1){
            return false;
        }

//        for (int i = 2; i<num; i++){          Traditional for loop prime check !
//            if ((num % i) == 0){
//                return false;
//            }
//        }
        int init = 2;
        while (init * init <= num){
            if ((num % init) == 0){
                return false;
            }
            init ++;
        }

        return true;

    }
}
