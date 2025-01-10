import java.util.Scanner;
public class SumOfArray 
{
	public static void main(String[] args) 
	{
		//scanner object from 'Scanner' class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Elements you want to add : ");
		int x = scanner.nextInt(); //nextint to get integer
		
		int[] array=new int[x];
		
		System.out.println("Enter the Array Elements :-");
		for(int i=0;i<x;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println("Your Elements Are :- ");
		for (int h:array)
		{
			System.out.println(h);
		}
		int sum=0;
		for (int j=0;j<x;j++)
		{
			sum+=array[j];
		}
		System.out.println("Sum of Your Numbers is : "+sum);
	}	
		
} 