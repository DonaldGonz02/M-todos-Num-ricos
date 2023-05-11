/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Vistas.MetPuntoFijo;
import Vistas.MetRaizM;
import Vistas.MetNewton;
import Vistas.MetMuller;
import Vistas.MetEcuaciones;
import Vistas.MetReglaFalsa;
import Vistas.MetSecante;
import Vistas.MetBairstow;
import Vistas.MetBiseccion;
import Vistas.MetInterLagrange;
import Vistas.MetInterNewton;
import Vistas.MetEcua1;
import Vistas.MetEcua2;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author rexgr
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View [Controlador]
     */
    public View() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MetAbiertos = new javax.swing.JMenu();
        opNewton = new javax.swing.JMenuItem();
        opSecante = new javax.swing.JMenuItem();
        opRaices = new javax.swing.JMenuItem();
        opPunto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MetCerrados = new javax.swing.JMenu();
        opBiseccion = new javax.swing.JMenuItem();
        opRegla = new javax.swing.JMenuItem();
        Raices = new javax.swing.JMenu();
        opMuller = new javax.swing.JMenuItem();
        opBairstow = new javax.swing.JMenuItem();
        Ecuaciones = new javax.swing.JMenu();
        op1Ing = new javax.swing.JMenuItem();
        op2Ing = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        MetAbiertos.setText("Métodos Abiertos");

        opNewton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opNewton.setText("Newton");
        opNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNewtonActionPerformed(evt);
            }
        });
        MetAbiertos.add(opNewton);

        opSecante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opSecante.setText("Secante");
        opSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSecanteActionPerformed(evt);
            }
        });
        MetAbiertos.add(opSecante);

        opRaices.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opRaices.setText("Raíces Múltiples");
        opRaices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRaicesActionPerformed(evt);
            }
        });
        MetAbiertos.add(opRaices);

        opPunto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opPunto.setText("Punto Fijo");
        opPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPuntoActionPerformed(evt);
            }
        });
        MetAbiertos.add(opPunto);

        jMenu1.setText("Interpolación");

        jMenuItem1.setText("Newton");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Lagrange");
        jMenu1.add(jMenuItem2);

        MetAbiertos.add(jMenu1);

        jMenuBar1.add(MetAbiertos);

        MetCerrados.setText("Métodos Cerrados");

        opBiseccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opBiseccion.setText("Bisección");
        opBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBiseccionActionPerformed(evt);
            }
        });
        MetCerrados.add(opBiseccion);

        opRegla.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opRegla.setText("Regla Falsa");
        opRegla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReglaActionPerformed(evt);
            }
        });
        MetCerrados.add(opRegla);

        jMenuBar1.add(MetCerrados);

        Raices.setText("Raíces");

        opMuller.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opMuller.setText("Muller");
        opMuller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMullerActionPerformed(evt);
            }
        });
        Raices.add(opMuller);

        opBairstow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opBairstow.setText("Bairstow");
        opBairstow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBairstowActionPerformed(evt);
            }
        });
        Raices.add(opBairstow);

        jMenuBar1.add(Raices);

        Ecuaciones.setText("Ecuaciones");

        op1Ing.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        op1Ing.setText("1 Incógnita");
        op1Ing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1IngActionPerformed(evt);
            }
        });
        Ecuaciones.add(op1Ing);

        op2Ing.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        op2Ing.setText("Incógnitas");
        op2Ing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2IngActionPerformed(evt);
            }
        });
        Ecuaciones.add(op2Ing);

        jMenuBar1.add(Ecuaciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void opNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNewtonActionPerformed
        // TODO add your handling code here:
        MetNewton viewWindow= new MetNewton();
        CenterView(viewWindow);
    }//GEN-LAST:event_opNewtonActionPerformed

    private void opSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSecanteActionPerformed
        // TODO add your handling code here:
        MetSecante viewWindow = new MetSecante();
        CenterView(viewWindow);
    }//GEN-LAST:event_opSecanteActionPerformed

    private void opRaicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRaicesActionPerformed
        // TODO add your handling code here:
        MetRaizM viewWindow = new MetRaizM();
        CenterView(viewWindow);
    }//GEN-LAST:event_opRaicesActionPerformed

    private void opBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBiseccionActionPerformed
        // TODO add your handling code here:
        MetBiseccion viewWindow = new MetBiseccion();
        CenterView(viewWindow);

    }//GEN-LAST:event_opBiseccionActionPerformed

    private void opReglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReglaActionPerformed
        // TODO add your handling code here:
        MetReglaFalsa viewWindow = new MetReglaFalsa();
        CenterView(viewWindow);

    }//GEN-LAST:event_opReglaActionPerformed

    private void opMullerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMullerActionPerformed
        // TODO add your handling code here:
        MetMuller viewMuller = new MetMuller();
        //jDesktop.add(frame);
        //viewWindow.show();
        CenterView(viewMuller);

    }//GEN-LAST:event_opMullerActionPerformed

    private void opBairstowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBairstowActionPerformed
        // TODO add your handling code here:
        MetBairstow viewWindow = new MetBairstow();
        CenterView(viewWindow);

    }//GEN-LAST:event_opBairstowActionPerformed

    private void op1IngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1IngActionPerformed
        // TODO add your handling code here:
        MetEcua1 viewWindow = new MetEcua1();
        CenterView(viewWindow);
    }//GEN-LAST:event_op1IngActionPerformed

    private void op2IngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2IngActionPerformed
        // TODO add your handling code here:
        MetEcua2 viewWindow = new MetEcua2();
        CenterView(viewWindow);
    }//GEN-LAST:event_op2IngActionPerformed

    private void opPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPuntoActionPerformed
        // TODO add your handling code here:
        MetPuntoFijo viewWindow = new MetPuntoFijo();
        CenterView(viewWindow);
        //CenterView(viewWindow);
    }//GEN-LAST:event_opPuntoActionPerformed
    
    //Formato para las ventanas  
    public void CenterView(JInternalFrame frame){
        jDesktop.add(frame);
        Dimension dimension = jDesktop.getSize();
        Dimension dimensionF = frame.getSize();
        //frame.setLocation(null);
        //tamaño preferido 1200*600
        frame.setLocation((dimension.width - dimensionF.width)/2, (dimension.height - dimensionF.height)/2);
        frame.show();
     }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ecuaciones;
    private javax.swing.JMenu MetAbiertos;
    private javax.swing.JMenu MetCerrados;
    private javax.swing.JMenu Raices;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem op1Ing;
    private javax.swing.JMenuItem op2Ing;
    private javax.swing.JMenuItem opBairstow;
    private javax.swing.JMenuItem opBiseccion;
    private javax.swing.JMenuItem opMuller;
    private javax.swing.JMenuItem opNewton;
    private javax.swing.JMenuItem opPunto;
    private javax.swing.JMenuItem opRaices;
    private javax.swing.JMenuItem opRegla;
    private javax.swing.JMenuItem opSecante;
    // End of variables declaration//GEN-END:variables
}
