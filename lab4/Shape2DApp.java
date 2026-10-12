import java.util.Scanner;

public class Shape2DApp
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Shape[] shapes = readShapes(scan);

		System.out.printf("%nTotal surface area: %.2f%n", calculateTotalArea(shapes));
	}

	private static Shape[] readShapes(Scanner scan)
	{
		System.out.print("Enter the total number of shapes: ");
		int count = scan.nextInt();
		Shape[] shapes = new Shape[count];

		for (int i = 0; i < count; i++)
		{
			System.out.println("\nChoose shape " + (i + 1) + ":");
			System.out.println("1. Square  2. Rectangle  3. Circle  4. Triangle");
			int choice = scan.nextInt();
			shapes[i] = createShape(scan, choice);
		}
		return shapes;
	}

	private static Shape createShape(Scanner scan, int choice)
	{
		switch (choice)
		{
			case 1:
				System.out.print("Enter side: ");
				return new Square(scan.nextDouble());
			case 2:
				System.out.print("Enter length and breadth: ");
				return new Rectangle(scan.nextDouble(), scan.nextDouble());
			case 3:
				System.out.print("Enter radius: ");
				return new Circle(scan.nextDouble());
			case 4:
				System.out.print("Enter base and height: ");
				return new Triangle(scan.nextDouble(), scan.nextDouble());
			default:
				throw new IllegalArgumentException("Invalid 2-D shape choice: " + choice);
		}
	}

	private static double calculateTotalArea(Shape[] shapes)
	{
		System.out.println("\nCalculating area...");
		double total = 0;
		for (Shape shape : shapes)
			total += shape.calculateSurfaceArea();
		return total;
	}
}
