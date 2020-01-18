
public class Personne {
	private String prenom;
	private String nom;
	private byte age;
	
	public Personne(String prenom,String nom,int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = (byte)age;
	}
	public Personne()
	{
		this("Unkown","Without",18);
	}
	public String toString()
	{
		return "Nom : "+this.nom+" | Prenom : "+this.prenom;
	}
	public void setNomPrenom(String nom,String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	public void setAge(byte age) {
		this.age = age;
	}

}
