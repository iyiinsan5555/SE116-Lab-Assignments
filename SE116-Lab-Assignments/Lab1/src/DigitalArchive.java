public class DigitalArchive {
    public static void main(String[] args) {
        Book testBook = new Book("124253262145", "Spirit", 120, 15);
        Book testBook2 = new Book("53241233", "Jack Sparrow", 238, 24);
        Book testBook3 = new Book("461025151320", "Pepe", 48, 5);

        Librarian testLibrarian = new Librarian(115772346, "Murat", 32);

        testLibrarian.addBook(testBook);
        testLibrarian.addBook(testBook2);
        testLibrarian.addBook(testBook3);

        //System.out.println(testLibrarian.findBook("124253262145").getTitle());
        testLibrarian.displayAllBooks();

        //Removing book
        testLibrarian.removeBook("53241233");
        System.out.println("-------------------------");
        testLibrarian.displayAllBooks();

        testLibrarian.removeBook("461025151320");
        testLibrarian.removeBook("124253262145");

        System.out.println("-------------------------");
        testLibrarian.displayAllBooks();

        Book testBook4 = new Book("9712960634", "The Lion King", 64, 7.5);
        System.out.println("-------------------------");
        testLibrarian.addBook(testBook4);
        testLibrarian.displayAllBooks();

    }
}
class Book {
    private String isbn;
    private String title;
    private int pageCount;
    private double price;

    public void printBookInfo(){
        System.out.println("Title: " + this.title + " isbn: " + this.isbn + " pageCount: " + this.pageCount + " price: " + this.price);
    }

    //Getters
    public String getIsbn() { return this.isbn; }
    public String getTitle() { return this.title; }
    public double getPrice() { return this.price; }
    public int getPageCount() { return this.pageCount; }

    //Setters
    public void setIsbn(String newIsbn) { this.isbn = newIsbn; }
    public void setTitle(String newTitle) { this.title = newTitle; }
    public void setPageCount(int newPageCount) { this.pageCount = newPageCount; }
    public void setPrice(double newPrice) {this.price = newPrice; }

    public Book(String isbn, String title, int pageCount, double price) {
        this.isbn = isbn;
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }
}

class Librarian {
    private long employeeID;
    private String name;
    private int age;
    private Book[] books;
    private int bookCount = 0;

    public Librarian(long employeeID, String name, int age) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.books = new Book[5]; // fixed size --> 5
    }

    public void addBook(Book book) {
        if (this.bookCount >= 5) { System.out.println("Books are full!"); return;}
        this.books[bookCount] = book;
        this.bookCount += 1;
    }

    public void removeBook(String isbn) {
        //Finding the book index
        int bookIndex = -1;
        for (int i=0; i<this.books.length; i++) {
            if (this.books[i] != null && this.books[i].getIsbn().equals(isbn)) {
                bookIndex = i;
            }
        }
        if (bookIndex == -1) { //cannot find the book
            System.out.println("CANNOT find the book with this isbn: " + isbn);
            return;
        }

        //Remove the book
        this.books[bookIndex] = null;
        bookCount -= 1;

        //Reordering the array to prevent errors.
        Book[] newBookArray = new Book[5];
        int index = 0;
        for (Book book : this.books) {
            if (book != null) {
                newBookArray[index] = book;
                index += 1;
            }
        }

        this.books = newBookArray;
    }

    public Book findBook(String isbn) {
        int bookIndex = -1;
        for (int i=0; i<this.books.length; i++) {
            if (this.books[i] != null && this.books[i].getIsbn().equals(isbn)) {
                bookIndex = i;
            }
        }
        if (bookIndex == -1) {
            return null;
        } else {
            return this.books[bookIndex];
        }
    }

    public void updatePrice(Book book, double newPrice) {
        book.setPrice(newPrice);
    }

    public void findBookAndApplyDiscount(String isbn, double discountPercentage) {
        Book foundBook = findBook(isbn);
        if (foundBook == null) {System.out.println("isbn is not valid"); return;}

        double newPrice = foundBook.getPrice() - foundBook.getPrice() * discountPercentage / 100;
        updatePrice(foundBook, newPrice);
    }

    public void displayAllBooks() {
        for (Book book : this.books) {
            if (book != null) {
                book.printBookInfo();
            }
        }
    }

}

