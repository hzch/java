import java.util.*;
public class F {
	public static int f(int x)
	{
		return x*x;
	}
	public static int f(int x,int y)
	{
		return x*x + y*y;
	}
	public static int f(int x,int y,int z)
	{
		return x*x + y*y + z*z;
	}
	public static void main(String[] args)
	{
		int x = 0, y = 0, z = 0;
		System.out.println("Please input the values of x :");
		try
		{
			Scanner reader = new Scanner(System.in);
			x = reader.nextInt();
			System.out.println("f(x)=" + f(x));
		}
		catch(Exception ex)
		{
			System.out.println("The values of the x is wrong!");
		}
		
		System.out.println("Please input the values of x and y :");
		try
		{
			Scanner reader = new Scanner(System.in);
			x = reader.nextInt();
			y = reader.nextInt();
			System.out.println("f(x,y)=" + f(x,y));
		}
		catch(Exception ex)
		{
			System.out.println("The values of the x and y is wrong!");
		}
		
		System.out.println("Please input the values of x, y and z:");
		try
		{
			Scanner reader = new Scanner(System.in);
			x = reader.nextInt();
			y = reader.nextInt();
			z = reader.nextInt();
			System.out.println("f(x,y,z)=" + f(x,y,z));
		}
		catch(Exception ex)
		{
			System.out.println("The values of the x, y and z is wrong!");
		}
	}
}
