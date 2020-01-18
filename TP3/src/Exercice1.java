
public class Exercice1 {

	public static void main(String[] args) {
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm'); 
		System.out.println(anAuthor);   
		// appelle de   toString() 
		anAuthor.setEmail("paul@nowhere.com"); 
		System.out.println(anAuthor); 
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000); 
		Book anotherBook = new Book("more Java for dummy", new Author("Claude Delannoy","exemple@gmail.com",'m'), 29.95, 888);
		//System.out.println(aBook.author.name); Non visible pour main
		System.out.println("Gender : "+aBook.getAuthorGender());
		System.out.println("Name : "+aBook.getAuthorName());
		System.out.println("Email : "+aBook.getAuthorName());
		
	}

}
