import java.util.Scanner;
public class FunctionsUsage
{

	public static void main(String[] args)
	{
		Scanner val = new Scanner(System.in);
		System.out.println("Your Name ? ");
		String name = val.nextLine();
		greet(name);
	}
	public static void  greet(String name)
	{
		System.out.println("Thats a beautiful name "+name);
	}

}
