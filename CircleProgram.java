
public class CircleProgram {
	public static int compareCircle(Circle c1,Circle c2)
	{
		if(c1.getRadius() > c2.getRadius())
			return 1;
		if(c1.getRadius() < c2.getRadius())
			return -1;
		else 
			return 0;
	}
	public static void main(String[] args)
	{
		Circle circle1 = new Circle();
		circle1.setRaduis(5.0);
		Circle circle2 = new Circle(8);
		Circle circle3 = new Circle(10);
		Circle circle4 = new Circle(5);

		System.out.println(compareCircle(circle1,circle2));
		System.out.println(compareCircle(circle1,circle3));
		System.out.println(compareCircle(circle1,circle4));
	}
}
