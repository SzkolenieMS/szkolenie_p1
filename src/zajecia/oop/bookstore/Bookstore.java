package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Bookstore {
    private Book[] books;
    private int numberOfBooks;


    public Bookstore() {
        this.books = new Book[100];
        this.numberOfBooks = 0;

    }

    public boolean add(Book book) {
        boolean valueToReturn = false;
        if (numberOfBooks < 100) {
            books[numberOfBooks] = book;
            numberOfBooks++;
            valueToReturn = true;
        }
        return valueToReturn;
    }

    public void showBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);

        }
    }

    public int getNumberOfBooks(String author) {
        int numberOfBooks = 0;

        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].getAuthor().equals(author)) {
                numberOfBooks++;
            }

        }

        return numberOfBooks;
    }


    public Book[] getBooks(){
        Book[] booksToReturn = new Book[numberOfBooks];
        for (int i = 0; i < this.numberOfBooks; i++) {
            booksToReturn[i]=books[i];
        }
        return booksToReturn;

    }

    public Book[] getBooks(String author) {
        Book[] book = new Book[getNumberOfBooks(author)];
        int index = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].getAuthor().equals(author)) {
                book[index] = books[i];
                index++;
            }

        }

        return book;

    }

    public Book getBook(String ISBN) {
        int i = 0;
        Book book = null;

        while (i< numberOfBooks && book == null) {
            if (books[i].getISBN().equals(ISBN)) {
                book = books[i];
            }
            i++;
        }
        return book;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
}


