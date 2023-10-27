/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class editItem extends javax.swing.JFrame {

    private Library library;
    private LmsFrame lf;

    /**
     * Creates new form EditItem
     *
     * @param lib
     * @param lf
     */
    public editItem(Library lib, LmsFrame lf) {
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
        editItemSave = new javax.swing.JButton();
        publicationYearFieldEdit = new javax.swing.JTextField();
        authorFieldEdit = new javax.swing.JTextField();
        titleFieldEdit = new javax.swing.JTextField();
        titleEdit = new java.awt.Label();
        authorEdit = new java.awt.Label();
        publicationYearEdit = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Item");
        setBackground(new java.awt.Color(255, 255, 255));

        editItemSave.setBackground(new java.awt.Color(204, 204, 255));
        editItemSave.setText("Edit Item");
        editItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemSaveActionPerformed(evt);
            }
        });

        titleEdit.setText("Title:");

        authorEdit.setName(""); // NOI18N
        authorEdit.setText("Author:");

        publicationYearEdit.setText("Publication Year:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(authorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicationYearEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(titleFieldEdit)
                        .addComponent(authorFieldEdit)
                        .addComponent(publicationYearFieldEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                    .addComponent(editItemSave, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(authorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicationYearEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicationYearFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editItemSave)
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

    private void editItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemSaveActionPerformed
        String title = titleFieldEdit.getText();
        String author = authorFieldEdit.getText();
        String yearString = publicationYearFieldEdit.getText();

        try {
            int yearInt = Integer.parseInt(yearString);
            if (title.isEmpty() || author.isEmpty() || yearString.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter all the fields!", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                boolean found = false;
                List<Book> tempBooksList = new ArrayList<>();

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\Data.txt"))) {
                    for (Book b : library.booksList) {
                        if (titleFieldEdit.getText().equals(b.getTitle())) {
                            library.editBook(title, author, yearInt);
                            tempBooksList.add(new Book(title, author, yearInt, b.getPopularityCount()));
                            found = true;
                        } else {
                            tempBooksList.add(b);
                        }
                    }
                    for (Book b : tempBooksList) {
                        String bookData = b.getTitle() + "," + b.getAuthor() + "," + b.getYear() + "," + b.getPopularityCount();
                        bw.write(bookData);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    System.out.println("Error writing to file!" + e.getMessage());
                }

                if (!found) {
                    JOptionPane.showMessageDialog(null, "No such book exists!", "Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    library.booksList = (ArrayList<Book>) tempBooksList;
                    lf.updateTable();
                    lf.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter an integer for the year field!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_editItemSaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label authorEdit;
    private javax.swing.JTextField authorFieldEdit;
    private javax.swing.JButton editItemSave;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label publicationYearEdit;
    private javax.swing.JTextField publicationYearFieldEdit;
    private java.awt.Label titleEdit;
    private javax.swing.JTextField titleFieldEdit;
    // End of variables declaration//GEN-END:variables
}
