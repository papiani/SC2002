public class Circle extends Shape2D
{
	private final double radius;

	public Circle(double radius)
	{
		this.radius = radius;
	}

	public String getName()
	{
		return "Circle";
	}

	public double calculateArea()
	{
		return Math.PI * radius * radius;
	}
}
