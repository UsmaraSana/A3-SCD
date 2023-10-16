/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

import java.util.*;
import java.io.*;

/**
 *
 * @author hp
 */
public class Library {

    public List<Item> itemsList;
    public List<Borrower> borrowersList;

    Library() {
        itemsList = new ArrayList<>();
        borrowersList = new ArrayList<>();
    }

    public void addBorrower(Borrower b) {
        borrowersList.add(b);
    }

    public void addItem(Item a) {
        itemsList.add(a);
    }

    public boolean deleteItem(int id) {
        Iterator<Item> i = itemsList.iterator();
        boolean condition = false;
        while (i.hasNext()) {
            Item b = i.next();
            if (b.getid() == id) {
                i.remove();
                condition = true;
            }
        }
        return condition;
    }

    public void editBook(int id, String t, String a, int y, int pc, int c) {
        for (Item b : itemsList) {
            if (b.getid() == id) {
                Book book = (Book) b;
                book.title = t;
                book.author = a;
                book.year = y;
                book.popularityCount = pc;
                book.cost = c;
            }
        }
    }

    public void editMagazine(int id, String p, List authorList, int pc, int c) {
        for (Item b : itemsList) {
            if (b.getid() == id) {
                Magazine mag = (Magazine) b;
                mag.publisher = p;
                mag.authorsList = authorList;
                mag.popularityCount = pc;
                mag.cost = c;
            }
        }
    }

    public void editNewspaper(int id, String p, String d, int pc) {
        for (Item b : itemsList) {
            if (b.getid() == id) {
                Newspaper nws = (Newspaper) b;
                nws.publisher = p;
                nws.date = d;
                nws.popularityCount = pc;
            }
        }
    }

    public void viewAllBooks() {
        for (Item b : itemsList) {
            System.out.println(b);
        }
    }

    public void viewBookById(int id) {
        boolean condition = false;
        for (Item b : itemsList) {
            if (b.getid() == id) {
                condition = true;
                System.out.println(b);
            }
        }
        if (condition == false) {
            System.out.println("No record found for this ID");
        }

    }

    void displaySingleItem(Item i) {
        i.display();
    }

    void viewBorrowersList() {
        for (Borrower b : borrowersList) {
            System.out.println(b);
        }
        if (borrowersList.isEmpty()) {
            System.out.println("No record found");
        }
    }

    public boolean borrowItem(int itemId, String borrowerName) {
        Item itemToBorrow = null;

        for (Item item : itemsList) {
            if (item.getid() == itemId) {
                if (item.isBorrowed) {
                    System.out.println("This item is already borrowed.");
                    return false;
                } else {
                    double c = item.caclculateCost();
                    System.out.println("Your total bill for the borrowed item is: " + c);
                    itemToBorrow = item;
                    item.isBorrowed = true;
                    break;
                }
            }
        }

        if (itemToBorrow != null) {
            Borrower borrower = new Borrower(borrowerName);
            borrowersList.add(borrower);
            itemToBorrow.popularityCount++;
            borrower.setBorrowedItem(itemToBorrow);
            return true;
        } else {
            System.out.println("Invalid Id! Item not found");
            return false;
        }
    }

    public void displayItemsSortedByPopularity() {
        List<Item> tempList = new ArrayList<>(itemsList);
        sortItemsByPopularity(tempList);

        for (Item item : tempList) {
            System.out.println(item);
        }
    }

    private void sortItemsByPopularity(List<Item> itemList) {
        int n = itemList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int popularity1 = itemList.get(j).popularityCount;
                int popularity2 = itemList.get(j + 1).popularityCount;
                if (popularity1 < popularity2) {
                    Collections.swap(itemList, j, j + 1);
                }
            }
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) {
                    System.out.println("Invalid line in the input file: " + line);
                    continue;
                }

                int itemt = Integer.parseInt(parts[0].trim());
                switch (itemt) {
                    case 1:
                        String title = parts[1].trim();
                        String author = parts[2].trim();
                        int year = Integer.parseInt(parts[3].trim());
                        int popularityCount = Integer.parseInt(parts[4].trim());
                        int cost = Integer.parseInt(parts[5].trim());
                        Book book = new Book(title, author, year, popularityCount, cost);
                        itemsList.add(book);
                        break;

                    case 2:
                        String publisher = parts[1].trim();
                        List<String> authorsList = new ArrayList<>();
                        int i = 2;
                        int pc = 0;
                        int c = 0;
                        while (i < parts.length - 2) {
                            authorsList.add(parts[i].trim());
                            i++;
                        }
                        if (i < parts.length) {
                            pc = Integer.parseInt(parts[parts.length - 2].trim());
                            c = Integer.parseInt(parts[parts.length - 1].trim());
                        }
                        Magazine magazine = new Magazine(publisher, authorsList, pc, c);
                        itemsList.add(magazine);
                        break;

                    case 3:
                        String newspaperPublisher = parts[1].trim();
                        String newdate = parts[3].trim();
                        int pcNewspaper = Integer.parseInt(parts[2].trim());

                        Newspaper newspaper = new Newspaper(newspaperPublisher, newdate, pcNewspaper);
                        itemsList.add(newspaper);
                        break;

                    default:
                        System.out.println("Invalid item type: " + itemt);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }
}
