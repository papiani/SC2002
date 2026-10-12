public class Square extends Shape2D
{
	private final double side;

	public Square(double side)
	{
		this.side = side;
	}

	public String getName()
	{
		return "Square";
	}

	public double calculateArea()
	{
		return side * side;
	}
}
