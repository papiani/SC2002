public abstract class Shape2D implements Shape
{
	public final double calculateSurfaceArea()
	{
		return calculateArea();
	}

	public abstract double calculateArea();
}
