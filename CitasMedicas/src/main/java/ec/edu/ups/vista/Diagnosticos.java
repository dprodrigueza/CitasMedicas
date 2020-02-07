/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDiagnostico;
import ec.edu.ups.controlador.ControladorMedico;
import ec.edu.ups.controlador.ControladorPaciente;
import ec.edu.ups.modelo.Diagnostico;
import ec.edu.ups.modelo.Medico;
import ec.edu.ups.modelo.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author VIVIANA
 */
public class Diagnosticos extends javax.swing.JInternalFrame {
   ControladorDiagnostico dBD = new ControladorDiagnostico();
    /**
     * Creates new form Diagnostico
     */
    
    private ControladorDiagnostico controladorDiagnostico;
    public Diagnosticos() {
        initComponents();
        controladorDiagnostico = new ControladorDiagnostico();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
   
    
    //Metodo guardar
    public void guardarC() {

        Diagnostico d = new Diagnostico();
        ControladorDiagnostico dBD = new ControladorDiagnostico();

        d.setCodigoDiagnostico(Integer.parseInt(idiag.getText()));
        d.setEnfermedadActual(enfactu.getText());
        d.setBoca(boca.getText());
        d.setTorax(torax.getText());
        d.setAbdomen(abd.getText());
        d.setExtremidades(extr.getText());
        d.setRegionPerineal(regperi.getText());
        d.setValoracionNeurologica(neuro.getText());
        d.setIce10(String.valueOf(cboCie.getSelectedItem()));
        d.setTratamientos(tratamien.getText());
        d.setCITAMEDICA_cita_id(Integer.parseInt(cita_id.getText()));
        d.setCITAMEDICA_PACIENTE_pa_cedula(cedula.getText());
        d.setHISTORIALCLINICO_hist_id(Integer.parseInt(historial_id.getText()));
        

        dBD.crear(d);
        ;

    }
    
    
    
    
    public void codigo(int numeroOrig) {
        String res = "";
        if (numeroOrig >= 10) {
            res = "" + numeroOrig;
           idiag.setText(res);
        }
        if (numeroOrig >= 10000000) {
            res = "0" + numeroOrig;
            idiag.setText(res);
        }
        if (numeroOrig >= 1000000) {
            res = "00" + numeroOrig;
            idiag.setText(res);
        }
        if (numeroOrig >= 100000) {
            res = "000" + numeroOrig;
            idiag.setText(res);
        }
        if (numeroOrig >= 10000) {
            res = "000" + numeroOrig;
            idiag.setText(res);
        }
       
//       
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idiag = new javax.swing.JTextField();
        enfactu = new javax.swing.JTextField();
        boca = new javax.swing.JTextField();
        torax = new javax.swing.JTextField();
        abd = new javax.swing.JTextField();
        extr = new javax.swing.JTextField();
        regperi = new javax.swing.JTextField();
        neuro = new javax.swing.JTextField();
        tratamien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cboCie = new javax.swing.JComboBox<>();
        cita_id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        historial_id = new javax.swing.JTextField();

        jLabel1.setText("DIAGNOSTICO");

        jLabel2.setText("ID");

        jLabel3.setText("Enfermedad Actual");

        jLabel4.setText("Boca");

        jLabel5.setText("Torax");

        jLabel6.setText("Abdomen");

        jLabel7.setText("Extremidades");

        jLabel8.setText("Region Perineal");

        jLabel9.setText("Valoraion Neuronal");

        idiag.setEditable(false);

        jLabel10.setText("CIE10");

        jLabel11.setText("Tratamiento");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cboCie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G89 Dolor, no clasificado bajo otro concepto", "J11 Gripe debida a virus de la gripe no identificado", "J11.0 Gripe debida a virus de la gripe no identificado con neumon�a", "J11.00 Gripe debida a virus de la gripe no identificado con tipo de neumon�a no especificado", "J11.1 Gripe debida a virus de la gripe no identificado con otro tipo de manifestaciones respiratorias", "J11.2 Gripe debida a virus de la gripe no identificado con manifestaciones gastrointestinales", "K37 Apendicitis (neumoc�cica) (retrocecal) ", "K36 Apendicitis cr�nica (recurrente) ", "K36 Apendicitis curada (obliterativa) ", "K36 obstructiva ", "obstructiva ", " " }));

        cita_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cita_idActionPerformed(evt);
            }
        });

        jLabel12.setText("Cita Id");

        jLabel13.setText("Cedula Paciente:");

        jLabel14.setText("Historial Clinico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(extr, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abd, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(boca)
                                .addComponent(enfactu)
                                .addComponent(torax, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(neuro, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel9))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(regperi, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8)))
                                            .addComponent(tratamien, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addContainerGap(243, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(cboCie, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(idiag, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(cita_id, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(historial_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jButton1)))
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idiag, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cita_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historial_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regperi, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(enfactu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(boca, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(torax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(abd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(extr, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(neuro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28)
                        .addComponent(cboCie, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(tratamien)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       
 
        guardarC();
codigo(dBD.obtenerCodigo());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cita_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cita_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cita_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abd;
    private javax.swing.JTextField boca;
    private javax.swing.JComboBox<String> cboCie;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField cita_id;
    private javax.swing.JTextField enfactu;
    private javax.swing.JTextField extr;
    private javax.swing.JTextField historial_id;
    private javax.swing.JTextField idiag;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField neuro;
    private javax.swing.JTextField regperi;
    private javax.swing.JTextField torax;
    private javax.swing.JTextField tratamien;
    // End of variables declaration//GEN-END:variables
}
