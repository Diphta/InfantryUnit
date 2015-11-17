/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


/**
 *
 * @author philip
 */
public class Seat {
    private boolean available = true;
    private String seatNumber = "1";
    private int x = 0;
    private int y = 0;
    
    public void draw(Graphics g) {
        if (available) {
            g.setColor(Color.GREEN);
            g.fillRect(getX(), getY(), 15, 15);
            g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 10));
            g.drawString(seatNumber, x+3, y+9);
        } else {
            g.setColor(Color.RED);
            g.fillRect(getX(), getY(), 15, 15);
            g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 10));
            g.drawString(seatNumber, x+3, y+9);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
