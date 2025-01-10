import java.util.Scanner;
public class ReverseArray
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		
		for (int y = arr.length-1;y>=0;y--)
		{
			System.out.print(arr[y]);
		} 
	}

}
