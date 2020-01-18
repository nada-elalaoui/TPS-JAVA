public class Cercle extends Shape{
	
	protected double radius;
	public Cercle(){
		
	}
	public Cercle(double radius)
	{
		this.radius=radius;
	}
	public Cercle(double radius,String color,boolean filled)
	{
		this.radius = radius;
		super.color = color;
		super.filled = filled;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	public double getRadius() {
		return radius;
	}
	public String toString()
	{
		return "Cercle with Radiues : "+radius+" "+super.toString();
	}

}

