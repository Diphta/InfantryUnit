/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

/**
 *
 * @author philip
 */
public class Hall {
    
    private final String name;
    final Seat[][] seats;

    public Hall(String name, int numberRows, int numberSeats) {
        this.name = name;
        this.seats = new Seat[numberRows][numberSeats];
    }

    public void fillSeats() {
        for (int x = 0; x < seats.length; x++) {
            for (int y = 0; y < seats[x].length; y++) {
                Seat st = new Seat();
                seats[x][y] = st;
            }
        }
    }
}
