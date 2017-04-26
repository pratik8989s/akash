package esg.itp.shapes;

public class Square implements Polygon {

	double side=0;
	Polygon p;
	double area;
	double peri;
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area=side*side;
		
		System.out.println(area);
	}

	@Override
	public void calcPeri() {
		 peri=4*side;
		// TODO Auto-generated method stub
		System.out.println(peri);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area: "+area+" Perimeter: "+peri);
	}
	

}
