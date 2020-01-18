
public class Calendrier {

	public enum Jour
	{
		LUNDI,
		MARDI,
		MERCREDI,
		JEUDI,
		VENDREDI,
		SAMEDI,
		DIMANCHE
	}
	private byte date;
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
	}
	private byte annee;
	public Calendrier(int date,int anne) {
		this.date = (byte)date;
		this.annee = (byte)anne;
		
	}
	public Calendrier()
	{
		this(0,0);
	}

}
