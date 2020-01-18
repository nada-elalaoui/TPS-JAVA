import java.util.Scanner;

public class Exercice3 {


	static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};  
	static int division(int indice, int diviseur)
	{
		return tableau[indice]/diviseur;
	} 
	public static void main(String[] args) {
		int x,y;
		boolean help;
		Scanner sc = new Scanner(System.in);
		do
		{
			 	help= false;
				System.out.print("Entrer un indice n : ");
				x = sc.nextInt();
				System.out.print("Entrer un diviseur d : ");
				y = sc.nextInt();
				try
				{
					System.out.print("Result : "+division(x,y));
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					help = true;
					System.out.println("Oversize : Index great than Table length");
				}
				catch(Exception e)
				{
					help = true;
					System.out.println("Division Impossible");
				}
		}
		while(help);	
		
		
	}

}
