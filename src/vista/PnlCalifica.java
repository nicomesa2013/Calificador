/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ProfesorControlador;
import Modelo.PreguntaAbiertaEstudiante;
import Modelo.PreguntaCerrada;
import Modelo.PreguntaCerradaEstudiante;
import Modelo.Prueba;
import Modelo.PruebaEstudiante;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela Chaux
 */
public class PnlCalifica extends javax.swing.JPanel {

    /**
     * Creates new form PnlCalifica
     */
    public PnlCalifica() {
        initComponents();
        iniciarFormulario();
    }
    
    private Prueba prueba;
    private PruebaEstudiante pruebaEstudiante;
    private int indice;
    private int nroPA;
    private int buenasPA;
    private int buenasPC;
    private int porcentaje;
    
    public void iniciarFormulario(){
        indice = 0;
        nroPA = 0;
        buenasPA = 0;
        buenasPC = 0;
        porcentaje = 0;
        pruebaEstudiante = ProfesorControlador.getInstance().getPruebaEstudiante();
        prueba = ProfesorControlador.getInstance().getPrueba();
        BtnSiguiente.setEnabled(false);
        BtnFinalizar.setEnabled(false);
        for(int i = 0; i < prueba.getPreguntas().size();i++){
            if(!(prueba.getPreguntas().get(i) instanceof PreguntaCerrada))
                nroPA++;
        }
        
    }
    public void ponerTexto(){
        int numero = prueba.getPreguntas().get(indice).getNumero();
        String enunciado = prueba.getPreguntas().get(indice).getEnunciado();
        String solucion = ((PreguntaAbiertaEstudiante)pruebaEstudiante.getPreguntas().get(indice)).getSolucion();
        txtNumero.setText(Integer.toString(numero));
        txtEnunciado.setText(enunciado);
        txtSolucion.setText(solucion);
        
    }
    
    public boolean calificarPCerrada(boolean[] respuestas,boolean[] solucion){
        return Arrays.equals(solucion, respuestas);
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCerradas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAbiertas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JLabel();
        txtEnunciado = new javax.swing.JLabel();
        txtSolucion = new javax.swing.JLabel();
        BtnSiguiente = new javax.swing.JButton();
        BtnFinalizar = new javax.swing.JButton();
        RBtnBien = new javax.swing.JRadioButton();
        RBtnMal = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        BtnCalificar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Preguntas Cerradas:");

        txtCerradas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCerradas.setText("N.A");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Preguntas Abiertas:");

        txtAbiertas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAbiertas.setText("N.A");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        BtnFinalizar.setText("Finalizar");
        BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarActionPerformed(evt);
            }
        });

        RBtnBien.setText("Bien");
        RBtnBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnBienActionPerformed(evt);
            }
        });

        RBtnMal.setText("Mal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RBtnMal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBtnBien))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSiguiente)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(BtnSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnFinalizar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RBtnBien)
                        .addComponent(RBtnMal)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCerradas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAbiertas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCerradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAbiertas, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CALIFICAR PRUEBA");

        BtnCalificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnCalificar.setText("Calificar");
        BtnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(BtnCalificar)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCalificar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalificarActionPerformed
        // TODO add your handling code here:
        BtnCalificar.setEnabled(false);
        BtnFinalizar.setEnabled(true);
        BtnSiguiente.setEnabled(true);
        RBtnBien.setEnabled(false);
        RBtnMal.setEnabled(false);
        while(indice < prueba.getPreguntas().size()){
            if(pruebaEstudiante.getPreguntas().get(indice) instanceof PreguntaCerradaEstudiante){
                RBtnBien.setEnabled(false);
                RBtnMal.setEnabled(false);
                if(calificarPCerrada(((PreguntaCerrada)(prueba.getPreguntas().get(indice))).getSolucion(), ((PreguntaCerradaEstudiante)(pruebaEstudiante.getPreguntas().get(indice))).getSolucion())){
                    porcentaje += prueba.getPreguntas().get(indice).getPorcentaje();
                    buenasPC++;
                }
                indice++;
                break;
            }
            if(pruebaEstudiante.getPreguntas().get(indice) instanceof PreguntaAbiertaEstudiante){
                ponerTexto();
                RBtnBien.setEnabled(true);
                RBtnMal.setEnabled(true);
                break;
            }
            
        }
        
    }//GEN-LAST:event_BtnCalificarActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        // TODO add your handling code here:
        RBtnBien.setEnabled(true);
        RBtnMal.setEnabled(true);
        boolean[] respuesta = new boolean[4];
        boolean[] solucion = new boolean[4];
        //System.out.println("NroPA:" + nroPA);
        //System.out.println("Inidce:" + indice);
        //System.out.println("Tamaño:" + prueba.getPreguntas().size());
        if(pruebaEstudiante.getPreguntas().get(indice) instanceof PreguntaAbiertaEstudiante){
                if(RBtnBien.isSelected()){
                   porcentaje += prueba.getPreguntas().get(indice).getPorcentaje();
                   buenasPA++;
                }
                ponerTexto();
                RBtnBien.setSelected(false);
                RBtnMal.setSelected(false);
                indice++;
                
        }
        if(indice + 1 < prueba.getPreguntas().size()){
            while(prueba.getPreguntas().get(indice) instanceof PreguntaCerrada){
                RBtnBien.setEnabled(false);
                RBtnMal.setEnabled(false);
                solucion = ((PreguntaCerrada)(prueba.getPreguntas().get(indice))).getSolucion();
                respuesta =((PreguntaCerradaEstudiante)(pruebaEstudiante.getPreguntas().get(indice))).getSolucion();
                if(calificarPCerrada(respuesta, solucion)){
                    porcentaje += prueba.getPreguntas().get(indice).getPorcentaje();
                    buenasPC++;
                }
                indice++;
                if(indice < prueba.getPreguntas().size())
                    break;
            }
            if(indice + 1 < prueba.getPreguntas().size()){
                if(pruebaEstudiante.getPreguntas().get(indice) instanceof PreguntaAbiertaEstudiante){
                    ponerTexto();
                    RBtnBien.setEnabled(true);
                    RBtnMal.setEnabled(true);
                    if(RBtnBien.isSelected()){
                       porcentaje += prueba.getPreguntas().get(indice).getPorcentaje();
                       buenasPA++;
                    }
                    RBtnBien.setSelected(false);
                    RBtnMal.setSelected(false);
                    indice++;
                }
            }
                
            
        }
        /*if(indice + 1 < prueba.getPreguntas().size()){
            indice++;

            while(prueba.getPreguntas().get(indice) instanceof PreguntaCerrada || nroPA > 0 && (indice + 1 < prueba.getPreguntas().size())){
                indice++;
                System.out.println("NroPA:" + nroPA);
                System.out.println("Inidce:" + indice);
                System.out.println("Tamaño:" + prueba.getPreguntas().size());
            }
            nroPA--;
            ponerTexto();
        }*/
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void RBtnBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnBienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBtnBienActionPerformed

    private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarActionPerformed
        // TODO add your handling code here:
        txtAbiertas.setText(Integer.toString(buenasPA));
        txtCerradas.setText(Integer.toString(buenasPC));
        JOptionPane.showMessageDialog(null, porcentaje+ "%");
    }//GEN-LAST:event_BtnFinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalificar;
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JRadioButton RBtnBien;
    private javax.swing.JRadioButton RBtnMal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtAbiertas;
    private javax.swing.JLabel txtCerradas;
    private javax.swing.JLabel txtEnunciado;
    private javax.swing.JLabel txtNumero;
    private javax.swing.JLabel txtSolucion;
    // End of variables declaration//GEN-END:variables
}
