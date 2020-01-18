
public class Exercice1 {

	public static void main(String[] args) {
		 Circle c1 = new Circle();  
		 System.out.println("The circle has radius of "   + c1.getRadius() + " and area of " + c1.getArea());     
		 Circle c2 = new Circle(2.0);  
		 System.out.println("The circle has radius of "  + c2.getRadius() + " and area of " + c2.getArea());
		 //System.out.println(c2.radius); Impossible radius est privée
		 System.out.println(c2.getColor());
		 Circle c3 = new Circle(5.0);
		 System.out.println(c3.toString());
		 System.out.println(c1); 
		 System.out.println("Operator '+' invokes toString() too: " + c1); 
		 /*
		  * Appel à un objet avec son nom provoque l'appel de la methode toString()
		  * */
	}

}
