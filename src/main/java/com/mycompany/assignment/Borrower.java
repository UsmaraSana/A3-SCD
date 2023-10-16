/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author hp
 */
public class Borrower {

    String name;
    Item borrowedItem;

    Borrower(String n) {
        name = n;
        borrowedItem = null;
    }

    public String getName() {
        return name;
    }

    public Item getBorrowedItem() {
        return borrowedItem;
    }

    public void setBorrowedItem(Item item) {
        this.borrowedItem = item;
    }

    @Override
    public String toString() {
        if (borrowedItem != null) {
            return "Borrower: " + name + ", Borrowed Item: " + borrowedItem.toString();
        } else {
            return "Borrower: " + name + ", No item borrowed";
        }
    }

}
