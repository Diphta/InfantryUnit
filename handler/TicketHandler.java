/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import Classes.Ticket;
import java.util.ArrayList;


public class TicketHandler {
    private ArrayList<Ticket> tickets;
    private final String noTicketType = "Vælg venligst en billet type";
    private final String tooManyTickets = "Du kan højst købe 4 billetter ad gangen.";
    private String discountCode = "blfr2711";
    private String discountType = "Black friday 20 % rabat \n";
    

    public TicketHandler() {
        this.tickets = new ArrayList<>();
    }

    public ArrayList getTickets() {
        return tickets;
    }

    public String getTooManyTickets() {
        return tooManyTickets;
    }

    public String getNoTicketType() {
        return noTicketType;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public String getDiscountType() {
        return discountType;
    }
    
    public int getTotal() {
        int sum = 0;
        for (Ticket ticket : tickets) {
            sum += ticket.getPrice();
        }
        return sum;
    }
    
    public String getTicketTypes() {
        String ticketType = "";
        for (Ticket ticket : tickets) {
            ticketType += ticket.getTicketType() + "\n";
        }
        return ticketType;
    }
    
    
}
