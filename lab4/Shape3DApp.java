import java.util.Scanner;

public class Shape3DApp
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Shape[] shapes = readShapes(scan);

		System.out.println("\nChoose calculation:");
		System.out.println("1. Total surface area  2. Total volume");
		int calculation = scan.nextInt();

		if (calculation == 1)
			System.out.printf("%nTotal surface area: %.2f%n", calculateSurfaceArea(shapes));
		else if (calculation == 2)
			System.out.printf("%nTotal volume: %.2f%n", calculateVolume(shapes));
		else
			throw new IllegalArgumentException("Invalid calculation choice: " + calculation);
	}

	private static Shape[] readShapes(Scanner scan)
	{
		System.out.print("Enter the total number of shapes: ");
		int count = scan.nextInt();
		Shape[] shapes = new Shape[count];

		for (int i = 0; i < count; i++)
		{
			System.out.println("\nChoose shape " + (i + 1) + ":");
			System.out.println("1. Sphere  2. Square-based Pyramid  3. Cuboid");
			System.out.println("4. Cone    5. Cylinder");
			shapes[i] = createShape(scan, scan.nextInt());
		}
		return shapes;
	}

	private static Shape createShape(Scanner scan, int choice)
	{
		switch (choice)
		{
			case 1:
				System.out.print("Enter radius: ");
				return new Sphere(scan.nextDouble());
			case 2:
				System.out.print("Enter base side, slant height and vertical height: ");
				return new SquarePyramid(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
			case 3:
				System.out.print("Enter length, breadth and height: ");
				return new Cuboid(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
			case 4:
				System.out.print("Enter radius, slant height and vertical height: ");
				return new Cone(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
			case 5:
				System.out.print("Enter radius and height: ");
				return new Cylinder(scan.nextDouble(), scan.nextDouble());
			default:
				throw new IllegalArgumentException("Invalid 3-D shape choice: " + choice);
		}
	}

	private static double calculateSurfaceArea(Shape[] shapes)
	{
		System.out.println("\nCalculating surface area...");
		double total = 0;
		for (Shape shape : shapes)
			total += shape.calculateSurfaceArea();
		return total;
	}

	private static double calculateVolume(Shape[] shapes)
	{
		System.out.println("\nCalculating volume...");
		double total = 0;
		for (Shape shape : shapes)
			total += ((Shape3D) shape).calculateVolume();
		return total;
	}
}
