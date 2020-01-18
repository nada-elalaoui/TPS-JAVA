
public class Carre {
	double cote; //Acces dans le Package uniquement
	public Carre() {
		this(2.5);
	}
	public Carre(double cote)
	{
		this.cote = cote;
	}
	public /*static*/ double surface()
	{
		return cote*cote;
	}
	/*
	 La methode statique doit retourner imperativement
	 un attribut statique
	 Sinon : 
	 On elemine le privelege static
	*/

}
