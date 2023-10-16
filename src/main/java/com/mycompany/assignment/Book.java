/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

public class Book extends Item {

    String author;
    int year;

    public Book(String t, String a, int y, int pc, int c) {
        super(t, false, pc, c);
        author = a;
        year = y;
        itemType = 1;
    }

    @Override
    public void display() {
        System.out.println(itemType + ", Title: " + title + " by " + author
                + "(" + year + ")" + " Cost:" + cost);
    }

    @Override
    public String toString() {
        return itemType + ", Title: " + title + " by " + author
                + "(" + year + ")" + " popularity Count : " + popularityCount + " Cost :" + cost;
    }

    @Override
    int getid() {
        return id;
    }

    @Override
    public double caclculateCost() {
        double cc = cost + (0.2 * (cost)) + 200;
        return cc;
    }
}
