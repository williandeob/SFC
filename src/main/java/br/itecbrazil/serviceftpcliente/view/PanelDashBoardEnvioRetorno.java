/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.itecbrazil.serviceftpcliente.view;

import br.itecbrazil.serviceftpcliente.controller.ControllerDashBoardEnvioRetorno;
import javax.swing.JTextPane;

/**
 *
 * @author itec-desenv-willian
 */
public class PanelDashBoardEnvioRetorno extends javax.swing.JPanel {

    /**
     * Controller estático da view,porém instânciado ao chamar o construtor de
     * PanelDashBoardEnvioRetorno, usado pelas Threads para alterar o panel.
     */
    private static ControllerDashBoardEnvioRetorno controller;

    /**
     * Creates new form PanelDashBoardEnvioRetorno
     */
    public PanelDashBoardEnvioRetorno() {
        initComponents();
        controller = new ControllerDashBoardEnvioRetorno(this);
    }

    public static ControllerDashBoardEnvioRetorno getController() {
        return controller;
    }
    
    

    public JTextPane getjTextPaneLogsEnvio() {
        return jTextPaneLogsEnvio;
    }

    public JTextPane getjTextPaneLogsRetorno() {
        return jTextPaneLogsRetorno;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneLogsEnvio = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneLogsRetorno = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(159, 195, 251));
        setMaximumSize(new java.awt.Dimension(680, 225));
        setMinimumSize(new java.awt.Dimension(680, 225));
        setName("JPanelDashBoardEnvioRetorno"); // NOI18N
        setPreferredSize(new java.awt.Dimension(680, 225));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setText("Logs de Envio e Retorno");
        jLabelTitulo.setName("jLabelTitulo"); // NOI18N

        jTextPaneLogsEnvio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPaneLogsEnvio.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextPaneLogsEnvio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextPaneLogsEnvio.setEnabled(false);
        jTextPaneLogsEnvio.setMaximumSize(new java.awt.Dimension(330, 165));
        jTextPaneLogsEnvio.setMinimumSize(new java.awt.Dimension(330, 165));
        jTextPaneLogsEnvio.setName("jTextPaneLogsEnvio"); // NOI18N
        jTextPaneLogsEnvio.setPreferredSize(new java.awt.Dimension(330, 165));
        jScrollPane1.setViewportView(jTextPaneLogsEnvio);

        jTextPaneLogsRetorno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPaneLogsRetorno.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextPaneLogsRetorno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextPaneLogsRetorno.setEnabled(false);
        jTextPaneLogsRetorno.setMaximumSize(new java.awt.Dimension(330, 165));
        jTextPaneLogsRetorno.setMinimumSize(new java.awt.Dimension(330, 165));
        jTextPaneLogsRetorno.setName("jTextPaneLogsRetorno"); // NOI18N
        jTextPaneLogsRetorno.setPreferredSize(new java.awt.Dimension(330, 165));
        jScrollPane2.setViewportView(jTextPaneLogsRetorno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPaneLogsEnvio;
    private javax.swing.JTextPane jTextPaneLogsRetorno;
    // End of variables declaration//GEN-END:variables
}
