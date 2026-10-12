public class Sphere extends Shape3D
{
	private final double radius;

	public Sphere(double radius)
	{
		this.radius = radius;
	}

	public String getName()
	{
		return "Sphere";
	}

	public double calculateSurfaceArea()
	{
		return 4 * Math.PI * radius * radius;
	}

	public double calculateVolume()
	{
		return (4.0 / 3.0) * Math.PI * radius * radius * radius;
	}
}
