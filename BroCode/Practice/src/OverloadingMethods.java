public class OverloadingMethods {
    public static void main(String[] args){

        // overloaded methods = methods that share the same name,
        //                                          but different parameters
        //                                          signature = name + parameters

        String pizza1 = bakePizza("flat-bread");
        String pizza2 = bakePizza("flat-bread","mozzarella");
        String pizza3 = bakePizza("flat-bread", "mozzarella", "pepperoni");

        System.out.println("Pizza 1: "+pizza1);
        System.out.println("Pizza 2: "+pizza2);
        System.out.println("Pizza 3: "+pizza3);

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
