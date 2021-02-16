package javaClassesAssignment;
import java.util.*;


class Complex{
	
	double real, img;
	
	Complex() {}
	 
	Complex(double real, double img){
		this.real = real;
		this.img = img;
	}
		public Complex sum(Complex a, Complex b) {
			
			return new Complex((a.real + b.real), (a.img + b.img));
			
		
		}
		public  Complex divide(Complex a, Complex b) {
			
			return new Complex( (a.real /b.real), (a.img / b.img));
			
	}
}


public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the real part of the first complex number: ");
		double real1 = scanner.nextDouble();
		System.out.print("Please enter the imaginary part of the first complex number: ");
		double img1 = scanner.nextDouble();
		
		System.out.print("Please enter the real part of the second complex number: ");
		double real2 = scanner.nextDouble();
		System.out.print("Please enter the imaginary part of the second complex number: ");
		double img2 = scanner.nextDouble();
		System.out.println(" ");
		
		Complex complexNumb1 = new Complex(real1, img1);
		Complex complexNumb2 = new Complex(real2, img2);
		Complex complexNumb = new Complex();
		Complex add = complexNumb.sum(complexNumb1, complexNumb2);
		Complex divide = complexNumb.divide(complexNumb1, complexNumb2);
		
		System.out.print("Addition of (" +real1 +" + "+ img1+ "i) and ("+ real2+ " + "+ img2+ "i) equals ");
		System.out.println(add.real + " + " + add.img+ "i\n");
		
		System.out.print("Dividing (" + real1 +" + "+ img1+ "i) by ("+ real2+ " + "+ img2+ "i) equals ");
		System.out.println(divide.real + " + " + divide.img+ "i");
	}

}
