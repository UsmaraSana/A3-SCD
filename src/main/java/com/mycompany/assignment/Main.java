/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Library lib = new Library();
        String filepath = "C:\\Users\\hp\\Desktop\\Books.txt";
        lib.loadFromFile(filepath);
        System.out.println();
        System.out.println("Book data loaded from file books.txt");
    }
}
