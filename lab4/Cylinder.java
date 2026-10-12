public class Cylinder extends Shape3D
{
	private final double radius;
	private final double height;

	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}

	public String getName()
	{
		return "Cylinder";
	}

	public double calculateSurfaceArea()
	{
		return 2 * Math.PI * radius * (radius + height);
	}

	public double calculateVolume()
	{
		return Math.PI * radius * radius * height;
	}
}
