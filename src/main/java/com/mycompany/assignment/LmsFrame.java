/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.assignment;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author hp
 */
public final class LmsFrame extends javax.swing.JFrame {

    private Library library;
    private BarGraph barGraph;

    /**
     * Creates new form frame1
     *
     * @param lib
     */
    public LmsFrame(Library lib) {
        initComponents();
        this.library = lib;
        TableColumn buttonColumn = Table.getColumnModel().getColumn(3);
        buttonColumn.setCellRenderer(new ButtonRenderer());
        buttonColumn.setCellEditor(new ButtonEditor(new JCheckBox()));
        updateTable();
        barGraph = new BarGraph(library);
        barGraph.setBounds(20, 20, 600, 400);
        barGraph.setVisible(true);
        add(barGraph);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        additemButton = new javax.swing.JButton();
        editItemButton = new javax.swing.JButton();
        deleteitemButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        GraphButton = new javax.swing.JButton();

        jDialog1.setTitle("Add item");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LMS");
        setBackground(new java.awt.Color(255, 255, 255));

        additemButton.setBackground(new java.awt.Color(204, 204, 255));
        additemButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        additemButton.setText("Add Item");
        additemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemButtonActionPerformed(evt);
            }
        });

        editItemButton.setBackground(new java.awt.Color(204, 204, 255));
        editItemButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editItemButton.setText("Edit Item");
        editItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemButtonActionPerformed(evt);
            }
        });

        deleteitemButton.setBackground(new java.awt.Color(204, 204, 255));
        deleteitemButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteitemButton.setText("Delete Item");
        deleteitemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitemButtonActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Author", "Publication Year", "Read Item"
            }
        ));
        Table.setToolTipText("");
        Table.setName(""); // NOI18N
        Table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Table.setShowGrid(true);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setHeaderValue("Title");
            Table.getColumnModel().getColumn(1).setHeaderValue("Author");
            Table.getColumnModel().getColumn(2).setHeaderValue("Publication Year");
            Table.getColumnModel().getColumn(3).setHeaderValue("Read Item");
        }

        GraphButton.setBackground(new java.awt.Color(204, 204, 255));
        GraphButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GraphButton.setText("Graph");
        GraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(GraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(additemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(editItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(deleteitemButton)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editItemButton)
                    .addComponent(deleteitemButton)
                    .addComponent(additemButton)
                    .addComponent(GraphButton))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 82, Short.MAX_VALUE)))
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

    private void additemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemButtonActionPerformed
        // TODO add your handling code here:
        addItem addFrame = new addItem(library, this);
        addFrame.setVisible(true);
    }//GEN-LAST:event_additemButtonActionPerformed

    private void editItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemButtonActionPerformed
        // TODO add your handling code here:
        editItem editFrame = new editItem(library, this);
        editFrame.setVisible(true);
    }//GEN-LAST:event_editItemButtonActionPerformed

    private void deleteitemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitemButtonActionPerformed
        // TODO add your handling code here:
        deleteItem deleteFrame = new deleteItem(library, this);
        deleteFrame.setVisible(true);
    }//GEN-LAST:event_deleteitemButtonActionPerformed

    private void GraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphButtonActionPerformed
        // TODO add your handling code here:
        JFrame graphFrame = new JFrame("Popularity Graph");
        graphFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        BarGraph barGraph = new BarGraph(library);
        graphFrame.add(barGraph);
        graphFrame.setSize(800, 600);
        graphFrame.setVisible(true);
    }//GEN-LAST:event_GraphButtonActionPerformed

    public void updateTable() {
        DefaultTableModel tableModel = (DefaultTableModel) Table.getModel();
        tableModel.setRowCount(0);

        Object[][] bookData = library.getBooksData();
        for (Object[] r : bookData) {
            tableModel.addRow(r);
        }

        Table.setModel(tableModel);
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText("Read");
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {

        private JButton button;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener((ActionEvent e) -> {
                int selectedRow = Table.getSelectedRow();
                if (selectedRow >= 0) {
                    String title1 = (String) Table.getValueAt(selectedRow, 0);
                    Book book = library.getBookByTitle(title1);
                    if (book != null) {
                        book.popularityCountInc();
                        viewBook(title1);
                    }
                }
            });
            setClickCountToStart(1);
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            button.setText("Read");
            return button;
        }
    }

    public void viewBook(String title) {
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GraphButton;
    private javax.swing.JTable Table;
    private javax.swing.JButton additemButton;
    private javax.swing.JButton deleteitemButton;
    private javax.swing.JButton editItemButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
