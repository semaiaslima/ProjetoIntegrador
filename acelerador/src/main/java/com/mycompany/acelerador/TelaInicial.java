/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.acelerador;

import java.awt.Color;

/**
 *
 * @author semaias.olima
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnuAlterarCor = new javax.swing.JMenu();
        mnuCorBranca = new javax.swing.JMenuItem();
        mnuCorPreta = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuCadastro = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        mnuAlterarCor.setText("Alterar cor de fundo");

        mnuCorBranca.setText("Branco");
        mnuCorBranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCorBrancaActionPerformed(evt);
            }
        });
        mnuAlterarCor.add(mnuCorBranca);

        mnuCorPreta.setText("Preto");
        mnuCorPreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCorPretaActionPerformed(evt);
            }
        });
        mnuAlterarCor.add(mnuCorPreta);

        jPopupMenu1.add(mnuAlterarCor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setComponentPopupMenu(jPopupMenu1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        jMenu1.setMnemonic('A');
        jMenu1.setText("Arquivo");

        jMenu3.setText("Cliente");

        mnuCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCadastro.setText("Cadastro");
        mnuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCadastro);

        jMenu1.add(jMenu3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log-Out-icon.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('E');
        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroActionPerformed
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
    }//GEN-LAST:event_mnuCadastroActionPerformed

    private void mnuCorBrancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCorBrancaActionPerformed
        this.jPanel1.setBackground(Color.white);
    }//GEN-LAST:event_mnuCorBrancaActionPerformed

    private void mnuCorPretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCorPretaActionPerformed
                this.jPanel1.setBackground(Color.black);
    }//GEN-LAST:event_mnuCorPretaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu mnuAlterarCor;
    private javax.swing.JMenuItem mnuCadastro;
    private javax.swing.JMenuItem mnuCorBranca;
    private javax.swing.JMenuItem mnuCorPreta;
    // End of variables declaration//GEN-END:variables
}
