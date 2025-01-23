import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        // integer Randoms
        int Large_random_number = random.nextInt(); //Default -> -2B to 2B
        int Small_random_number = random.nextInt(1,10); //Range -> 1 to 9

        //Decimal Randoms
        double decimal_random = random.nextDouble();
        double float_random = random.nextFloat();

        //Boolean Randoms
        boolean isHeads = random.nextBoolean();



        System.out.println(Large_random_number);
        System.out.println(Small_random_number);
        System.out.println(decimal_random);
        System.out.println(float_random);
        if (isHeads){
            System.out.println("Heads !");
        }else{
            System.out.println("Tails");
        }

    }
}
