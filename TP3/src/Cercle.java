
public class Cercle {

	private myPoint center;
	private double radius;
	public Cercle(double x,double y) {
		center = new myPoint(x,y);
		radius = 2.0;
	}
	public Cercle(double x,double y,double radius)
	{
		this(x,y);
		this.radius = radius;
	}
	public myPoint getCenter() {
		return center;
	}
	public void setCenter(myPoint center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String toString()
	{
		return "Cercle @"+center+" radius : "+this.radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
}

