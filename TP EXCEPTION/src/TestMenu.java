import java.util.*;

public class TestMenu {
	public static void main(String [] args) {
		Menu m1 =new Menu();
		String [] a= {"Youssef","Mhand","DAI"};
		/*m1.Aff();
		try {
			m1.Choix();} catch(InputMismatchException e) {
				System.err.print("entre a number");
			}catch(MalException e) {
				System.err.print(e.getMessage());
			}*/
		
		m1 = new Menu(a);
		m1.Aff();
		try {
		m1.Choix();}catch(InputMismatchException e) {
			System.err.print(e.getMessage());
		}catch(MalException e) {
			System.err.print(e.getMessage());
		}

	}
}
