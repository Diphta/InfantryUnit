/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


public class Ticket {
    private Costumer costumer;
    String type;
    int price;

    public Ticket(/**Costumer costumer*/) {
        this.costumer = costumer;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public int getPrice() {
        return price;
    }

   
    
    public String getTicketType() {
        return type;
    }

//    public Ticket generateReceit() {
//        String receitContent = "";
//
//        receitContent += costumer + "kundeoplysninger \n";
//        receitContent += "--------------------------";
//        
//             Ticket receit = new Ticket(receitContent);   
//       return receit;
//    }

}
