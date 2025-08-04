import java.util.ArrayList;
import java.util.Scanner;

// Parent class Person
class Person {
    private String name;
    private String email;
    private int ID;

    public Person(String name, String email, int ID) {
        this.name = name;
        this.email = email;
        this.ID = ID;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void borrowBook() {
        System.out.println(name + " (Person) has borrowed a book.");
    }
}

// Child class Student inheriting from Person
class Student extends Person {
    private int yearOfStudy;
    private String department;

    public Student(String name, String email, int ID, int yearOfStudy, String department) {
        super(name, email, ID);
        this.yearOfStudy = yearOfStudy;
        this.department = department;
    }

    // Getters and Setters
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Polymorphic method
    public void borrowBook() {
        System.out.println(getName() + " (Student) has borrowed a book.");
    }
}

// Class Book
class Book {
    private String bookID;
    private String title;
    private boolean isAvailable;

    public Book(String bookID, String title) {
        this.bookID = bookID;
        this.title = title;
        this.isAvailable = true; // Book is available when first added
    }

    // Getters and Setters
    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title: \"" + title + "\"";
    }
}

// Class BorrowTransaction
class BorrowTransaction {
    private String studentID;
    private String bookID;
    private String borrowDate;
    private String returnDate;

    public BorrowTransaction(String studentID, String bookID, String borrowDate) {
        this.studentID = studentID;
        this.bookID = bookID;
        this.borrowDate = borrowDate;
        this.returnDate = "Not returned yet";
    }

    // Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BorrowTransaction: Student ID: " + studentID + ", Book ID: " + bookID +
                ", Borrow Date: " + borrowDate + ", Return Date: " + returnDate;
    }
}

// Class Library
class Library {
    private ArrayList<Book> books;
    private ArrayList<BorrowTransaction> transactions;

    public Library() {
        books = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    // Method to borrow a book
    public void borrowBook(String studentID, String bookID, String borrowDate) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID) && book.isAvailable()) {
                book.setAvailable(false);
                BorrowTransaction transaction = new BorrowTransaction(studentID, bookID, borrowDate);
                transactions.add(transaction);
                System.out.println("Book " + book.getTitle() + " borrowed successfully.");
                return;
            }
        }
        System.out.println("Book is not available.");
    }

    // Method to return a book
    public void returnBook(String bookID, String returnDate) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID) && !book.isAvailable()) {
                book.setAvailable(true);
                for (BorrowTransaction transaction : transactions) {
                    if (transaction.getBookID().equals(bookID) && transaction.getReturnDate().equals("Not returned yet")) {
                        transaction.setReturnDate(returnDate);
                        System.out.println("Book " + book.getTitle() + " returned successfully.");
                        return;
                    }
                }
            }
        }
        System.out.println("Book not found or already returned.");
    }

    // Method to display available books
    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}

// Main class to simulate the Library Management System
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Add some books to the library
        library.addBook(new Book("B1001", "Introduction to Java"));
        library.addBook(new Book("B1002", "Data Structures"));
        library.addBook(new Book("B1003", "Algorithms"));

        // Create a Student
        Student student = new Student("John Doe", "john.doe@example.com", 101, 2, "Computer Science");

        int choice;
        do {
            System.out.println("\nLibrary Management System:");
            System.out.println("1: Add a new book");
            System.out.println("2: Borrow a book");
            System.out.println("3: Return a book");
            System.out.println("4: Display available books");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    String bookID = sc.next();
                    System.out.print("Enter book title: ");
                    sc.nextLine();  // Clear the newline
                    String title = sc.nextLine();
                    library.addBook(new Book(bookID, title));
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    String studentID = sc.next();
                    System.out.print("Enter book ID: ");
                    String borrowBookID = sc.next();
                    System.out.print("Enter borrow date (dd/mm/yyyy): ");
                    String borrowDate = sc.next();
                    library.borrowBook(studentID, borrowBookID, borrowDate);
                    break;

                case 3:
                    System.out.print("Enter book ID: ");
                    String returnBookID = sc.next();
                    System.out.print("Enter return date (dd/mm/yyyy): ");
                    String returnDate = sc.next();
                    library.returnBook(returnBookID, returnDate);
                    break;

                case 4:
                    library.displayAvailableBooks();
                    break;

                case 5:
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
