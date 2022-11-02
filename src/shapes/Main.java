package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Circle c=new Circle();
		System.out.println(c.getRadius());
		c=new Circle(5);
		System.out.println(c.getRadius());
	}

}
