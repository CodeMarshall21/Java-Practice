import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] words = new String[5];

        for (int i = 0 ; i < words.length ; i++){
            words[i] = in.next();
        }
        System.out.println(Arrays.toString(words));
        words[1] = "Keshav";
        System.out.println(Arrays.toString(words));
    }



}
