package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Application {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        inserExampleData(bookstore);
//        bookstore.books
//        bookstore.showBooks();
        Book[] booki = bookstore.getBooks("Maciej");
        System.out.println(booki[1]);
        System.out.println(booki[0]);
    }

    public static void inserExampleData(Bookstore bookstore) {

        Book book = new Book("Ogniem i  Mieczem", "Henryk Sienkiewicz", "12345");
        book.releaseDate = "2001";
        book.size = 3;
        String[] ogniemIMieczem = new String[4];
        ogniemIMieczem[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        ogniemIMieczem[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat";
        ogniemIMieczem[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur";
        ogniemIMieczem[3] = "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        book.content = ogniemIMieczem;

        Book book1 = new Book("QuoVadis", "Maciej", "123545");
        String[] QuoVadis = new String[4];
        QuoVadis[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        QuoVadis[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat";
        QuoVadis[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur";
        QuoVadis[3] = "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        book1.content = QuoVadis;


        Book book2 = new Book("Dziady", "Maciej", "123545");
        String[] dziady = new String[4];
        dziady[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        dziady[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat";
        dziady[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur";
        dziady[3] = "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        book2.content = dziady;


        bookstore.add(book);
        bookstore.add(book1);
        bookstore.add(book2);

    }
}
