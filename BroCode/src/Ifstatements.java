public class Ifstatements {
    public static void main(String[] args) {
//        boolean truth = false;
//
//        if (truth){
//            System.out.println("Hello");
//        }
//        else{
//            System.out.println("World");
//        }

        int [] array = {14,25,0,54,87,78,88,0};
        int truth = 0 , untruth = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] != 0){
                System.out.println("True");
                truth++;
            }
            else{
                System.out.println("False");
                untruth++;
            }

        }
        System.out.println("Number of Non-Zeros: "+truth+" \nNumber of Zeros: "+untruth);
    }
}
