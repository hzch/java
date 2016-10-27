import java.util.*;
public class Control
{
	public static void main(String[] args)
	{
		Compare();
		Divide();
	}
	public static void Compare()
	{
		int a = 0, b = 0;
		System.out.println("Please input the values of a and b:");
		try
		{
			Scanner reader = new Scanner(System.in);
			a = reader.nextInt();
			b = reader.nextInt();
		}
		catch(Exception ex)
		{
			System.out.println("The values of the a and b is wrong!");
		}
		if(a > b)
			System.out.println("The max is :" + a);
		else
			System.out.println("The max is :" + b);
		System.out.println("The max is :" + (a > b ? a : b));
	}
	
	public static void Divide()
	{
		int n = 0;
		while(true)
		{
			System.out.println("Please input a value of int");
			try
			{
				Scanner reader = new Scanner(System.in);
				n = reader.nextInt();
			}
			catch(Exception ex)
			{
				System.out.println("The value is wrong!");
			}
			if(n == 1)
				break;
			if(n < 0 || n > 1000)
			{
					System.out.println("The value is wrong!");
					continue;
			}
			if(n % 9 == 0)
				System.out.println("The value is divisible by 3");
			else				
				System.out.println("The value isn't divisible by 3");
		}
	}
}