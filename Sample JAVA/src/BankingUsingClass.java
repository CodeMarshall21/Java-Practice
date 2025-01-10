import java.util.Scanner;
public class BankingUsingClass
{
		
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = inp.nextLine();
		System.out.println("Enter Account Number : ");
		long accn = inp.nextLong();
		System.out.println("Enter Password : ");
		int pw = inp.nextInt();

		//Creating Object
		Account ac = new Account();
		ac.name = name ;
		ac.accountNumber = accn;
		ac.password = pw;
		ac.greeting();


		
	}

}

class Account {
	String name;
	long accountNumber;
	int password; 


	void greeting(){
		System.out.println("Welcome "+name);
		System.out.println("Account holder : "+name);
		System.out.println("your Account Number : "+accountNumber);
		System.out.println("your Password : "+password);
	}
}


