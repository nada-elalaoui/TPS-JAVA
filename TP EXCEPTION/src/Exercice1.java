
public class Exercice1 {

	static double  p ;
	 public double  m(int n)
	 {// si n ==0  la méthodes doit retourner une exception
		 
			 return 1/n;
			
	 }	  
	 public static void main(String[] args) throws Exception
	 {     
		 Exercice1 a = new Exercice1();     
		 try
		 {
		 	p =  a.m(0);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Division impossible");			 
		 }
		 System.out.println(p);
		 try
			{
				
		 	
		 	Point p = new Point(-2,-3);
	 	}catch(Exception e)
		{
			System.out.print(e.getStackTrace());
		}
	 }

}
