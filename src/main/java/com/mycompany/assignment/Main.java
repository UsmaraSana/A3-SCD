/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String title, author;
        int year;
        int choice;
        Scanner s = new Scanner(System.in);
        Library lib = new Library();
        String filepath = "C:\\Users\\hp\\Desktop\\books.txt";
        lib.loadFromFile(filepath);
        System.out.println();
        System.out.println("Book data loaded from file books.txt");
        /*System.out.println ("Display info of the relative item");
Item bookItem = new Book("Harry Potter", "JK Rowling", 2023);
Item magazineItem = new Magazine("Dawn", Arrays.asList("Usman", "Ahmed"));
Item newspaperItem = new Newspaper("Tahoor", new Date());
lib.displaySingleItem(bookItem);
lib.displaySingleItem(magazineItem);
lib.displaySingleItem(newspaperItem);
bookItem.display();
magazineItem.display();
newspaperItem.display();*/
        do {
            System.out.println("--------LIBRARY MANAGEMENT SYSTEM------------- ");
            System.out.println("1-Add Item");
            System.out.println("2-Edit Item");
            System.out.println("3-Delete Item");
            System.out.println("4-View Item By ID");
            System.out.println("5-View All Items data");
            System.out.println("6-Borrow an item");
            System.out.println("7-View Borrowers List");
            System.out.println("8-Hot picks!");
            System.out.println("9-Exit");
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    int popularityCount;
                    int cost;
                    System.out.println("Which item do you want to enter: \n 1-Book,2-Magazine,3-Newspaper");
                    int itemt = s.nextInt();
                    s.nextLine();
                    System.out.println();
                    switch (itemt) {
                        case 1:
                            System.out.print("Enter the title of the book: ");
                            title = s.nextLine();
                            System.out.print("Enter the author of the book: ");
                            author = s.nextLine();
                            System.out.print("Enter the year of publication of the book: ");
                            year = s.nextInt();
                            s.nextLine();
                            System.out.print("Enter the popularity count of the book: ");
                            popularityCount = s.nextInt();
                            System.out.print("Enter the cost of the Magazine: ");
                            cost = s.nextInt();
                            Book book = new Book(title, author, year, popularityCount, cost);
                            lib.addItem(book);
                            break;
                        case 2:
                            System.out.print("Enter the title of the Magazine: ");
                            String newpublisher = s.nextLine();
                            System.out.print("Enter the list of authors separated by commas: ");
                            String authorsInput = s.nextLine();
                            String[] authorsArray = authorsInput.split(",");
                            List<String> authorsList = Arrays.asList(authorsArray);
                            System.out.print("Enter the popularity count of the Magazine: ");
                            popularityCount = s.nextInt();
                            System.out.print("Enter the cost of the Magazine: ");
                            cost = s.nextInt();
                            Magazine mag = new Magazine(newpublisher, authorsList, popularityCount, cost);
                            lib.addItem(mag);
                            break;
                        case 3:
                            System.out.print("Enter the title of the Newspaper: ");
                            newpublisher = s.nextLine();
                            System.out.print("Enter the date of the Newspaper: ");
                            String newdate = s.nextLine();
                            System.out.print("Enter the popularity count of the book: ");
                            popularityCount = s.nextInt();
                            Newspaper newspaper = new Newspaper(newpublisher, newdate, popularityCount);
                            lib.addItem(newspaper);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter the id of the item to be updated: ");
                    int newid = s.nextInt();
                    Item itemToUpdate = lib.itemsList.get(newid - 1);
                    String parts = itemToUpdate.toString();
                    char itemtype = parts.charAt(0);
                    int it = Character.getNumericValue(itemtype);
                    s.nextLine();
                    switch (it) {
                        case 1:
                            System.out.print("Enter the new title of the book: ");
                            String newtitle = s.nextLine();
                            System.out.print("Enter the new author of the book: ");
                            String newauthor = s.nextLine();
                            System.out.print("Enter the new year of publication of the book: ");
                            int newyear = s.nextInt();
                            System.out.print("Enter the popularity count of the book: ");
                            popularityCount = s.nextInt();
                            System.out.print("Enter the cost of the book: ");
                            cost = s.nextInt();
                            lib.editBook(newid, newtitle, newauthor, newyear, popularityCount, cost);
                            break;
                        case 2:
                            System.out.print("Enter the title of the Magazine: ");
                            String newpublisher = s.nextLine();
                            System.out.print("Enter the list of authors separated by commas: ");
                            String authorsInput = s.nextLine();
                            String[] authorsArray = authorsInput.split(",");
                            List<String> authorsList = Arrays.asList(authorsArray);
                            System.out.print("Enter the popularity count of the Magazine: ");
                            popularityCount = s.nextInt();
                            System.out.print("Enter the cost of the Magazine: ");
                            cost = s.nextInt();
                            lib.editMagazine(newid, newpublisher, authorsList, popularityCount, cost);
                            break;
                        case 3:
                            System.out.print("Enter the new title of the Newspaper: ");
                            newpublisher = s.nextLine();
                            System.out.print("Enter the new date of the Newspaper: ");
                            String newdate = s.nextLine();
                            System.out.print("Enter the popularity count of the Newspaper: ");
                            popularityCount = s.nextInt();
                            lib.editNewspaper(newid, newpublisher, newdate, popularityCount);
                            break;
                        default:
                            break;
                    }
                    break;

                case 3:
                    System.out.print("Enter the id of the item to be deleted: ");
                    int delid = s.nextInt();
                    boolean del;
                    del = lib.deleteItem(delid);
                    System.out.println("Book removed: " + del);
                    break;
                case 4:
                    System.out.print("Enter the id of the item to be viewed: ");
                    int viewid = s.nextInt();
                    lib.viewBookById(viewid);
                    break;
                case 5:
                    lib.viewAllBooks();
                    break;
                case 6:
                    System.out.print("Enter your name: ");
                    String n = s.nextLine();
                    System.out.println("Below are the list of items:");
                    lib.viewAllBooks();
                    System.out.println("Enter the id of item you want to borrow ");
                    int bid = s.nextInt();
                    s.nextLine();
                    boolean borrowStatus = lib.borrowItem(bid, n);
                    if (borrowStatus) {
                        System.out.println("Item borrowed successfully by " + n);
                    } else {
                        System.out.println("This item cannot be borrowed");
                    }
                    break;
                case 7:
                    lib.viewBorrowersList();
                    break;
                case 8:
                    lib.displayItemsSortedByPopularity();
                    break;
            }
        } while (choice != 9);
    }
}
