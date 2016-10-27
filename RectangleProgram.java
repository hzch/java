public class RectangleProgram {
	public static void main(String[] args)
	{
		Rectangle rec1 = new Rectangle();
		rec1.leftDownPointX = 2.1;
		rec1.leftDownPointY = 3.2;
		rec1.rightUpPointX = 5.2;
		rec1.rightUpPointY = 6.3;
		System.out.println("rec1's round is " + rec1.getRound());
		System.out.println("rec1's area is " + rec1.getArea());

		Rectangle rec2 = new Rectangle(1.0,2.0,6.8,10.5);
		System.out.println("rec2's round is " + rec2.getRound());
		System.out.println("rec2's area is " + rec2.getArea());
		
		
	}
}
