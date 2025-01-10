import java.util.Scanner;
public class SumUsingFunction
{
	
	
	public static void main(String[] args) 
	{
		Scanner val = new Scanner(System.in);
		System.out.print("Number 1 : ");
		int num1 = val.nextInt();
		System.out.print("Number 2 : ");
		int num2 = val.nextInt();
		System.out.println(summation(num1,num2));
		
	}
	public static int summation(int num1, int num2)
	{
			return num1+num2;
	}

}
