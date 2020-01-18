
public class Exercice2 {

	public static void main(String[] args){
		Object O = new Object();
		System.out.println(O.toString());
		System.out.println(O);
		Object C = new Object();
		System.out.println(O.equals(O)); //Reference different donc le resultat est false
		Personne P = new Personne ("TITI", "Toto") ; 
		System.out.println(P); //Utilisation de toString() de Personne 
		Personne R = new Personne ("Mino", "Tati") ; 
		System.out.print( R.equals(R)) ;//Comparaison des valeurs données aux elements de l'objet R 
	}

}
