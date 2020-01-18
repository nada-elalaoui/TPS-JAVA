
public class Point {
	private int x;
	private int y;
	public Point(int x,int y) throws Exception
	{
		if(x<0||y<0)throw new Exception();
		try
		{
			this.x = x;
			this.y = y;
		}catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}
}
