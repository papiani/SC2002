public class Cone extends Shape3D
{
	private final double radius;
	private final double slantHeight;
	private final double verticalHeight;

	public Cone(double radius, double slantHeight, double verticalHeight)
	{
		this.radius = radius;
		this.slantHeight = slantHeight;
		this.verticalHeight = verticalHeight;
	}

	public String getName()
	{
		return "Cone";
	}

	public double calculateSurfaceArea()
	{
		return Math.PI * radius * (radius + slantHeight);
	}

	public double calculateVolume()
	{
		return Math.PI * radius * radius * verticalHeight / 3;
	}
}
