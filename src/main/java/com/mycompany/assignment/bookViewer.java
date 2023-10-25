/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author hp
 */
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bookViewer {
    public static void viewBook(String title) {
        String filePath = "C:\\Users\\hp\\Desktop\\SCD\\Assignments\\3\\AddedBooks\\" + title + ".txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder bookText = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                bookText.append(line).append("\n");
            }
            reader.close();

            JFrame frame = new JFrame(title);
            JTextArea textArea = new JTextArea(bookText.toString());
            textArea.setWrapStyleWord(true);
            textArea.setLineWrap(true);
            textArea.setCaretPosition(0);
            textArea.setEditable(false);

            JScrollPane scrollPane = new JScrollPane(textArea);
            frame.add(scrollPane);
            frame.setSize(800, 600);
            frame.setVisible(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading the book file.");
        }
    }
}

