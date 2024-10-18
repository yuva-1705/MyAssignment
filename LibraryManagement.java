package homeAssignment;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lib=new Library();
		lib.addBook("Rich man poor dad");
		lib.issueBook();
        System.out.println("Rich man poor dad");
        System.out.println();
	}

}
