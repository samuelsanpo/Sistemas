
package Interfaces;

import Conexion.Conex;
import java.awt.Color;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import static javafx.application.Platform.exit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Demanda extends javax.swing.JPanel {

   
    public Demanda() {
        initComponents();
      
      GraficasDemanda.setBackground(new java.awt.Color(240,0,0));
      GraficasDemanda.setForeground(Color.black);
      SalirDemanda.setBackground(new java.awt.Color(0,0,0));
      SalirDemanda.setForeground(Color.white);
      
      try{
            
           
           DefaultTableModel modeloTabla = new DefaultTableModel()  ;
            TablaDemanda.setModel(modeloTabla);
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

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaDemanda = new javax.swing.JTable();
        SalirDemanda = new javax.swing.JButton();
        GraficasDemanda = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Demanda de Productos");

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
        jScrollPane6.setViewportView(TablaProductos);

        TablaDemanda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(10),  new Integer(34),  new Integer(45),  new Integer(43)},
                { new Integer(25),  new Integer(43),  new Integer(5),  new Integer(45)},
                { new Integer(45),  new Integer(44),  new Integer(67),  new Integer(65)},
                { new Integer(65),  new Integer(56),  new Integer(88),  new Integer(67)}
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
        jScrollPane7.setViewportView(TablaDemanda);

        SalirDemanda.setText("Salir");
        SalirDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirDemandaActionPerformed(evt);
            }
        });

        GraficasDemanda.setText("Graficas");
        GraficasDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficasDemandaActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(SalirDemanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GraficasDemanda)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalirDemanda)
                    .addComponent(GraficasDemanda))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SalirDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirDemandaActionPerformed
        Window w = SwingUtilities.getWindowAncestor(Demanda.this);
       w.setVisible(false);
    }//GEN-LAST:event_SalirDemandaActionPerformed

    private void GraficasDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficasDemandaActionPerformed
DefaultCategoryDataset dataset = new DefaultCategoryDataset();
int select = TablaProductos.getSelectedRow();
int columna = TablaDemanda.getColumnCount();
int i;
int vc;

    for(vc=0; vc<columna;vc++){
        String valor = TablaDemanda.getValueAt(select, vc).toString();
        
            dataset.addValue(Integer.parseInt(valor), TablaProductos.getValueAt(select, 0).toString()  , TablaDemanda.getColumnName(vc));
    }
    
JFreeChart chart = ChartFactory.createBarChart(
  "Grafico de demanda para producto " + TablaProductos.getValueAt(select, 0).toString()  ,
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

    }//GEN-LAST:event_GraficasDemandaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GraficasDemanda;
    private javax.swing.JButton SalirDemanda;
    private javax.swing.JTable TablaDemanda;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
