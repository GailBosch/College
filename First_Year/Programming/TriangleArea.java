import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner ( System.in ) ;
		
		System.out.println("Enter the coordinates of the triangle separated");
		System.out.println("by spaces (x1 y1 x2 y2 x3 y3):");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double area = Math.sqrt(Math.pow((((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)))/2),2));
		
		System.out.printf("The area of triangle ((%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f)) is %.2f", x1, y1, x2, y2, x3, y3, area);
		
		input.close();
	}

}
