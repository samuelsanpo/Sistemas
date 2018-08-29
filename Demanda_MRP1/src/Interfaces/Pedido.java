
package Interfaces;

import java.awt.Color;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Danielpulido10
 */
public class Pedido extends javax.swing.JPanel {

    /**
     * Creates new form Pedido
     */
    public Pedido() {
        initComponents();
        
      RealizarPedido.setBackground(new java.awt.Color(240,0,0));
      RealizarPedido.setForeground(Color.black);
      SalirPedido.setBackground(new java.awt.Color(0,0,0));
      SalirPedido.setForeground(Color.white);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PedidoArea = new javax.swing.JTextArea();
        SalirPedido = new javax.swing.JButton();
        RealizarPedido = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Pedido a Proveedores");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N

        PedidoArea.setColumns(20);
        PedidoArea.setRows(5);
        jScrollPane1.setViewportView(PedidoArea);

        SalirPedido.setText("Salir");
        SalirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirPedidoActionPerformed(evt);
            }
        });

        RealizarPedido.setText("Realizar Pedido");
        RealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarPedidoActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(SalirPedido)
                                .addGap(62, 62, 62)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addComponent(RealizarPedido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalirPedido)
                    .addComponent(RealizarPedido)
                    .addComponent(jButton1))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SalirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirPedidoActionPerformed
        Window w = SwingUtilities.getWindowAncestor(Pedido.this);
       w.setVisible(false);
       
       
       
       
       
       
    }//GEN-LAST:event_SalirPedidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    PedidoArea.setText("Pedido Para Proveedores \n\n Pedido para la realizacion de producto Coca Cola\n "
                + "345000 libras de azucar\n345600 litros de agua carbonatada\n435600 unidades de caramelo\n "
                + "3245 acido fosforico\n 25000 aroma con cafeina\n\n Pedido para la realizacion de producto "
                + "Powerade\n220000 libras de azucar\n54600 acido citrico\n 2300 eletrolitos\n32400 saborizantes\n "
                + "2300 Vitaminas\n\n Pedido para la realizacion de producto Del Valle\n230000 libras de azucar\n "
                + "21400 litros concentrado Del Valle\n321 litros de jugo de naranja");
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarPedidoActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Se ha generado el pedido");
    }//GEN-LAST:event_RealizarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea PedidoArea;
    private javax.swing.JButton RealizarPedido;
    private javax.swing.JButton SalirPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
