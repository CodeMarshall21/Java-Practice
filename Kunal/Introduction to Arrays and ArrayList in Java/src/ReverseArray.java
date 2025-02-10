import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        reverseArray(array);

        System.out.println(Arrays.toString(array));
    }
    static void reverseArray (int [] array){
        int i = 0;
        int j = array.length - 1;
        while (i < j){
            swap(array, i,j);
            i++;
            j--;
        }
//        return array;
    }

    static void swap (int [] array, int i, int j){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
