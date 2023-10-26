/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author hp
 */
public class addItem extends javax.swing.JFrame {

    private Library library;
    private LmsFrame lf;

    /**
     * Creates new form addItem
     *
     * @param lib
     * @param lf
     */
    public addItem(Library lib, LmsFrame lf) {
        initComponents();
        this.library = lib;
        this.lf = lf;

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddItemSave = new javax.swing.JButton();
        publicationYearFieldAdd = new javax.swing.JTextField();
        authorFieldAdd = new javax.swing.JTextField();
        titleFieldAdd = new javax.swing.JTextField();
        titleAdd = new java.awt.Label();
        authorAdd = new java.awt.Label();
        publicationYearAdd = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Item");
        setBackground(new java.awt.Color(255, 255, 255));

        AddItemSave.setBackground(new java.awt.Color(204, 204, 255));
        AddItemSave.setText("Add Item");
        AddItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemSaveActionPerformed(evt);
            }
        });

        titleAdd.setText("Title:");

        authorAdd.setName(""); // NOI18N
        authorAdd.setText("Author:");

        publicationYearAdd.setText("Publication Year:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(authorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicationYearAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(titleFieldAdd)
                        .addComponent(authorFieldAdd)
                        .addComponent(publicationYearFieldAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                    .addComponent(AddItemSave, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(authorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicationYearAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicationYearFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddItemSave)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemSaveActionPerformed
    {                                            
    String title = titleFieldAdd.getText();
    String author = authorFieldAdd.getText();
    String yearString = publicationYearFieldAdd.getText();
    try {
        int yearInt = Integer.parseInt(yearString);

        if (title.isEmpty() || author.isEmpty() || yearString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all the fields!", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean bookAlreadyExists = false;
            for (Book book : library.getBooksList()) {
                if (book.getTitle().equals(title)) {
                    bookAlreadyExists = true;
                    break;
                }
            }

            if (!bookAlreadyExists) {
                Book book = new Book(title, author, yearInt);
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\Data.txt", true))) {
                        String bookData = "\n"+title + "," + author + "," + yearInt;
                        bw.write(bookData);
                        bw.newLine();
                        
                 
                } catch (IOException e) {
                    System.out.println("Error writing to file!" + e.getMessage());
                }
                JButton readButton = new JButton("Read");
                readButton.addActionListener(e -> {
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
                });
                library.addBook(book);
                String filePath = "C:\\Users\\hp\\Desktop\\SCD\\Assignments\\3\\AddedBooks\\" + title + ".txt";
                try {
                    File file = new File(filePath);
                    if (file.createNewFile()) {
                        System.out.println("File created: " + file.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.err.println("Error creating the file.");
                }
                lf.updateTable();
                setVisible(false);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Book with this title already exists.");
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Enter an integer for the year field!", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    }//GEN-LAST:event_AddItemSaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItemSave;
    private java.awt.Label authorAdd;
    private javax.swing.JTextField authorFieldAdd;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label publicationYearAdd;
    private javax.swing.JTextField publicationYearFieldAdd;
    private java.awt.Label titleAdd;
    private javax.swing.JTextField titleFieldAdd;
    // End of variables declaration//GEN-END:variables
}
