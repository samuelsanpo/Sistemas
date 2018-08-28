
package Interfaces;

import Conexion.Conex;
import java.awt.Color;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Danielpulido10
 */
public class Explosion extends javax.swing.JPanel {

    /**
     * Creates new form Explosion
     */
    public Explosion() {
        initComponents();
        
        
      GraficasExplosion.setBackground(new java.awt.Color(240,0,0));
      GraficasExplosion.setForeground(Color.black);
      SalirExplosion.setBackground(new java.awt.Color(0,0,0));
      SalirExplosion.setForeground(Color.white);
      
    try{
            
           
           DefaultTableModel modeloTabla = new DefaultTableModel()  ;
            TablaExplosion.setModel(modeloTabla);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaExplosion = new javax.swing.JTable();
        SalirExplosion = new javax.swing.JButton();
        GraficasExplosion = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Prediccion");

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
        jScrollPane4.setViewportView(TablaProductos);

        TablaExplosion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(23),  new Integer(34),  new Integer(43),  new Integer(3443)},
                { new Integer(323),  new Integer(4),  new Integer(34),  new Integer(43)},
                { new Integer(4),  new Integer(43),  new Integer(3),  new Integer(4)},
                { new Integer(43),  new Integer(34),  new Integer(4),  new Integer(34)}
            },
            new String [] {
                "Enero", "Febrero", "Marzo", "Abril"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaExplosion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaExplosionMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablaExplosion);

        SalirExplosion.setText("Salir");
        SalirExplosion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirExplosionActionPerformed(evt);
            }
        });

        GraficasExplosion.setText("Graficas");
        GraficasExplosion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficasExplosionActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GraficasExplosion)
                .addGap(70, 70, 70))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(SalirExplosion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GraficasExplosion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SalirExplosion)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SalirExplosionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirExplosionActionPerformed
        Window w = SwingUtilities.getWindowAncestor(Explosion.this);
       w.setVisible(false);
    }//GEN-LAST:event_SalirExplosionActionPerformed

    private void GraficasExplosionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficasExplosionActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int select = TablaProductos.getSelectedRow();
        int columna = TablaExplosion.getColumnCount();
        int i;
        int vc;

        for (vc = 0; vc < columna; vc++) {
            String valor = TablaExplosion.getValueAt(select, vc).toString();

            dataset.addValue(Integer.parseInt(valor), TablaProductos.getValueAt(select, 0).toString(), TablaExplosion.getColumnName(vc));
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
    }//GEN-LAST:event_GraficasExplosionActionPerformed

    private void TablaExplosionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaExplosionMouseClicked
        int fil = TablaExplosion.getSelectedRow();
      int col = TablaExplosion.getSelectedColumn();
      
      if(fil>0){
          int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null, "¿Quiere agregar un evento?","WARNING", dialogButton);
            if(dialogButton == JOptionPane.YES_OPTION) {
                Object [] Respuesta ={"Aumentar","Disminuir"}; 
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opcion", "Elegir",JOptionPane.QUESTION_MESSAGE,null,Respuesta, Respuesta[0]);
                if(opcion.toString().equals("Aumentar")){
                    String Causa = JOptionPane.showInputDialog(null,"Ingrese la causa del aumento");
                    String valor = JOptionPane.showInputDialog(null,"Ingrese el porcentaje del aumento");
                    int suma = Integer.parseInt(TablaExplosion.getValueAt(fil, col).toString())*Integer.parseInt(valor)/100 + Integer.parseInt(TablaExplosion.getValueAt(fil, col).toString());
                    TablaExplosion.setValueAt(String.valueOf(suma), fil, col);
                }else{
                    if(opcion.toString().equals("Disminuir")){
                    String Causa = JOptionPane.showInputDialog(null,"Ingrese la causa de la disminucion");
                    String valor = JOptionPane.showInputDialog(null,"Ingrese el porcentaje de la disminucion");
                    int resta =  Integer.parseInt(TablaExplosion.getValueAt(fil, col).toString()) - Integer.parseInt(TablaExplosion.getValueAt(fil, col).toString())*Integer.parseInt(valor)/100;
                    TablaExplosion.setValueAt(String.valueOf(resta), fil, col);
                }
                    
                }
               
            }else{
                JOptionPane.showMessageDialog(null, "Dijo no");
            }
      }
            
    }//GEN-LAST:event_TablaExplosionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GraficasExplosion;
    private javax.swing.JButton SalirExplosion;
    private javax.swing.JTable TablaExplosion;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
