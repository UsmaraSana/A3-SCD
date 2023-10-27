package com.mycompany.assignment;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hp
 */
public class BarGraph extends JPanel {

    private Library library;

    public BarGraph(Library library) {
        this.library = library;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 50;
        int barWidth = 40;
        int maxY = 50;
        int scaleGap = 10;
        g.setColor(Color.BLACK);
        g.drawLine(40, getHeight() - 50, 40, 50);
        g.drawLine(40, getHeight() - 50, getWidth() - 40, getHeight() - 50);

        for (Book book : library.getBooksList()) {
            int popularity = book.getPopularityCount();
            int barHeight = (int) ((double) popularity / maxY * (getHeight() - 100));
            int yBar = getHeight() - 50 - barHeight;
            int yTitle = getHeight() - 20;
            g.setColor(Color.RED);
            g.fillRect(x, yBar, barWidth, barHeight);
            g.setColor(Color.BLACK);
            g.drawRect(x, yBar, barWidth, barHeight);
            g.drawString(book.getTitle(), x + barWidth / 2 - 20, yTitle);
            x += barWidth + 40;
        }
        for (int i = 0; i <= maxY; i += scaleGap) {
            int y = getHeight() - 50 - (i * (getHeight() - 100) / maxY);
            g.setColor(Color.BLACK);
            g.drawLine(40, y, 45, y);
            g.drawString(Integer.toString(i), 20, y);
        }
    }
}
