import java.util.Arrays;

public class Exercice8 {

	public static void main(String[] args) {
		String [] str = {"youssef", "Ahmed", "ahmed"};
		System.out.println(str.length);
		for(String elt: str)
		{
			System.out.print(elt.length()+"\t");
		}
		System.out.println();
		System.out.println(str[0].equals(str[1]));
		System.out.println(str[0].compareTo(str[1]));
		System.out.println(str[0].compareToIgnoreCase(str[1]));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		StringBuilder sc = new StringBuilder("Prof");
		sc = new StringBuilder("Prof ESTO");
		StringBuilder t = new StringBuilder("Prof ESTO");
		System.out.println(sc.equals(t));
		String a= "Prof ESTO";
		String y= "Prof ESTO";
		System.out.println(y.equals(a));
		sc.delete(0,sc.length());
		System.out.print(sc);

	}

}
