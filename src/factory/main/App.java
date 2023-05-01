package factory.main;

import factory.Polygon;
import factory.PolygonFactory;

public class App {

	public static void main(String[] args) {

		Polygon polygon = PolygonFactory.createPolygon(4);
		
		System.out.print(polygon.getDescription());
	}

}
