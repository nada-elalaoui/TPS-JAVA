abstract public class Shape {

	protected String color;
	protected boolean filled;
	abstract public double getPerimeter();
	public boolean isFilled()
	{
		return filled;
	}
	public String toString()
	{
		return "A Shape with "+this.color+" of "+filled+" filled/Not filled";
	}
	public String getColor() {
		return color;
	}
	protected abstract double getArea();
	

}