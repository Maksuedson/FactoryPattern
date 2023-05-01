package factory;

public class PolygonFactory {

	public static Polygon createPolygon(int numberOfSides) {
		if (numberOfSides == 3) {
			return new Triangulo();
		}
		
		if (numberOfSides == 4) {
			return new Square();
		}
		
		if (numberOfSides == 5) {
			return new Pentagon();
		}
		
		return null;		
	}
	
}
