import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        int dies;
        int val;
        int total = 0;

        System.out.print("Number of Dies: ");
        dies = in.nextInt();

        if (dies > 0){
            for (int i = 0; i < dies; i++) {
                val = random.nextInt(1,7);
                roll(val);
                total += val;
            }
            System.out.println("Total: "+total);
        }else{
            System.out.println("INVALID");
        }
        in.close();

    }
    static void roll(int val){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(val){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("INVALID");
        }
    }

}
