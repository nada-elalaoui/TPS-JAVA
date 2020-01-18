
import java.util.*;

public class Menu {
	private ArrayList<String> menu=new ArrayList<>();
	public Menu(String[] A) {
		for(String s: A) {
			menu.add(s);
		}
		for(String s: A) {
			String[] b =A;
			
		}
		
		
	}
	public Menu() {
		
	}
	public void Aff() {
		int i=0;
		for(String s: menu) {
			System.out.print(++i+" "+s+"\t");
		}System.out.println();
	}
	public void SaisC() throws MalException {
		if(menu.isEmpty()) {
			System.err.print("Menu est vide");
		}else {
			System.out.print("entre votre choix :\t");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int l=menu.size();
			if(n>l) {throw new MalException("Index out Menu");}
			if(n<=0) {throw new MalException("Index out of Menu");}
			System.out.print(menu.get(n-1));
		}
	
	}
	public void Choix() throws MalException{
		
			this.Aff();
			this.SaisC();
		
		
		
	}
}
