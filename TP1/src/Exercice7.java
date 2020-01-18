import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice7 {
	

	public static void main(String[] args){
		//Integer[] table = {5, 13,-7, 12 , 25};
		int[] table = {5, 13,-7, 12 , 25};
		int[] otherTable = table.clone();
		int verify=0;
		System.out.println("Longueur : "+table.length);
		System.out.println(table.equals(otherTable));
		System.out.println(Arrays.equals(table, otherTable));
		System.out.println(table.toString());//Affiche le type object et le reference
		System.out.println(Arrays.toString(table));//Affiche les elements du tableau
		Arrays.sort(table);
		System.out.println(Arrays.binarySearch(table, 5));//Le tableau doit etre trié retourne l'indice de l'element
		Arrays.fill(table, 5);//Rendere tout les elements egaux à la valeur donnée
		System.out.println(Arrays.toString(table));
		Arrays.sort(otherTable);
		Arrays.hashCode(otherTable);
		System.out.println(Arrays.toString(otherTable));
		/*
		 * hashCode() Retourne une liste contenant tout les elements te tableau
		 * donc on pourra l'utiliser pour comparer deux tableaux
		 * */
		System.out.println(Arrays.hashCode(otherTable)==Arrays.hashCode(otherTable));
		table = Arrays.copyOf(otherTable, 6);
		//Retourne une liste contenant tout les elements selon une longueur precise
		//Ajout des 0 si la longueur depasse la taille du table
		System.out.println(Arrays.toString(table));
		table = Arrays.copyOfRange(otherTable, 1, 4);
		System.out.println(Arrays.toString(table));
		List l= new ArrayList(3);
		l = Arrays.asList(table);
		System.out.println(Arrays.toString(l.toArray()));
		
		
		
		
	}

}
