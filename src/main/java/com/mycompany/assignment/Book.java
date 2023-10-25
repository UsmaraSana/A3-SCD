/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Book {

    String title;
    String author;
    int year;
    JButton readButton;
    private LmsFrame lmsFrame;

    public void setLmsFrame(LmsFrame lmsFrame) {
        this.lmsFrame = lmsFrame;
    }

    public Book(String title, String author, int year) {
        final String finalTitle = title;
        this.title = finalTitle;
        this.author = author;
        this.year = year;
        readButton = new JButton("Read");
        readButton.addActionListener(e -> System.out.println("Action listener added for: " + finalTitle));
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public JButton getReadButton() {
        return readButton;
    }

    private void openBookContent() {
        bookViewer.viewBook(title);
    }
}
