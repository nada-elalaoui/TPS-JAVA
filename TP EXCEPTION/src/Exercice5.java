import java.util.Arrays;

public class Exercice5 {

	public static void main(String[] args) {

		myIntStack stck = new myIntStack(4);
		stck.push(40);
		stck.push(40);
		stck.push(40);
		stck.push(40);
		stck.push(40);
		stck.push(40);
		System.out.print(Arrays.toString(stck.getContents()));

	}

}  // MyINtStack utilise un tableau pour stocker le contenu de la pile 
// d'elemenets entiers.
// la méthode push() pour lever une IllegalStateException si la pille est vide.
//push() pour retourner true si l’opération est réussie, ou false
//la méthode push() pour augmenter la capacité par réallocation d’un autre tableau si la pille est remplie.
