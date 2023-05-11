/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Clases.Raiz;
import javax.swing.table.DefaultTableModel;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

/**
 *
 * @author rexgr
 */
public class MetRaizM extends javax.swing.JInternalFrame {

    
    Raiz MRaiz=new Raiz();
    DefaultTableModel mod = new DefaultTableModel();
    DJep Djep = new DJep();
    JEP jep = new JEP();
    /**
     * Creates new form MetRaizM
     */
    public MetRaizM() {
        initComponents();
    }

    //variables utilizadas
    private double r = 0.0;
    int i = 1;
    double Xi;
    double XiR;
    double funXi;
    double funDer;
    double funDer2;
    double Tol;
    
    
    //Calculamo al derivada
    public void Derivada() {
        Node NodoFun;
        Node NodoDer;
        Node NodDif;
        Djep = new DJep();

        try {
            Djep.addStandardFunctions();
            Djep.addStandardConstants();
            Djep.addComplex();
            Djep.setAllowUndeclared(true);
            Djep.setAllowAssignment(true);
            Djep.setImplicitMul(true);
            Djep.addStandardDiffRules();

            //Usa de la funcion derivada
            NodoFun = Djep.parse(MRaiz.getFun());
            NodDif = Djep.differentiate(NodoFun, "x");
            NodoDer = Djep.simplify(NodDif);

            MRaiz.setFunDer(Djep.toString(NodoDer));

        } catch (ParseException e) {
            System.out.println("Error: " + e.getErrorInfo()+"!");
        }
        }
        //Segunda derivada
    public void Derivada2() {
        Node NodoFun;
        Node NodoDer;
        Node NodDif;
        Djep = new DJep();

        try {
            Djep.addStandardFunctions();
            Djep.addStandardConstants();
            Djep.addComplex();
            Djep.setAllowUndeclared(true);
            Djep.setAllowAssignment(true);
            Djep.setImplicitMul(true);
            Djep.addStandardDiffRules();

            //Usa de la funcion derivada
            NodoFun = Djep.parse(MRaiz.getFun());
            NodDif = Djep.differentiate(NodoFun, "x");
            NodoDer = Djep.simplify(NodDif);

            MRaiz.setFunDer2(Djep.toString(NodoDer));

        } catch (ParseException e) {
            System.out.println("Error: " + e.getErrorInfo()+"!");
        }
    }
    
    //Evaluamo
    public double f(double x) {
        jep = new JEP();
        jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.addVariable("x", x);
        jep.parseExpression(MRaiz.getFun());
        r = jep.getValue();

        return r;
    }
    
    //evaluamos la funcion de la primer derivada
    public double FuncionDer(double x) {
        jep = new JEP();
        jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.addVariable("x", x);
        jep.parseExpression(MRaiz.getFunDer());
        r = jep.getValue();

        return r;
    }
    
    //evaluamos la funcion de la segunda derivada
    public double FuncionDer2(double x) {
        jep = new JEP();
        jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.addVariable("x", x);
        jep.parseExpression(MRaiz.getFunDer2());
        r = jep.getValue();

        return r;
    }
    //Método de Newton Mejorado
    public void Met() {
        do {

            Xi = MRaiz.getXi();

            funXi = f(Xi);
            funDer = FuncionDer(Xi);
            funDer2 = FuncionDer2(Xi);

            XiR = Xi - ((funXi * funDer) / ((Math.pow(funDer, 2)) - (funXi * funDer2)));

            if (i == 1) {

            } else {
                Tol = (Math.abs(Xi - XiR));
            }

            mod = (DefaultTableModel) jTable.getModel();
            Object[] ob = new Object[7];
            ob[0] = i;
            ob[1] = String.format("%.4f", Xi);
            ob[2] = String.format("%.4f", funXi);
            ob[3] = String.format("%.4f", funDer);
            ob[4] = String.format("%.4f", funDer2);
            ob[5] = String.format("%.4f", XiR);
            ob[6] = String.format("%.4f", Tol);
            mod.addRow(ob);
            jTable.setModel(mod);

            MRaiz.setXi(XiR);
            i++;

        } while (Math.abs(Xi - XiR) >= MRaiz.getTol());
    }
    
    //tomar datos
    public void SendData() {
        String funcion = txtFuncion.getText();
        double xi = Double.parseDouble(txtXi.getText());
        double t = Double.parseDouble(txtTol.getText());

        MRaiz.setFun(funcion);
        MRaiz.setXi(xi);
        MRaiz.setTol(t);
    }
    //respuesta
    public void Respuesta(){
        txtRespuesta.setText(String.format("%.4f", Xi));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTol = new javax.swing.JTextField();
        txtXi = new javax.swing.JTextField();
        txtFuncion = new javax.swing.JTextField();
        txtRespuesta = new javax.swing.JTextField();
        btEvaluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Raices Múltiples");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Respuesta");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Ingresar función:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Asignar Xi");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Asignar Tolerancia");

        txtTol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTolActionPerformed(evt);
            }
        });

        txtXi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXiActionPerformed(evt);
            }
        });

        txtFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionActionPerformed(evt);
            }
        });

        txtRespuesta.setEditable(false);
        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });

        btEvaluar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEvaluar.setText("Evaluar");
        btEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEvaluarActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i", "Xi", "f(Xi)", "f'(Xi)", "f''(Xi)", "xi+1", "Tol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTol, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btEvaluar)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(txtXi))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtXi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEvaluar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTolActionPerformed

    private void txtXiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXiActionPerformed

    private void txtFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuncionActionPerformed

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void btEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEvaluarActionPerformed
        // TODO add your handling code here:
        SendData();
        Derivada();
        Derivada2();
        Met();
        Respuesta(); 
    }//GEN-LAST:event_btEvaluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEvaluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtTol;
    private javax.swing.JTextField txtXi;
    // End of variables declaration//GEN-END:variables
}
