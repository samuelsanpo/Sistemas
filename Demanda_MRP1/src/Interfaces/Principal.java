
package Interfaces;

import java.awt.Color;
import javax.swing.JDialog;

public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
        
      this.getContentPane().setBackground(Color.white);
     
      DemandaBoton.setBackground(new java.awt.Color(0,0,0));
      DemandaBoton.setForeground(Color.white);
      ExplosionBoton.setBackground(new java.awt.Color(0,0,0));
      ExplosionBoton.setForeground(Color.white);
      HistorialBoton.setBackground(new java.awt.Color(0,0,0));
      HistorialBoton.setForeground(Color.white);
      PedidosBoton.setBackground(new java.awt.Color(0,0,0));
      PedidosBoton.setForeground(Color.white);
      MPBoton.setBackground(new java.awt.Color(0,0,0));
      MPBoton.setForeground(Color.white);
      InventarioBoton.setBackground(new java.awt.Color(0,0,0));
      InventarioBoton.setForeground(Color.white);
      
     
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        HistorialBoton = new javax.swing.JButton();
        DemandaBoton = new javax.swing.JButton();
        PedidosBoton = new javax.swing.JButton();
        ExplosionBoton = new javax.swing.JButton();
        InventarioBoton = new javax.swing.JButton();
        MPBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.gray);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/coca-cola-41.gif"))); // NOI18N

        HistorialBoton.setText("Historial de Ventas");
        HistorialBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialBotonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistorialBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistorialBotonMouseEntered(evt);
            }
        });
        HistorialBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialBotonActionPerformed(evt);
            }
        });

        DemandaBoton.setText("Demanda ");
        DemandaBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DemandaBotonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DemandaBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DemandaBotonMouseEntered(evt);
            }
        });
        DemandaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemandaBotonActionPerformed(evt);
            }
        });

        PedidosBoton.setText("Pedidos materia prima");
        PedidosBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PedidosBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PedidosBotonMouseEntered(evt);
            }
        });
        PedidosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosBotonActionPerformed(evt);
            }
        });

        ExplosionBoton.setText("Explosión de Materiales");
        ExplosionBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExplosionBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExplosionBotonMouseEntered(evt);
            }
        });
        ExplosionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExplosionBotonActionPerformed(evt);
            }
        });

        InventarioBoton.setText("Inventario Producto");
        InventarioBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InventarioBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InventarioBotonMouseEntered(evt);
            }
        });
        InventarioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioBotonActionPerformed(evt);
            }
        });

        MPBoton.setText("Inventario Materia Prima");
        MPBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MPBotonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MPBotonMouseEntered(evt);
            }
        });
        MPBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ExplosionBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(PedidosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DemandaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HistorialBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InventarioBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MPBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HistorialBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(MPBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DemandaBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(InventarioBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExplosionBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PedidosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HistorialBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialBotonActionPerformed
  JDialog dialogo = new JDialog(this,"Historial");
    Historial panel = new Historial();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(780, 500);
    }//GEN-LAST:event_HistorialBotonActionPerformed

    private void DemandaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemandaBotonActionPerformed
   JDialog dialogo = new JDialog(this,"Demanda");
    Demanda panel = new Demanda();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(780, 500);

    }//GEN-LAST:event_DemandaBotonActionPerformed

    private void PedidosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Pedidos");
    Pedido panel = new Pedido();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(580, 430);
    }//GEN-LAST:event_PedidosBotonActionPerformed

    private void ExplosionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExplosionBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Explosion de Materiales");
    Explosion panel = new Explosion();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(780, 500);
    }//GEN-LAST:event_ExplosionBotonActionPerformed

    private void MPBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Inventario Materia Prima");
    MateriaPrima panel = new MateriaPrima();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(840, 500);   
    }//GEN-LAST:event_MPBotonActionPerformed

    private void HistorialBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialBotonMouseEntered
      HistorialBoton.setBackground(new java.awt.Color(244,0,0));
      HistorialBoton.setForeground(Color.black);
    }//GEN-LAST:event_HistorialBotonMouseEntered

    private void HistorialBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialBotonMouseExited
      HistorialBoton.setBackground(new java.awt.Color(0,0,0));
      HistorialBoton.setForeground(Color.white);
    }//GEN-LAST:event_HistorialBotonMouseExited

    private void DemandaBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DemandaBotonMouseEntered
       DemandaBoton.setBackground(new java.awt.Color(244,0,0));
       DemandaBoton.setForeground(Color.black);
    }//GEN-LAST:event_DemandaBotonMouseEntered

    private void DemandaBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DemandaBotonMouseExited
       DemandaBoton.setBackground(new java.awt.Color(0,0,0));
       DemandaBoton.setForeground(Color.white);
    }//GEN-LAST:event_DemandaBotonMouseExited

    private void ExplosionBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExplosionBotonMouseEntered
       ExplosionBoton.setBackground(new java.awt.Color(244,0,0));
       ExplosionBoton.setForeground(Color.black);
    }//GEN-LAST:event_ExplosionBotonMouseEntered

    private void ExplosionBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExplosionBotonMouseExited
       ExplosionBoton.setBackground(new java.awt.Color(0,0,0));
       ExplosionBoton.setForeground(Color.white);
    }//GEN-LAST:event_ExplosionBotonMouseExited

    private void MPBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPBotonMouseEntered
       MPBoton.setBackground(new java.awt.Color(244,0,0));
       MPBoton.setForeground(Color.black);
    }//GEN-LAST:event_MPBotonMouseEntered

    private void MPBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPBotonMouseExited
       MPBoton.setBackground(new java.awt.Color(0,0,0));
       MPBoton.setForeground(Color.white);
    }//GEN-LAST:event_MPBotonMouseExited

    private void InventarioBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioBotonMouseEntered
       InventarioBoton.setBackground(new java.awt.Color(244,0,0));
       InventarioBoton.setForeground(Color.black);
    }//GEN-LAST:event_InventarioBotonMouseEntered

    private void InventarioBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioBotonMouseExited
       InventarioBoton.setBackground(new java.awt.Color(0,0,0));
       InventarioBoton.setForeground(Color.white);
    }//GEN-LAST:event_InventarioBotonMouseExited

    private void PedidosBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedidosBotonMouseEntered
       PedidosBoton.setBackground(new java.awt.Color(244,0,0));
       PedidosBoton.setForeground(Color.black);
    }//GEN-LAST:event_PedidosBotonMouseEntered

    private void PedidosBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedidosBotonMouseExited
       PedidosBoton.setBackground(new java.awt.Color(0,0,0));
       PedidosBoton.setForeground(Color.white);
    }//GEN-LAST:event_PedidosBotonMouseExited

    private void HistorialBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialBotonMouseClicked
       
    }//GEN-LAST:event_HistorialBotonMouseClicked

    private void DemandaBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DemandaBotonMouseClicked
      
    }//GEN-LAST:event_DemandaBotonMouseClicked

    private void InventarioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioBotonActionPerformed
    JDialog dialogo = new JDialog(this,"Inventario Producto");
    Producto panel = new Producto();
    dialogo.add(panel);
    dialogo.setVisible(true);
    dialogo.setSize(800, 500);   
    
    }//GEN-LAST:event_InventarioBotonActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DemandaBoton;
    private javax.swing.JButton ExplosionBoton;
    private javax.swing.JButton HistorialBoton;
    private javax.swing.JButton InventarioBoton;
    private javax.swing.JButton MPBoton;
    private javax.swing.JButton PedidosBoton;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
