public class Triangle extends Shape2D
{
	private final double base;
	private final double height;

	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	public String getName()
	{
		return "Triangle";
	}

	public double calculateArea()
	{
		return 0.5 * base * height;
	}
}
