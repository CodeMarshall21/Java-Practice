import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        // integer Randoms
        int Large_random_number = random.nextInt(); //Default -> -2B to 2B
        int Small_random_number = random.nextInt(1,10); //Range -> 1 to 9

        //Decimal Randoms
        double decimal_random = random.nextDouble(); //ranges between 0.0 (inclusive) and 1.0 (exclusive).

        int sml = random.nextInt(100, 201);
        double number = decimal_random + (double)Large_random_number;
        double number2 = decimal_random + (double)sml;

        //Boolean Randoms
        boolean isHeads = random.nextBoolean();




        System.out.println("Large_random_number: " + Large_random_number);
        System.out.println("Small_random_number: " + Small_random_number);
        System.out.println("sml: " + sml);
        System.out.println("decimal_random: "+decimal_random);
        System.out.println("number " +number);
        System.out.println("number2: "+number2);
        if (isHeads){
            System.out.println("Heads !");
        }else{
            System.out.println("Tails");
        }

    }
}
