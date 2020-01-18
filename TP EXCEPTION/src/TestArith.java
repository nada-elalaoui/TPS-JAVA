
public class TestArith {
	int n;
	double p;
	public double m(int n) throws Exception {
		if(n==0) throw new ArithmeticException("Erreur!");
		return 1.0/n;
		}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			int n=Integer.parseInt(args[0]);
			TestArith a = new TestArith();
			double p = a.m(n);
			System.out.print(p);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Bloc Finally");
		}

	}

}
