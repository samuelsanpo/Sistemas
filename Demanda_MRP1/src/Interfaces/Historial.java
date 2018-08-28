
package Interfaces;

import Conexion.Conex;
import Modelo.Tabla;
import java.awt.Color;
import java.awt.Window;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.*;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import Conexion.Conex;

public class Historial extends javax.swing.JPanel {

    DefaultTableModel modeloTabla;
     Conex C = new Conex();
      
    
   
    public Historial() {
        initComponents();
        
      
      GraficasHistorial.setBackground(new java.awt.Color(240,0,0));
      GraficasHistorial.setForeground(Color.black);
      SalirHistorial.setBackground(new java.awt.Color(0,0,0));
      SalirHistorial.setForeground(Color.white);
      
        try{
            
           
           DefaultTableModel modeloTabla = new DefaultTableModel()  ;
            TablaHistorial.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conex C = new Conex();
            Connection con = C.connect();
            
            
              String sql ="SELECT Cantidad_pedida FROM pedido " ;
              ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData  raMd =  rs.getMetaData();
            int CantidadColumnas = raMd.getColumnCount();
            
            modeloTabla.addColumn("Enero");
            modeloTabla.addColumn("Febrero");
            modeloTabla.addColumn("Marzo ");
            modeloTabla.addColumn("Abril ");
            modeloTabla.addColumn("Mayo ");
            modeloTabla.addColumn("Junio ");
            modeloTabla.addColumn("Julio ");
            modeloTabla.addColumn("Agosto ");
            modeloTabla.addColumn("Septiembre ");
            modeloTabla.addColumn("Octubre ");
            modeloTabla.addColumn("Noviembre ");
            modeloTabla.addColumn("Diciembre");
            
            
            
            
            
            while (rs.next()){
                
                Object[] filas = new Object[CantidadColumnas];
                
                for( int i=0; i <CantidadColumnas; i++){
                    
                    filas[i] = rs.getObject(i+1);  
                }
                
                modeloTabla.addRow(filas);
                
                
                System.out.println(filas);
                
            }
                    
                    
                    
                    
                    
                    
                    }
        
        
        catch(SQLException ex){
            
            System.err.println(ex.toString());
            
        }
    
    
       
    
        
    
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaHistorial = new javax.swing.JTable();
        SalirHistorial = new javax.swing.JButton();
        GraficasHistorial = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Historial de Ventas por producto");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Coca Cola"},
                {"Agua Cielo"},
                {"Powerade"},
                {"Del Valle"},
                {"Fuze Té"},
                {"Sprite"},
                {"Fanta"},
                {"Adés"},
                {"Quatro"},
                {"Coca Cola Zero"}
            },
            new String [] {
                "Productos"
            }
        ));
        jScrollPane2.setViewportView(TablaProductos);

        TablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaHistorial);

        SalirHistorial.setText("Salir");
        SalirHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirHistorialActionPerformed(evt);
            }
        });

        GraficasHistorial.setText("Graficas");
        GraficasHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficasHistorialActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(SalirHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GraficasHistorial)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalirHistorial)
                    .addComponent(GraficasHistorial))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SalirHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirHistorialActionPerformed
    Window w = SwingUtilities.getWindowAncestor(Historial.this);
       w.setVisible(false);
    }//GEN-LAST:event_SalirHistorialActionPerformed

    private void GraficasHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficasHistorialActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int select = TablaProductos.getSelectedRow();
        int columna = TablaHistorial.getColumnCount();
        int i;
        int vc;

        for (vc = 0; vc < columna; vc++) {
            String valor = TablaHistorial.getValueAt(select, vc).toString();

            dataset.addValue(Integer.parseInt(valor), TablaProductos.getValueAt(select, 0).toString(), TablaHistorial.getColumnName(vc));
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Grafico de demanda para producto " + TablaProductos.getValueAt(select, 0).toString(),
                "Producto",
                "Demanda",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                true
        );
        JFrame frame = new JFrame("Grafica Demanda");
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(getRootPane());
        ChartPanel chartPanel = new ChartPanel(chart, false);
        frame.setContentPane(chartPanel);
        frame.setVisible(true);
    }//GEN-LAST:event_GraficasHistorialActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GraficasHistorial;
    private javax.swing.JButton SalirHistorial;
    private javax.swing.JTable TablaHistorial;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
