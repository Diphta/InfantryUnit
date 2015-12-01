///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package handler;
//
//import Classes.Hall;
//import java.sql.Statement;
//import database.Database;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class HallHandler {
//    private static HallHandler instance;
//    private HallHandler(){
//        
//    }
//    
//    public Hall getHall(int id){
//        try {
//            Statement stmt = Database.getDb().getCon().createStatement();
//            String sql = "SELECT * FROM sal WHERE sal.id = " + id;
//            
//            ResultSet rs = stmt.executeQuery(sql);
//            
//            while(rs.next()){
//                
//            }
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//        
//        
//    }
//    
//    public static HallHandler getInstance(){
//        if(instance == null){
//            instance = new HallHandler();
//        }
//        return instance;
//    }
//}
