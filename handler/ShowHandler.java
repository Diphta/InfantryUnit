/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import Classes.Hall;
import Classes.Show;
import database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tanja
 */
public class ShowHandler {

    private static ShowHandler instance;

    ArrayList<Show> shows;

    private ShowHandler() {

    }

    public ArrayList<Show> getShows() {
        ArrayList<Show> theShows = new ArrayList<>();

        try {
            Statement stmt = Database.getDb().getCon().createStatement();

            String sql = "select film.filmNavn, film.id as film_id, datoer.datoer, tider.tider, sal.salNummer from forestilling, film, tider, datoer, sal\n"
                    + "where forestilling.film_id = film.id\n"
                    + "AND tider_id = tider.id\n"
                    + "AND datoer_id = datoer.id\n"
                    + "AND sal_id = sal.id";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("film.filmNavn");
                int id = rs.getInt("film_id");
                String date = rs.getString("datoer.datoer");
                String time = rs.getString("tider.tider");
                String hallNumber = rs.getString("sal.salNummer");

                theShows.add(new Show(id, name, time, date, hallNumber));
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return theShows;
    }

    public static ShowHandler getInstance() {
        if (instance == null) {
            instance = new ShowHandler();
        }
        return instance;
    }

    public void removeDuplicates(ArrayList<Show> shows) {
        for (int i = 0; i < shows.size() - 1; i++) {
            Show theShow = shows.get(i);
            for (int j = i + 1; j < shows.size(); j++) {
                Show nextShow = shows.get(j);
                if (theShow.compareTo(nextShow) == 0) {
                    shows.remove(j);
                    j--;
                }
            }
        }
    }

    public ArrayList<String> getTimes(Show theShow) {

        ArrayList<String> times = new ArrayList<>();
        ArrayList<Show> shows = getShows();
        
        for (int i = 0; i < shows.size(); i++) {
            Show show = shows.get(i);
            
            if(show.compareTo(theShow)==0){
                times.add(show.getTime());
            }
        }
        
        return times;
    }

}
