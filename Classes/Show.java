/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author philip
 */
public class Show implements Comparable<Show> {

    private int id;
    private String name;
    private String time;
    private String date;
    private String hallNumber;
    //private Hall hall;

    public Show(int id, String name, String time, String date, String hallNumber) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.date = date;
        this.hallNumber = hallNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Show o) {
        return this.name.compareTo(o.name);
    }
}
