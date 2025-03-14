import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int [] arr = {1,2,5,6,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] arr){
        arr[0] = 1546;
    }
}
