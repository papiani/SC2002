public class SquarePyramid extends Shape3D
{
	private final double baseSide;
	private final double slantHeight;
	private final double verticalHeight;

	public SquarePyramid(double baseSide, double slantHeight, double verticalHeight)
	{
		this.baseSide = baseSide;
		this.slantHeight = slantHeight;
		this.verticalHeight = verticalHeight;
	}

	public String getName()
	{
		return "Square-based Pyramid";
	}

	public double calculateSurfaceArea()
	{
		return baseSide * baseSide + 2 * baseSide * slantHeight;
	}

	public double calculateVolume()
	{
		return baseSide * baseSide * verticalHeight / 3;
	}
}
