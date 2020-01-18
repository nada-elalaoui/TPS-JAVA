class A
{
	protected void m() 
	{
		System.out.println("A");
	}
}
class B extends A
{
}
class C extends B
{
}
class D extends A
{
}


public class Exercice4 {

	public static void main(String[] args) {
		A a = new A(); //  Instantiation de A 
		B b = new B();// Instantiation de B
		C c = new C(); //  Instantiation de C 
		D d = new D(); // Instantiation de D 
		a.m(); //  Utilisation de sa methode m()
		b.m(); //  Utilisation de la methode herit� m() de A
		c.m(); //  Utilisation de la methode herit� de B qui est elle meme un methode herit� de A 
		d.m(); //  Utilisation de la methode herit� m() de A

	}

}
