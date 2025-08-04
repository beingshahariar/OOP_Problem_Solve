package Question5;

import java.util.ArrayList;
import java.util.List;

class BookOutOfStockException extends Exception {
    public BookOutOfStockException(String message) {
        super(message);
    }
}

class Book {
    String title;
    String author;
    int numberOfAvailableCopies;

    public Book(String title, String author, int numberOfAvailableCopies) {
        this.title = title;
        this.author = author;
        this.numberOfAvailableCopies = numberOfAvailableCopies;
    }

    void buyBook() throws BookOutOfStockException {
        if (numberOfAvailableCopies <= 0) {
            throw new BookOutOfStockException("The value of numberOfAvailableCopies is 0.");
        }
        numberOfAvailableCopies--;
    }
}

class Library {
    List<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        for (Book b : books) {
            if (b.title.equals(book.title)) {
                return;
            }
        }
        books.add(book);
    }

    void buyBook(String bookTitle) {
        for (int i=0; i< books.size(); i++) {
            Book b = books.get(i);
            if (b.title.equals(bookTitle)) {
                try {
                    b.buyBook();
                    System.out.println("Book purchased successfully.");
                    books.set(i, new Book(b.title, b.author, b.numberOfAvailableCopies-1));
                    break;
                } catch (BookOutOfStockException e) {
                    System.out.println("The book you are willing to order is unavailable");
                }
                break;
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Alchemist", "Paulo Coelho", 5));
        library.addBook(new Book("The Da Vinci Code", "Dan Brown", 3));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 2));

        library.buyBook("The Alchemist");
        library.buyBook("The Da Vinci Code");
        library.buyBook("The Great Gatsby");
        library.buyBook("The Great Gatsby");
    }
}


