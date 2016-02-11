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
public class HumanInfantryFactory {
    InfantryUnit unit;
    
    private HumanInfantryFactory() {
    }
    
    public static HumanInfantryFactory getInstance() {
        return HumanInfantryFactoryHolder.INSTANCE;
    }
    
    private static class HumanInfantryFactoryHolder {

        private static final HumanInfantryFactory INSTANCE = new HumanInfantryFactory();
    }
    
    
    public InfantryUnit createUnit(int techLevel) {
        switch (techLevel) {
            case 1: unit = new RockHauler(4, 2, 2, 1);
                           break;
            case 2: unit = new SpearThrower(3, 3, 3, 2);
                           break;
            case 3: unit = new Archer(5, 4, 4, 3);
                           break;
            case 4: unit = new CrossbowMan(6, 4, 5, 4);
                           break;
            case 5: unit = new Musketeer(8, 5, 7, 5);
                           break;
               
        }
        return unit;
    }
}
