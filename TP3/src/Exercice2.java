import java.util.Arrays;

public class Exercice2 {

	public static void main(String[] args) {
		myPoint pt1 = new myPoint(1.4,2.7);
		myPoint pt2 = new myPoint();
		System.out.println(pt1.distance(pt2));
		System.out.println(pt1.distance(1.1,2.2));
		myPoint[] tablePoint = new myPoint[10];
		for(int i=0;i<10;i++)
		{
			tablePoint[i] = new myPoint(i+1,i+1);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(tablePoint[i]);
			
		}
		System.out.println(Arrays.toString(tablePoint));
		//Exercice 3 
		Cercle crc = new Cercle(1.2,1.6);
		System.out.println(crc);
		System.out.println(crc.getArea());
		//Exercice 4 
		myTriangle triangle = new myTriangle(1.2,4.5,3.1,1.0,1.1,5.3);
		
		System.out.println(triangle.getPerimeter());
		triangle.printType();

	}

}
