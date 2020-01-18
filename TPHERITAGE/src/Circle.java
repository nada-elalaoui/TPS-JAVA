
public class Circle {
	protected Point center;
	protected double radius;
	public Circle()
	{
		center = new Point(1.0,1.0);
		radius = 4.0;
	}
	public Circle(double x,double y) {
		center = new Point(x,y);
		radius = 2.0;
	}
	public Circle(double radius)
	{
		this(1,1);
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
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
