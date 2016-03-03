package main;

import java.util.List;

/**
 * @author Lenka (433591)
 * @version 27.02.2016
 */
public interface BookManager {

    void createBook(Book book);

    void updateBook(Book book);

    void deleteBook(Book book);


    Book findBookById(int id);

    List<Book> findBooksByAuthor(String name);

    List<Book> findBooksByGenre(String genre);

    List<Book> findBooksByName(String name);

}
