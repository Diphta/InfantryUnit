/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import Classes.Ticket;
import java.util.ArrayList;

/**
 *
 * @author philip
 */
public class TicketHandler {
    private ArrayList<Ticket> tickets;
    private final String tooManyTickets = "Du kan højst købe 4 billetter ad gangen.";

    public TicketHandler() {
        this.tickets = new ArrayList<>();
    }

    public ArrayList getTickets() {
        return tickets;
    }

    public String getTooManyTickets() {
        return tooManyTickets;
    }
    
    public int getTotal() {
        int sum = 0;
        for (Ticket ticket : tickets) {
            sum += ticket.getPrice();
        }
        return sum;
    }
    
    
}
