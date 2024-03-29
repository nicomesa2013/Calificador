/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ProfesorControlador;
import java.awt.CardLayout;

/**
 *
 * @author Daniela Chaux
 */
public class PnlCrear_prueba extends javax.swing.JPanel {
    private JframePrincipal Frm;
    /**
     * Creates new form PnlCrearprueba
     */
    public PnlCrear_prueba() {
        initComponents();
        pnlTipo_de_pregunta1.setPnl(this);
        pnlPregunta_cerrada1.setPnl(this);
        pnlPregunta_abierta1.setPnl(this);
    }

    public JframePrincipal getFrm() {
        return Frm;
    }

    public void setFrm(JframePrincipal Frm) {
        this.Frm = Frm;
    }
    
    public void cambiar_tarjeta(String tarjeta) {
        if(tarjeta.equals("Abierta")){
            pnlPregunta_abierta1.limpiarCampos();
        }
        else if(tarjeta.equals("Cerrada"))
            pnlPregunta_cerrada1.limpiarCampos();
        ((CardLayout) pnlPreguntas.getLayout()).show(pnlPreguntas, tarjeta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        BtnFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlPreguntas = new javax.swing.JPanel();
        pnlTipo_de_pregunta1 = new vista.PnlTipo_de_pregunta();
        pnlPregunta_abierta1 = new vista.PnlPregunta_abierta();
        pnlPregunta_cerrada1 = new vista.PnlPregunta_cerrada();

        jScrollPane1.setViewportView(txtDescripcion);

        BtnFinalizar.setText("Finalizar");
        BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Descripcion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnFinalizar)
                .addContainerGap())
        );

        pnlPreguntas.setLayout(new java.awt.CardLayout());
        pnlPreguntas.add(pnlTipo_de_pregunta1, "Pregunta_principal");
        pnlPreguntas.add(pnlPregunta_abierta1, "Abierta");
        pnlPreguntas.add(pnlPregunta_cerrada1, "Cerrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarActionPerformed
        // TODO add your handling code here:
        String Descripcion;
        Descripcion = txtDescripcion.getText();
        Frm.cambiar_tarjeta("principal");
        ProfesorControlador.getInstance().agregarDescripcion(Descripcion);
        ProfesorControlador.getInstance().guardarPruebaArchivo();
    }//GEN-LAST:event_BtnFinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private vista.PnlPregunta_abierta pnlPregunta_abierta1;
    private vista.PnlPregunta_cerrada pnlPregunta_cerrada1;
    private javax.swing.JPanel pnlPreguntas;
    private vista.PnlTipo_de_pregunta pnlTipo_de_pregunta1;
    private javax.swing.JTextPane txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
