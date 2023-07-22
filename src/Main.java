import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Library Mnagemnt System UOK!");
        System.out.println("Please choose an option");
        System.out.println("1.Add a new book.");
        System.out.println("2.Update an existing book.");
        System.out.println("3.Remove an existing book.");
        System.out.println("4.Lend a book.");
        System.out.println("5.eturn a book.");
        System.out.println("6.List all avaliable book.");
        System.out.println("7.Exit");

        Scanner scanner = new Scanner(System.in);


        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
//                displayAllBooks();
//                library.displayAvailableBooks();
                break;
            case 2:
                //borrowBook(scanner);
                break;
            case 3:
                //returnBook(scanner);
                break;
            case 4:
                //bookAdd(scanner);
                break;

            case 5:
                //bookAdd(scanner);
                break;

            case 6:
                //bookAdd(scanner);
                break;
            case 7:
                System.out.println("Exiting Library Management System.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Try again!.");

        }

    }
}
