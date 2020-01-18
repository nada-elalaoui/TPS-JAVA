

public class Exercice6 {

	/*public enum Jour
	{
		LUNDI,
		MARDI,
		MERCREDI,
		JEUDI,
		VENDREDI,
		SAMEDI,
		DIMANCHE
	}
	public enum Mois
	{
		JANVIER,
		FEVRIER,
		MARS,
		AVRIL,
		MAI,
		JUIN,
		JUILLET,
		AOUT,
		SEPTEMBRE,
		OCTOBRE,
		NOVEMBRE,
		DECEMBRE
	}*/
	public static void main(String[] args) {
		Calendrier cl = new Calendrier();
		for(Calendrier.Mois m : Calendrier.Mois.values())
		{
			System.out.println(m);
		}

	}

}
