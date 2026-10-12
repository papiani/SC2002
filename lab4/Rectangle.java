public class Rectangle extends Shape2D
{
	private final double length;
	private final double breadth;

	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public String getName()
	{
		return "Rectangle";
	}

	public double calculateArea()
	{
		return length * breadth;
	}
}
