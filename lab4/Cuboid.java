public class Cuboid extends Shape3D
{
	private final double length;
	private final double breadth;
	private final double height;

	public Cuboid(double length, double breadth, double height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public String getName()
	{
		return "Cuboid";
	}

	public double calculateSurfaceArea()
	{
		return 2 * (length * breadth + length * height + breadth * height);
	}

	public double calculateVolume()
	{
		return length * breadth * height;
	}
}
