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

    public List<Book> itemsList;

    Library() {
        itemsList = new ArrayList<>();
    }

    public void addItem(Book a) {
        itemsList.add(a);
    }

    public boolean deleteItem(String title) {
        Iterator<Book> i = itemsList.iterator();
        boolean condition = false;
        while (i.hasNext()) {
            Book b = i.next();
            if (b.getTitle().equals(title)) {
                i.remove();
                condition = true;
            }
        }
        return condition;
    }

    public void editBook(int id, String t, String a, int y) {
        for (Book b : itemsList) {
            Book book = (Book) b;
            book.title = t;
            book.author = a;
            book.year = y;
        }
    }

    public void viewAllBooks() {
        for (Book b : itemsList) {
            System.out.println(b);
        }
    }

    /* public void viewBookById(int id) {
        boolean condition = false;
        for (Book b : itemsList) {
            if (b.getid() == id) {
                condition = true;
                System.out.println(b);
            }
        }
        if (condition == false) {
            System.out.println("No record found for this ID");
        }
    }
    
    /*public void displayItemsSortedByPopularity() {
        List<Book> tempList = new ArrayList<>(itemsList);
        sortItemsByPopularity(tempList);

        for (Book item : tempList) {
            System.out.println(item);
        }
    }

    private void sortItemsByPopularity(List<Book> itemList) {
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
    }*/
    public void loadFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) {
                    System.out.println("Invalid line in the input file: " + line);
                    continue;
                }
                String title = parts[1].trim();
                String author = parts[2].trim();
                int year = Integer.parseInt(parts[3].trim());
                //int popularityCount = Integer.parseInt(parts[4].trim());
                Book book = new Book(title, author, year);
                itemsList.add(book);
                break;
            }
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }
}
