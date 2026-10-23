package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Book[] book = createBooks();

        int command = 0;

        while (command != 3) {

            System.out.println("""
                    
                    ===== LIBRARY HOME =====
                    1 - Show Available Books
                    2 - Show Checked Out Books
                    3 - Exit
                    ========================
                    """);

            System.out.print("Enter your choice: ");
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
            case 1 -> showAvailableBooks(book, scanner);
            case 2 -> ShowCheckedOutBooks(book, scanner);
            case 3 -> System.out.println("Goodbye!");
            default -> System.out.println("invalid option.");
            }
        }



    }

    private static Book[] createBooks() {
        Book[] books = new Book[20];

        books[0] = new Book(101, "9780439708180", "Harry Potter and the Sorcerer's Stone", false, null);
        books[1] = new Book(102, "9780439064873", "Harry Potter and the Chamber of Secrets", true, "James Wilson");
        books[2] = new Book(103, "9780547928227", "The Hobbit", false, null);
        books[3] = new Book(104, "9780618640157", "The Lord of the Rings", true, "Sarah Johnson");
        books[4] = new Book(105, "9780061120084", "To Kill a Mockingbird", false, null);
        books[5] = new Book(106, "9780743273565", "The Great Gatsby", true, "Michael Brown");
        books[6] = new Book(107, "9780451524935", "1984", false, null);
        books[7] = new Book(108, "9780060850524", "Brave New World", true, "Emily Davis");
        books[8] = new Book(109, "9780141439518", "Pride and Prejudice", false, null);
        books[9] = new Book(110, "9780141439600", "Jane Eyre", true, "Daniel Martinez");
        books[10] = new Book(111, "9780316769488", "The Catcher in the Rye", false, null);
        books[11] = new Book(112, "9780140283334", "Lord of the Flies", true, "Olivia Taylor");
        books[12] = new Book(113, "9780553386790", "A Game of Thrones", false, null);
        books[13] = new Book(114, "9780553579901", "A Clash of Kings", true, "Christopher Lee");
        books[14] = new Book(115, "9780441172719", "Dune", false, null);
        books[15] = new Book(116, "9780345391803", "The Hitchhiker's Guide to the Galaxy", true, "Sophia Anderson");
        books[16] = new Book(117, "9780307277671", "The Road", false, null);
        books[17] = new Book(118, "9780307387899", "The Girl with the Dragon Tattoo", true, "David Thompson");
        books[18] = new Book(119, "9780385490818", "The Handmaid's Tale", false, null);
        books[19] = new Book(120, "9780307588371", "Gone Girl", true, "Jessica Miller");

        return books;
    }

    public static void listAllBooks(Book[] books) {

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
