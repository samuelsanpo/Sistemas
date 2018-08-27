package Modelo;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.*;

import Conexion.Conex;
public class Tabla {
    
    DefaultTableModel modeloTabla;
    //conexion con = new conexion();
    
    public Tabla(){
        
        modeloTabla = new DefaultTableModel(null, getColumnas());
        setFilas();
        //initComponents();
    }
    
    private String[] getColumnas(){
        
        String columna[] = new String[]{"Enero","Febrero","Marzo","Abril",
            "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        return columna;
    }
    
    private void setFilas(){
        
       try{
           String sql = "";
                PreparedStatement us = Conex.obtener().prepareStatement(sql);
                ResultSet res = us.executeQuery();
                
                Object datos[]=new Object[12];
                
         while(res.next()){
             for(int i = 0; i<12;i++){
                 datos[i] = res.getObject(i + 1);
                 
             }
             modeloTabla.addRow(datos);
         }
         res.close();
       }catch(SQLException ex){
           Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE,null,ex);
       }
    }
}
