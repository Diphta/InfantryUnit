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
public abstract class InfantryUnit {
    private int range;
    private int armor;
    private int hits;
    private int damage;
    String name;
    int xp;
    int level;
    boolean alive = true;
    
    public InfantryUnit(int range, int armor, int hits, int damage) {
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
        xp = 0;
        level = 1;
    }
    public void tageDamage(int damage) {
        int reduction = (int) (Math.random() * armor);
        if (damage > reduction) {
            hits = hits - (damage-reduction);
        }
    }
    public void attack(InfantryUnit unit) {
        int attackDamage = (int) (Math.random()*damage)+1;
        unit.tageDamage(attackDamage);
        System.out.println(name + " attacked " + unit.getName() + " for " + damage + " damage. ");
        if (unit.getHits() <= 0) {
            System.out.println(unit.getName() + " has died");
            unit.setAlive(false);
            xp += 10;
            if (xp == 10) {
                 levelUp();
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getHits() {
        return hits;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getDamage() {
        return damage;
    }

    public void levelUp() {
        damage += 1;
        level += 1;
        xp = 0;
        System.out.println(name + " has leveled up!\n" + name + " is now level " + level + ".");
    }
    
      
}
