/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.itecbrazil.serviceftpcliente.view;

import br.itecbrazil.serviceftpcliente.controller.ControllerPanelConfigLocalDiretorios;
import javax.swing.JTextField;

/**
 *
 * @author itec-desenv-willian
 */
public class PanelConfigLocalDiretorios extends javax.swing.JPanel {

    public ControllerPanelConfigLocalDiretorios controller;

    /**
     * Creates new form PanelConfigLocalDiretorios
     */
    public PanelConfigLocalDiretorios() {
        initComponents();
        controller = new ControllerPanelConfigLocalDiretorios(this);
    }

    public ControllerPanelConfigLocalDiretorios getController() {
        return controller;
    }

    public JTextField getjTextFieldDirEnvio() {
        return jTextFieldDirEnvio;
    }

    public JTextField getjTextFieldDirRetorno() {
        return jTextFieldDirRetorno;
    }

    public void preencherPathDiretorios() {
        getController().preencherPathDiretorios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelDirEnvio = new javax.swing.JLabel();
        jLabelDirRetorno = new javax.swing.JLabel();
        jTextFieldDirEnvio = new javax.swing.JTextField();
        jTextFieldDirRetorno = new javax.swing.JTextField();
        jButtonEditDirRetorno = new javax.swing.JButton();
        jButtonEditDirEnvio = new javax.swing.JButton();

        setBackground(new java.awt.Color(159, 195, 251));
        setMaximumSize(new java.awt.Dimension(680, 100));
        setMinimumSize(new java.awt.Dimension(680, 100));
        setPreferredSize(new java.awt.Dimension(680, 100));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Configuração local de diretórios");
        jLabelTitulo.setName("jLabelTitulo"); // NOI18N

        jLabelDirEnvio.setText("Diretório de envio:");

        jLabelDirRetorno.setText("Diretório de retorno:");

        jTextFieldDirEnvio.setEditable(false);
        jTextFieldDirEnvio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDirEnvio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        jTextFieldDirEnvio.setMaximumSize(new java.awt.Dimension(4, 18));
        jTextFieldDirEnvio.setName("jTextFieldDirEnvio"); // NOI18N

        jTextFieldDirRetorno.setEditable(false);
        jTextFieldDirRetorno.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDirRetorno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        jTextFieldDirRetorno.setMaximumSize(new java.awt.Dimension(2, 16));
        jTextFieldDirRetorno.setName("jTextFieldDirRetorno"); // NOI18N

        jButtonEditDirRetorno.setText("Editar Diretório");
        jButtonEditDirRetorno.setToolTipText("Editar diretório de retorno");
        jButtonEditDirRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDirRetornoActionPerformed(evt);
            }
        });

        jButtonEditDirEnvio.setText("Editar Diretório");
        jButtonEditDirEnvio.setToolTipText("Editar diretório de envio");
        jButtonEditDirEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEditDirEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDirEnvioActionPerformed(evt);
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
                        .addComponent(jLabelTitulo)
                        .addContainerGap(419, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDirEnvio)
                            .addComponent(jLabelDirRetorno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDirRetorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldDirEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEditDirEnvio)
                            .addComponent(jButtonEditDirRetorno))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDirEnvio)
                    .addComponent(jTextFieldDirEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditDirEnvio))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDirRetorno)
                    .addComponent(jTextFieldDirRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditDirRetorno))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditDirEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDirEnvioActionPerformed
        getController().alterarPathDiretorios(getjTextFieldDirEnvio());
    }//GEN-LAST:event_jButtonEditDirEnvioActionPerformed

    private void jButtonEditDirRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDirRetornoActionPerformed
        getController().alterarPathDiretorios(getjTextFieldDirRetorno());
    }//GEN-LAST:event_jButtonEditDirRetornoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditDirEnvio;
    private javax.swing.JButton jButtonEditDirRetorno;
    private javax.swing.JLabel jLabelDirEnvio;
    private javax.swing.JLabel jLabelDirRetorno;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldDirEnvio;
    private javax.swing.JTextField jTextFieldDirRetorno;
    // End of variables declaration//GEN-END:variables
}
