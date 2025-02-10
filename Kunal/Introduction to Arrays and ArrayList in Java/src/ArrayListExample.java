import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int i;
        for (i = 0; i < 10; i++) {
            arrayList.add(in.nextInt());
        }

        System.out.println("\narrayList.get(i)");
        for (i = 0; i < 10; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        arrayList.set(3,69);
        System.out.println("\n\narrayList.set(3,69)");
        for (i = 0; i < 10; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        arrayList.remove(5);
        System.out.println("\n\narrayList.remove(5)");
        for (i = 0; i < 9; i++) {
            System.out.print(arrayList.get(i) + " ");
        }

    }
}
