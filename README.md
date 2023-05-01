# FactoryPattern


Crie a interface

```

package factory;

public interface Polygon {

	String getDescription();
}

```

Crie as classes concretas

```
package factory;

public class Triangulo implements Polygon{

	@Override
	public String getDescription() {
		return "Triangulo";
	}

}
```


```
package factory;

public class Square implements Polygon{

	@Override
	public String getDescription() {
		return "Square";
	}

}
```


```
package factory;

public class Pentagon implements Polygon{

	@Override
	public String getDescription() {
		return "Pentagon";
	}

}
```

Crie uma classe Factory
```

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

```

Utilize a classe Factory para criar objetos, em vez de instanciá-los diretamente.


```

package factory.main;

import factory.Polygon;
import factory.PolygonFactory;

public class App {

	public static void main(String[] args) {

		Polygon polygon = PolygonFactory.createPolygon(4);
		
		System.out.print(polygon.getDescription());
	}

}


```

