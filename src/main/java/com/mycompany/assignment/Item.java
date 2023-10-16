/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author hp
 */
public abstract class Item implements Configuration {

    public static int nextId = 1;
    int itemType;
    int id;
    String title;
    boolean isBorrowed;
    int popularityCount;
    int cost;

    Item(String t, boolean ib, int pc, int c) {
        id = nextId++;
        title = t;
        isBorrowed = ib;
        popularityCount = pc;
        cost = c;
    }
    
    int getid() {
        return id;
    }
    
    @Override
    public abstract double caclculateCost();

}
