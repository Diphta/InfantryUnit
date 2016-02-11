/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designmønster;



/**
 *
 * @author Tanja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       InfantryUnit unit = HumanInfantryFactory.getInstance().createUnit(4);
       InfantryUnit unit1 = HumanInfantryFactory.getInstance().createUnit(5);
       
        System.out.println(unit.getDamage());
        while (unit1.alive)
            unit.attack(unit1);
        System.out.println(unit.getDamage());
   }
        
        
       }

        
    
    

