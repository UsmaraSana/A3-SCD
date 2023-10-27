/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment;

public class Main {

    public static void main(String[] args) {
        Library lib = new Library();
        String filepath = "C:\\Users\\hp\\Desktop\\Data.txt";
        lib.loadFromFile(filepath);
        System.out.println();
        java.awt.EventQueue.invokeLater(() -> {
            LmsFrame frame = new LmsFrame(lib);
            frame.setVisible(true);
            frame.updateTable();
        });
    }
}
