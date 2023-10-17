/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

public class Book {

    String title;
    String author;
    int year;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Book(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    public void display() {
        System.out.println("Title: " + title + " by " + author + "(" + year + ")");
    }

    @Override
    public String toString() {
        return "Title: " + title + " by " + author + "(" + year + ")";
    }
}
