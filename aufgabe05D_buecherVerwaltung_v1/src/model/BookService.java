package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class BookService {


    private List<Book> bookList;
    private Long id;
    private Long isbn;


    public List<Book> getBookList() {
        return bookList;
    }

    public void save(Book book) {
        book.setId(id);
        bookList.add(book);
        id++;
        isbn++;
    }

    public void delete(Long id) {
        Book book2Delete = getBookById(id);
    }

    private Book getBookById(Long id) {
        Book dummy = new Book(id, "dummy", "dummy", new GregorianCalendar().getTime(), 101010, "dummy");
        int index = bookList.indexOf(dummy);
        return bookList.get(index);
    }

    public Book update(Book newBook) {
        Long id = newBook.getId();
        Book oldBook = getBookById(id);
        int index = bookList.indexOf(oldBook);
        bookList.set(index, newBook);
        return oldBook;
    }


    private static BookService ourInstance = new BookService();


    public static BookService getInstance() {
        return ourInstance;
    }


    private BookService() {
        bookList = new ArrayList<>();
        bookList.add(new Book(1L, "Buchtitel 1", "Author 1", new GregorianCalendar().getTime(), 100000001, "Action"));
        bookList.add(new Book(2L, "Buchtitel 2", "Author 2", new GregorianCalendar().getTime(), 100000002, "Thriller"));
        bookList.add(new Book(3L, "Buchtitel 3", "Author 3", new GregorianCalendar().getTime(), 100000003, "Fachbuch"));
        bookList.add(new Book(4L, "Buchtitel 4", "Author 4", new GregorianCalendar().getTime(), 100000004, "Kinderbuch"));
        id = 5L;
        isbn = 100000005L;
    }

}
