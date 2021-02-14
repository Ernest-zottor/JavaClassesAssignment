package javaClassesAssignment;

public class Q2 {

	public static void main(String[] args) {
	
		Triangle triangle = new Triangle();
		triangle.base = 3;
		triangle.height = 4;
		triangle.length = 5;
		
		triangle.getArea();
		triangle.getPerimeter();
	}

}

class Triangle{
	int base, height, length;
	
	public void getArea() {
		double area = (0.5) * base *height;
		System.out.println( "Area = " + area);

	}
	public void getPerimeter() {
		
		int perimeter = base + height + length;
		System.out.println("Perimeter = " + perimeter);
	}
}