import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        sum(15,23,56,87,89);
        sum("Hello","World","Hi","There");
    }
    static void sum(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void sum(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
