package shapes;

public class Circle {

	private double radius;
	private double circumference;
	private double area;
	
	//Methods
	public Circle() {
		this.radius = 1;
		this.area = 1;
		this.circumference = 1;
	}
	
	public Circle(double r) {
		this.radius = r;
		this.area = findArea();
		this.circumference = findCircumference();
	}
	
	private double findCircumference() {
		return 2*Math.PI*this.radius;
	}
	
	private double findArea() {
		return Math.PI*this.radius*this.radius;
	}
	
	public void printStats() {
		System.out.println("Circle");
		System.out.println("Radius = "+this.radius);
		System.out.println("Area = "+this.area);
		System.out.println("Circumference = "+this.circumference);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getCircumference() {
		return circumference;
	}
	public double getArea() {
		return area;
	}
	
	
}
