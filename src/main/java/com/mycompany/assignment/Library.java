/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

import java.util.*;
import java.io.*;
import javax.swing.JButton;

/**
 *
 * @author hp
 */
public class Library {

    public ArrayList<Book> booksList;
    private LmsFrame lmsFrame;

    public void setLmsFrame(LmsFrame lmsFrame) {
        this.lmsFrame = lmsFrame;
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    Library() {
        booksList = new ArrayList<>();
    }

    public void addBook(Book a) {
        booksList.add(a);
    }

    public boolean deleteItem(String title) {
        Iterator<Book> i = booksList.iterator();
        boolean condition = false;
        while (i.hasNext()) {
            Book b = i.next();
            if (b.getTitle().equals(title)) {
                i.remove();
                condition = true;
                break;
            }
        }
        return condition;
    }

    public void editBook(String t, String a, int y) {
        for (Book b : booksList) {
            if (b.getTitle().equals(t)) {
                b.title = t;
                b.author = a;
                b.year = y;
                break;
            }
        }
    }

    public void viewAllBooks() {
        for (Book b : booksList) {
            System.out.println(b);
        }
    }

    public Object[][] getBooksData() {
        Object[][] data = new Object[booksList.size()][5];
        for (int i = 0; i < booksList.size(); i++) {
            Book book = booksList.get(i);
            data[i][0] = book.getTitle();
            data[i][1] = book.getAuthor();
            data[i][2] = book.getYear();
            JButton readButton = new JButton("Read");
            final int finalI = i;
            readButton.addActionListener(e -> {
                String title = (String) data[finalI][0];
                lmsFrame.viewBook(title);
            });
            data[i][3] = readButton;
        }
        return data;
    }

    public int calculateMaxPopularity() {
        int maxPopularity = 0;
        for (Book book : booksList) {
            int popularity = book.getPopularityCount();
            if (popularity > maxPopularity) {
                maxPopularity = popularity;
            }
        }
        return maxPopularity;
    }

    public Book getBookByTitle(String title) {
        for (Book book : booksList) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void loadFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 1) {
                    System.out.println("Invalid line in the input file: " + line);
                    continue;
                }
                String title = parts[0].trim();
                String author = parts[1].trim();
                int year = Integer.parseInt(parts[2].trim());
                int popCount = Integer.parseInt(parts[3].trim());
                Book book = new Book(title, author, year, popCount);
                booksList.add(book);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file " + e.getMessage());
        }
    }
}
