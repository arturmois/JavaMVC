/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

/**
 *
 * @author artur
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewMain
     */
    public ViewMain() {
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

        jPanelMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmLocacao = new javax.swing.JMenu();
        jmiAlugar = new javax.swing.JMenuItem();
        jmiConsultar = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jmiAtor = new javax.swing.JMenuItem();
        jmiCliente = new javax.swing.JMenuItem();
        jmiFilme = new javax.swing.JMenuItem();
        jmiItem = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locação Hora da Pipoca");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panel.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmLocacao.setText("Locação");
        jmLocacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmiAlugar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiAlugar.setText("Alugar");
        jmLocacao.add(jmiAlugar);

        jmiConsultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiConsultar.setText("Consultar");
        jmLocacao.add(jmiConsultar);

        jMenuBar1.add(jmLocacao);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmiAtor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiAtor.setText("Ator");
        jmiAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAtorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jmiAtor);

        jmiCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiCliente.setText("Cliente");
        jmiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jmiCliente);

        jmiFilme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiFilme.setText("Filme");
        jmiFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFilmeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jmiFilme);

        jmiItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiItem.setText("Item");
        jMenuCadastro.add(jmiItem);

        jMenuBar1.add(jMenuCadastro);

        jmSair.setText("Sair");
        jmSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFilmeActionPerformed
        ViewCadastroFilme cadastroFilme = new ViewCadastroFilme();
        cadastroFilme.setVisible(true);
    }//GEN-LAST:event_jmiFilmeActionPerformed

    private void jmiAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAtorActionPerformed
        ViewCadastroAtor cadastroAtor = new ViewCadastroAtor();
        cadastroAtor.setVisible(true);
    }//GEN-LAST:event_jmiAtorActionPerformed

    private void jmiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteActionPerformed
        ViewCadastroCliente cadastroCliente = new ViewCadastroCliente();
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jmiClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JMenu jmLocacao;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiAlugar;
    private javax.swing.JMenuItem jmiAtor;
    private javax.swing.JMenuItem jmiCliente;
    private javax.swing.JMenuItem jmiConsultar;
    private javax.swing.JMenuItem jmiFilme;
    private javax.swing.JMenuItem jmiItem;
    // End of variables declaration//GEN-END:variables
}
