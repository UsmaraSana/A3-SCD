/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author hp
 */
import java.util.*;

public class Magazine extends Item {

    String publisher;
    public List<String> authorsList;

    Magazine(String p, List authorsList, int pc, int c) {
        super(null, false, pc, c);
        publisher = p;
        this.authorsList = authorsList;
        itemType = 2;
    }

    @Override
    public void display() {
        System.out.print(itemType + ", Publisher: " + publisher + " and the authors are: " + authorsList);
        System.out.println(" Popularity Count: " + popularityCount + " Cost: " + cost);
    }

    @Override
    public double caclculateCost() {
        int cc = cost * popularityCount;
        return cc;
    }

    @Override
    public String toString() {
        return itemType + ", Publisher: " + publisher + " by authors " + authorsList + " popularity Count :" + popularityCount
                + " Cost: " + cost;
    }

    @Override
    int getid() {
        return id;
    }
}
