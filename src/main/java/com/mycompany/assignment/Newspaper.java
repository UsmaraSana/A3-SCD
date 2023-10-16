/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author hp
 */
public class Newspaper extends Item {

    String publisher;
    String date;

    Newspaper(String p, String d, int pc) {
        super(null, false, pc, 0);
        publisher = p;
        date = d;
        itemType = 3;
    }

    @Override
    public double caclculateCost() {
        return 15;
    }

    @Override
    public void display() {
        System.out.println(itemType + ", Publisher: " + publisher + " Date: " + date);
    }

    @Override
    public String toString() {
        return itemType + ", Publisher: " + publisher + " Date: " + date + " popularity Count :" + popularityCount;
    }

    @Override
    int getid() {
        return id;
    }
}
