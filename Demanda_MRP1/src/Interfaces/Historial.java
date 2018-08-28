
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
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Historial extends javax.swing.JPanel {

   DefaultTableModel modeloTabla;
   
    public Historial() {
        initComponents();
        
      MostrarHistorial.setBackground(new java.awt.Color(240,0,0));
      MostrarHistorial.setForeground(Color.black);
      GraficasHistorial.setBackground(new java.awt.Color(240,0,0));
      GraficasHistorial.setForeground(Color.black);
      SalirHistorial.setBackground(new java.awt.Color(0,0,0));
      SalirHistorial.setForeground(Color.white);
      
      DefaultTableModel modeloTabla;
    //conexion con = new conexion();
    
    
        
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
           String sql = "select ";
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
        MostrarHistorial = new javax.swing.JButton();
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

        MostrarHistorial.setText("Mostrar Historial");

        GraficasHistorial.setText("Graficas");
        GraficasHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficasHistorialActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MostrarHistorial)
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(SalirHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GraficasHistorial)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostrarHistorial)
                    .addComponent(jLabel2))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GraficasHistorial;
    private javax.swing.JButton MostrarHistorial;
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
