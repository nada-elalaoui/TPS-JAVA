
public class Personne {

	private String nom;
	private String prenom;
	
	public Personne() {
		this("XX","xx");
	}
	public Personne(String nom,String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	public String toString()
	{
		return "Nom : "+nom+" Prenom : "+prenom;
	}
	public boolean equals(Personne p)
	{
		return (p.nom != nom)?false:(p.prenom != prenom)?false:true;
	}

}
