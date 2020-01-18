
public class Exercice2 {

	public static void main(String[] args) {
		Shape s1 = new Cercle(5.5, "RED", false);
		// Upcast Cercle � Shape 
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println(((Cercle) s1).getRadius());
		Cercle c1 = (Cercle)s1; // Downcast back to Circle 
		System.out.println(c1); 
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast 
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		System.out.println(((Rectangle) s3).getLength()); 
		Rectangle r1 = (Rectangle)s3;   // downcast 
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		Shape s4 = new Square(6.6);     // Upcast 
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		System.out.println(((Square) s4).getSide());    /*Noter qu�on a converti Shape s4 � Rectangle, qui est une superclasse de Square au lieu  de la convertir � Square */ Rectangle r2 = (Rectangle)s4; System.out.println(r2); System.out.println(r2.getArea()); System.out.println(r2.getColor()); 
		System.out.println(((Square) r2).getSide());
		System.out.println(r2.getLength());
		// convertion de  Rectangle r2 �  Square 
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
	

	}

}