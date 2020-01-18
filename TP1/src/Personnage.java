
public class Personnage {

	private String prenom;
	private String nom;
	private byte age;
	private static short nbPersonne=0;
	private static String nomDev= "Developer";
	
	/*
	 * Bloc anonyme:
	 * Executer une fois lors de la premiere utilisation de la class 
	 {
	 	nbPersonne = 0;
	 	nomDev = "Developer";
	 }
	*/
	
	public Personnage(String prenom,String nom,int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = (byte)age;
		nbPersonne++;
	}
	public Personnage()
	{
		this("Unkown","Without",18);
	}
	public static short getNbPersonne() {
		return nbPersonne;
	}
	public static String getNomDev() {
		return nomDev;
	}
	public String getPersonne()
	{
		return this.nom+" "+this.prenom; //ascesseur
	}

}
