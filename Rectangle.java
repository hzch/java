public class Rectangle {
	double leftDownPointX,leftDownPointY;
	double rightUpPointX,rightUpPointY;
	
	public Rectangle(double ldpx,double ldpy,double rupx,double rupy) 
	{
		leftDownPointX = ldpx;
		leftDownPointY = ldpy;
		rightUpPointX = rupx;
		rightUpPointY = rupy;
	}
	public Rectangle()
	{
		this(0.0,0.0,0.0,0.0);
	}
	public double getRound()
	{
		return 2 * (rightUpPointX - leftDownPointX + rightUpPointY - leftDownPointY);
	}
	public double getArea()
	{
		return (rightUpPointX - leftDownPointX) * (rightUpPointY - leftDownPointY);
	}
}
