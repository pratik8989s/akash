package esg.itp.shapes;

public class Rectangle implements Polygon {

	double length;
	double breadth;
	double area;
	double peri;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area=length* breadth;
		
		System.out.println(area);
	}

	@Override
	public void calcPeri() {
		peri=2*(length+breadth);
		// TODO Auto-generated method stub
		System.out.println(peri);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area: "+area+" Perimeter: "+peri);
	}
}
