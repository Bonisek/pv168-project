package main;

/**
 * @author Lenka (433591)
 * @version 27.02.2016
 */
public interface BookStore {

    void borrowBook(Book book, Customer customer);

    void returnBook(Book book, Customer customer);

}
