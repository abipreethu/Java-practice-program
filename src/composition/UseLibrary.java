package composition;

public class UseLibrary {
public static void main(String[] args) {
	Book b = new Book();
	b.authorName = "xxx";
	b.cost = 120;
	b.noOfPages = 300;
	
	Library lib = new Library();
	lib.name = "brond";
	lib.location = "chennai";
	lib.book = b;
	
	System.out.println(lib.name+" "+lib.location+" "+lib.book.authorName+" "+lib.book.cost+" "+lib.book.noOfPages);
	
}
}
