import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] arr2d = new int[3][3];
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = in.nextInt();
            }
            
        }
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println("\n");

        }
        System.out.println("for (int row = 0; row < arr2d.length; row++)");
        for (int row = 0; row < arr2d.length; row++) {
            System.out.print(Arrays.toString(arr2d[row]));
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.println("using for (int [] element : arr2d)");
        for (int [] element : arr2d){
            System.out.println(Arrays.toString(element));
        }

    }
}
