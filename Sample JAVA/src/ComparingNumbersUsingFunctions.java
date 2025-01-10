import java.util.Scanner;
public class ComparingNumbersUsingFunctions

{

	public static void main(String[] args)
	{
		Scanner val = new Scanner (System.in);
		System.out.print("Enter Number 1 :");
		double num1=val.nextInt();
		System.out.print("Enter Number 2 :");
		double num2=val.nextInt();
		System.out.println(compare(num1,num2));
	}
	public static double compare(double num1,double num2)
	{
		if (num1>num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}
	

}
