package javaClassesAssignment;

public class Q3 {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(4,5);
		Rectangle rect2 = new Rectangle(5, 8);
		
		System.out.println("Area of rect1 is = " + rect1.Area());
		System.out.println("Area of rect2 is = " + rect2.Area());

	}

}

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public int Area() {
		int area = length * breadth;
		return area;
	}
}