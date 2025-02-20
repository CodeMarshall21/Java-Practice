import java.util.Random;
public class Methods {
    public static void main(String[] args){
        Random random = new Random();
        // method =  a block of reusable code that is executed when called ()


        happyBirthday("Spongebob", 30);
        System.out.printf("\nSquare Root of 4: %.2f",square(4));
        System.out.printf("\nCube Root of 4: %.2f",cube(4));
        System.out.printf("\nFull name: %s", getFullName("Hello","World"));
        int age = random.nextInt(0,100);
        if (ageCheck(age)){
            System.out.printf("\nage: %d is is above 18",age);
        }else{
            System.out.printf("\nage: %d is is below 18",age);
        }

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
