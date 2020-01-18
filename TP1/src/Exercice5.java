
public class Exercice5 {

	public static void main(String[] args) {
		final Personne f = new Personne ("Tamis ", " Karim ", 30) ;
		System.out.println(f);
		f.setNomPrenom( " Najar ", " Taha ") ;
		//f= new Personne(" Toumi ", " Fatima ", 25) ;
		//Reference f est final ne pourra pas referencer vers un nouveau object
		//Par contre on peut manipuler leurs proprietés puisqu'il ne sont pas final

	}

}
