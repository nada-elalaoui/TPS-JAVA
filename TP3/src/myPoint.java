
public class myPoint {

	private double x;
	private double y;
	
	public myPoint(){
		this(0.0,0.0);
	}
	public myPoint(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setXY(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "( "+this.x+" , "+this.y+" ) ";
	}
	public double distance(double x,double y)
	{
		
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
		
	}
	public double distance(myPoint pt)
	{
		return distance(pt.x,pt.y);
	}

}
