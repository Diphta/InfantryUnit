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

    public Ticket(/**Costumer costumer*/) {
        this.costumer = costumer;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public int getTotal() {
        int sum = 0;

        return sum;
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
