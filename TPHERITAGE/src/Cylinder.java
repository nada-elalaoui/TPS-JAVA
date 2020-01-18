public class Cylinder extends Circle{
	private double height;
	public Cylinder(double radius,double height)
	{
		super(radius);
		this.height = height;
	}
	public Cylinder(double height)
	{
		super();
		this.height = height;
		
	}
	public Cylinder(){
		this(1.0);
	}
	public double getHeight() {
		
		return height;
	}
	public double getVolume()
	{
		return height*super.getArea();
	}
	public double getArea()
	{
		return 2*Math.PI*height+2*super.getArea();
	}
	public String toString()
	{
		return "Cylinder: subclass of "+super.toString()+" height = "+this.height;
	}
}
