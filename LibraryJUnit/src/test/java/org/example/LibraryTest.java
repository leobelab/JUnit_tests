package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void addBook() {
        Library library = new Library();

        Book book = new Book("1984", "George Orwell", 1949);

        library.addBook(book);

        assertEquals(1, library.getBooksByAuthor("George Orwell").size());
    }

    @Test
    public void removeBook() {
        Library library = new Library();

        Book book = new Book("1984", "George Orwell", 1949);

        library.addBook(book);
        library.removeBook(book);

        assertEquals(0, library.getBooksByAuthor("George Orwell").size());
    }

    @Test
    public void getBooksByAuthor() {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("Animal Farm", "George Orwell", 1945);
        Book book3 = new Book("Dune", "Frank Herbert", 1965);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        assertEquals(2, library.getBooksByAuthor("George Orwell").size());
    }

    @Test
    public void getBooksByYear() {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("Animal Farm", "George Orwell", 1945);
        Book book3 = new Book("Another Book", "Someone", 1949);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        assertEquals(2, library.getBooksByYear(1949).size());
    }

    @Test
    public void testBookEquality() {
        Book b1 = new Book("1984", "George Orwell", 1949);
        Book b2 = new Book("1984", "George Orwell", 1949);
        // This is ok
        assertEquals(b1, b1);
        // This is not ok
        assertEquals(b1, b2);
    }
}