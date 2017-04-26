
import esg.itp.shapes.*;
public class ShapesDemo {
	public static void main(String[] args) {
		Square s= new Square(5);
		s.calcArea();
		s.calcPeri();
		s.display();
		
		Rectangle r= new Rectangle(2, 3);
		r.calcArea();
		r.calcPeri();
		r.display();
	}

}
