package org.example;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        /*for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Library ---");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Search books by author");
            System.out.println("4. Search books by year");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {

                System.out.print("Title: ");
                String title = scanner.nextLine();

                System.out.print("Author: ");
                String author = scanner.nextLine();

                System.out.print("Year: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                Book book = new Book(title, author, year);
                library.addBook(book);

                System.out.println("Book added.");

            } else if (option == 2) {

                System.out.print("Title of the book to remove: ");
                String title = scanner.nextLine();

                System.out.print("Author: ");
                String author = scanner.nextLine();

                System.out.print("Year: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                Book book = new Book(title, author, year);
                library.removeBook(book);

                System.out.println("Book removed.");

            } else if (option == 3) {

                System.out.print("Author: ");
                String author = scanner.nextLine();

                List<Book> books = library.getBooksByAuthor(author);

                for (Book book : books) {
                    System.out.println(book.getTitle() + " FROM " +  book.getAuthor() + " OF " + book.getYear());
                }

            } else if (option == 4) {

                System.out.print("Year: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                List<Book> books = library.getBooksByYear(year);

                for (Book book : books) {
                    System.out.println(book.getTitle() + " FROM " +  book.getAuthor() + " OF " + book.getYear());
                }

            } else if (option == 5) {

                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();

    }
}