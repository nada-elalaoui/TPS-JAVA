import java.util.Scanner;

public class Exercices {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
		 String s = "";  
		 while(s.compareTo("ok") != 0)
		 { 
			 System.out.print("Value : ");
			 s = sc.nextLine();  
			 System.out.println("Value token : "+s);
		 }
		 String def = "Thomas Sanchez 16";  
		 Scanner scDef = new Scanner(def);  
		 System.out.println("prenom : " + scDef.next() + "\nnom : " + scDef.next() + "\nage : " + scDef.nextInt());
		 if(scDef.hasNext()) {System.out.println(scDef.next());}
		 /*
		  * next() se deplace selon les espaces dans une chaine de caractere retourne l'element suivant
		  * hasNext() verfie s'il reste des elements apres le dernier mot trait�
		  * Le manque de hasNext() leve une exception dans le cas d'un manque d'element suivant
		  * */
		 //Exercice 1:
		 Scanner inp = new Scanner(System.in);
		 String chaine = inp.nextLine();
		 System.out.println(inp.toString());
		 /*
		  * .delimiter() retourne le type de delimiteur actuel
		  * .toString() retourne string specifiant toutes les propri�t�s de Scanner definie actuellement
		  * .hasNext[Type] verfie s'il a un element suivant de meme type specifi�
		  * .next[Type] lecture d'element suivant et conversion au type specifi�
		  */
		 //Exercice 2:
		 Scanner form = new Scanner(System.in);
		 System.out.print("Number 1 : ");
		 int a =0, b= 0;
		 a = form.nextInt();
		 System.out.print("Number 2 : ");
		 b = form.nextInt();
		 if(a+b==0)
		 {
			 System.out.print("vous avez tap�" +a+ " et " + b + " et leur somme est "+(a+b));
		 }
		 else
		 {
			 System.out.print("vous avez tap� ? et ?   et leur somme est ?"); 
		 }
		 
	}

}
