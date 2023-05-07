/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;


import Clases.Secante;
import javax.swing.table.DefaultTableModel;
import org.nfunk.jep.JEP;
/**
 *
 * @author rexgr
 */
public class MetSecante extends javax.swing.JInternalFrame {
   //Instancia...
    JEP jep = new JEP();
    Secante ms = new Secante();
    Secante s = new Secante();
    DefaultTableModel mod = new DefaultTableModel();
    /**
     * Creates new form MetSecante
     */
    public MetSecante() {
        initComponents();
    }
    //Vars
    private double r = 0.0;
    int i = 1;
    double Xo;
    double Xi;
    double fXo;
    double fXi;
    double XR;
    double Tol;
    
     public double f(double x) {
        jep = new JEP();
        jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.addVariable("x", x);
        jep.parseExpression(ms.getFun());
        r = jep.getValue();

        return r;
    }
    
     public void data() {
        Xi = ms.getXi();
        Xo = ms.getXo();

        fXi = f(Xi);
        fXo = f(Xo);

        XR = Xi - ((fXi) * (Xo - Xi) / (fXo - fXi));

        mod = (DefaultTableModel) jtTabla.getModel();
        Object[] ob = new Object[6];
        ob[0] = i;
        ob[1] = Xo;
        ob[2] = Xi;
        ob[3] = fXi;
        ob[4] = fXo;
        ob[5] = XR;
        mod.addRow(ob);
        jtTabla.setModel(mod);
    }
    
     //Método de la Secante
    public void MetSec() {
        do {

            Xi = ms.getXi();
            Xo = ms.getXo();

            fXi = f(Xi);
            fXo = f(Xo);

            XR = Xi - ((fXi) * (Xo - Xi) / (fXo - fXi));

            if (i> 1) Tol = (Math.abs(Xi - XR));
                

            mod = (DefaultTableModel) jtTabla.getModel();
            Object[] ob = new Object[7];
            ob[0] = i;
            ob[1] = String.format("%.4f", Xo);
            ob[2] = String.format("%.4f", Xi);
            ob[3] = String.format("%.4f", fXo);
            ob[4] = String.format("%.4f", fXi);
            ob[5] = String.format("%.4f", XR);
            ob[6] = String.format("%.4f", Tol);
            mod.addRow(ob);
            jtTabla.setModel(mod);

            ms.setXo(Xi);
            Xo = ms.getXo();

            ms.setXi(XR);
            Xi = ms.getXi();

            i++;
        } while (Math.abs(Xo-Xi) >= ms.getTol());
    }
    
    public void Respuesta(){
        txtRespuesta.setText(String.format("%.4f", XR));
    }
    
    public void sendData() {
        String Fun = txtFuncion.getText();
        double XI = Double.parseDouble(txtXi.getText());
        double XO = Double.parseDouble(txtXo.getText());
        double T = Double.parseDouble(txtTol.getText());
        
        ms.setFun(Fun);
        ms.setXi(XI);
        ms.setXo(XO);
        ms.setTol(T);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtXi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtXo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTol = new javax.swing.JTextField();
        jbtnEv = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Secante");
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel1.setText("Ingresar la funcion");

        txtFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionActionPerformed(evt);
            }
        });

        jLabel2.setText("Asignar xi");

        txtXi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXiActionPerformed(evt);
            }
        });

        jLabel3.setText("Asignar xo");

        txtXo.setPreferredSize(new java.awt.Dimension(100, 35));
        txtXo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXoActionPerformed(evt);
            }
        });

        jLabel4.setText("Asignar Tolerancia");

        jbtnEv.setText("Evaluar Funcion");
        jbtnEv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEvActionPerformed(evt);
            }
        });

        jLabel5.setText("Respuesta");

        txtRespuesta.setEditable(false);

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i", "Xo", "Xi", "f(xo)", "f(xi)", "xi+1", "Tolerancia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtXi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jbtnEv)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addGap(42, 42, 42)
                                .addComponent(txtRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addGap(131, 131, 131)))
                        .addComponent(txtXo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtXi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtXo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEv)
                    .addComponent(jLabel5)
                    .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        setBounds(0, 0, 1189, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuncionActionPerformed

    private void txtXiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXiActionPerformed

    private void txtXoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXoActionPerformed

    private void jbtnEvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEvActionPerformed
        // TODO add your handling code here:
        sendData();
        MetSec();
        Respuesta();
        
    }//GEN-LAST:event_jbtnEvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEv;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtTol;
    private javax.swing.JTextField txtXi;
    private javax.swing.JTextField txtXo;
    // End of variables declaration//GEN-END:variables
}
