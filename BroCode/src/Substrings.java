import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email;
        String domain;
        String username;

        System.out.print("Email : ");
        email = input.nextLine();


        if (email.contains("@")){
            username = email.substring(0,email.indexOf('@'));
            System.out.println("username : "+ username);

            domain = email.substring(email.indexOf('@') + 1);
            System.out.print("Domain: "+ domain);
        }else{
            System.out.print("Missing '@' ");
        }



    }
}
