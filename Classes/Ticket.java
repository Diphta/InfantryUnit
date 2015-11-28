/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Simon
 */
public class Ticket {
    private Costumer costumer;
    String name;
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

   
    
    public String toString() {
        return name;
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
