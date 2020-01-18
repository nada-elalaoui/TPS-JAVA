
public class Exercice3 {

	public static void main(String[] args) {
		int i = 60;    
		short b =(short) (i + 5);
		/*
		 * Conversion explecite de i vers b
		 * */
		System.out.println(b);
		int ii = (int)1.99;
		System.out.println(ii);
		byte b1 =  (byte)257; 
		byte b2 = (byte)315;   
		byte b3 = (byte)(b1 + b2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.print(b3);
		/*
		 * byte accepte uniquement les nombres
		 * inferieure à 128
		 * lorsque la partie du premier byte est nulle 
		 * il retourne une valeur negative 
		 * Cette valeur est calculé selon leur separation à la prochaine valeur dans le permier byte
		 * valeur  = valeur - prochaine valeur pour n tel que n%2=0
		 */
	}

}
