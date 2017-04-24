package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Application {
    public static void main(String[] args) {

        Book book = new Book();
        book.author = "Henryk Sienkiewicz";
        book.title = "Ogniem i mieczem";
        book.ISBN = "123423";
        book.releaseDate = "2001";
        book.size = 3;
        String[] ogniemIMieczem = new String[4];
        ogniemIMieczem[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        ogniemIMieczem[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat";
        ogniemIMieczem[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur";
        ogniemIMieczem[3] = "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        book.content = ogniemIMieczem;
    }
}
