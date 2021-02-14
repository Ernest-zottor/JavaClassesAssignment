package javaClassesAssignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle: ");
		int length = scanner.nextInt();
		
		System.out.print("Enter the breadth of the rectangle: ");
		int breadth = scanner.nextInt();
		
		Area area = new Area(length, breadth);
		int calculateArea = area.returnArea();
		
		System.out.println("The area of the rectangle with length "+ length +" and breadth "+ breadth+ " = "+ calculateArea);

	}

}

class Area{
	int length;
	int breadth;
	
	Area(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		
	}
	
	public int returnArea() {
		int area = length * breadth;
		return area;
	}
}