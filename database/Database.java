/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Classes.Show;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author philip
 */
public class Database {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_USR = "root";
    private static final String DATABASE_PWD = "root";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306";
    private static final String SCHEMA = "/BioTrio";
    private Connection con;
    private static Database db;
    int i = 0;
    
    private Database() {
        try {
                connect();
            } catch (ClassNotFoundException ex) {
                System.out.println("Classnotfound: "+ex.getLocalizedMessage());
            } catch (SQLException ex) {
            System.out.println("sql fejl: "+ex.getLocalizedMessage());
        }
    }
    
    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(DATABASE_URL + SCHEMA,
                DATABASE_USR, DATABASE_PWD);
    }

    public static Database getDb() {
        if (db == null) {
            db = new Database();
            
        }
        return db;
    }
    
//        public ArrayList<Show> getMovies() {
//        ArrayList<Show> str = new ArrayList<>();
//        
//        try {
//            String statement; 
//            statement = "select film.filmNavn FROM film;";
//            ResultSet rs = con.createStatement().executeQuery(statement);
//            while (rs.next()) {
//                Show show = new Show(rs.getString("filmNavn"), rs.getString("tider")); 
//                str.add((rs.getString("filmNavn") + "\n")); 
//            }
//            return str;
//           
//        } catch (SQLException ex) {
//            System.out.println("dd");
//        }
//        return str;
//    
//}

}