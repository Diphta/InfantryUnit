/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Hall {
    private boolean[][] seats;
    public static final int OFFSET_X = 10;
    public static final int OFFSET_Y = 10;
    public static final int SEAT_WIDTH = 17;
    public static final int SEAT_HEIGHT = 17;
    public static final int ROW_DIST = 10;
    public static final int SEAT_DIST = 5;
    

    public Hall(int rows, int seats){
        this.seats = new boolean[rows][seats];
    }
    
    public boolean getSeat(int row, int seat){
        return seats[row][seat];
    }
    
    public void bookSeat(int row, int seat){
        seats[row][seat] = true;
    }
    
    public void clearSeat(int row, int seat){
        seats[row][seat] = false;
    }
    
    public int translateX(int x){
        int seat = -1;
        //x er til højre for start på rækken
        if(x >= OFFSET_X){
            //x oversætts til en plads, der findes i arrayet
            if((x - OFFSET_X)/(SEAT_WIDTH + SEAT_DIST) < seats[0].length){
                //x er indenfor sædet og ikke i mellemrummet efter sædet
                if((x - OFFSET_X)%(SEAT_WIDTH + SEAT_DIST) <= SEAT_WIDTH){
                    seat = (x - OFFSET_X)/(SEAT_WIDTH + SEAT_DIST);
                }
            }
        }
        return seat;
    }
    
        public int translateY(int y){
        int row = -1;
        //y er efter start på rækkerne
        if(y >= OFFSET_Y){
            //y oversætts til en række, der findes i arrayet
            if((y - OFFSET_Y)/(SEAT_HEIGHT + ROW_DIST) < seats.length){
                //y er indenfor sædet og ikke i mellemrummet under sædet
                if((y - OFFSET_Y)%(SEAT_HEIGHT + ROW_DIST) <= SEAT_HEIGHT){
                    row = (y - OFFSET_Y)/(SEAT_HEIGHT + ROW_DIST);
                }
            }
        }
        return row;
    }
        
     public void drawSeats(Graphics g){
        int x=0;
        int y=0;
        for (int row = 0; row < seats.length; row++) {
            y = row*(SEAT_HEIGHT + ROW_DIST)+OFFSET_Y;
            for (int seat = 0; seat < seats[row].length; seat++) {
                if(seats[row][seat]){
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.GREEN);
                }
                x = seat*(SEAT_WIDTH + SEAT_DIST)+OFFSET_X;
                
                g.fillRect(x, y, SEAT_WIDTH, SEAT_HEIGHT);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, SEAT_WIDTH, SEAT_HEIGHT);
                g.setFont(new Font("TimesRoman", Font.PLAIN, 10)); 
                g.drawString(""+(seat+1), x+6, y+15);
            }
            g.drawString(""+(row+1), x+(SEAT_WIDTH + SEAT_DIST)+OFFSET_X, y+15);
            
        }
    }
    
}
