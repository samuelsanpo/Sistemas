/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;

/**
 *
 * @author Samuel
 */
public class Conex {
   
 public static void connect(){
String url = "jdbc:mysql://localhost:3306/demanda_mrp1";
String user = "root";
String pass = "Online123";
System.out.println("Conectando...");
try(Connection connection = DriverManager.getConnection(url, user,pass)){
System.out.println("Conectado!!");
 
}catch(SQLException e){
System.out.println(e.getMessage());
}
}

    public static Object obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}