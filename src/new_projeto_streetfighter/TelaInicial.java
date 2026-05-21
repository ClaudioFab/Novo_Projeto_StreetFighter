
package new_projeto_streetfighter;

public class TelaInicial extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaInicial.class.getName());

    public TelaInicial() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIniciarTotal = new javax.swing.JPanel();
        jLabelLogoSFF = new javax.swing.JLabel();
        jButtonIniciarComecar = new javax.swing.JButton();
        jPanelBaixoTelaInicial = new javax.swing.JPanel();
        jMenuBarTelaInicial = new javax.swing.JMenuBar();
        jMenuBarOption = new javax.swing.JMenu();
        jMenuBarSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Street Fake Fighter");

        jPanelIniciarTotal.setBackground(new java.awt.Color(204, 204, 204));
        jPanelIniciarTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelLogoSFF.setFont(new java.awt.Font("Algerian", 3, 70)); // NOI18N
        jLabelLogoSFF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoSFF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoSFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_SF2/5bbc076d085b1-4c73481585937b083b494daad8ab65f2.png"))); // NOI18N
        jLabelLogoSFF.setText("<html><span style=\"text-shadow: 2px 2px 3px rgba(0, 0, 0, 0.5);\">Fake</span></html>");
        jLabelLogoSFF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonIniciarComecar.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jButtonIniciarComecar.setText("COMEÇAR!");
        jButtonIniciarComecar.addActionListener(this::jButtonIniciarComecarActionPerformed);

        javax.swing.GroupLayout jPanelIniciarTotalLayout = new javax.swing.GroupLayout(jPanelIniciarTotal);
        jPanelIniciarTotal.setLayout(jPanelIniciarTotalLayout);
        jPanelIniciarTotalLayout.setHorizontalGroup(
            jPanelIniciarTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIniciarTotalLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanelIniciarTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonIniciarComecar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLogoSFF, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        jPanelIniciarTotalLayout.setVerticalGroup(
            jPanelIniciarTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIniciarTotalLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabelLogoSFF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(jButtonIniciarComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jPanelBaixoTelaInicial.setBackground(new java.awt.Color(204, 204, 204));
        jPanelBaixoTelaInicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBaixoTelaInicial.setPreferredSize(new java.awt.Dimension(4, 30));

        javax.swing.GroupLayout jPanelBaixoTelaInicialLayout = new javax.swing.GroupLayout(jPanelBaixoTelaInicial);
        jPanelBaixoTelaInicial.setLayout(jPanelBaixoTelaInicialLayout);
        jPanelBaixoTelaInicialLayout.setHorizontalGroup(
            jPanelBaixoTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelBaixoTelaInicialLayout.setVerticalGroup(
            jPanelBaixoTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jMenuBarTelaInicial.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBarTelaInicial.setForeground(new java.awt.Color(0, 0, 0));

        jMenuBarOption.setText("Opções");
        jMenuBarTelaInicial.add(jMenuBarOption);

        jMenuBarSair.setText("Sair");
        jMenuBarSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBarSairMouseClicked(evt);
            }
        });
        jMenuBarTelaInicial.add(jMenuBarSair);

        setJMenuBar(jMenuBarTelaInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIniciarTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBaixoTelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelIniciarTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelBaixoTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarComecarActionPerformed
        SelectLutas c1 = new SelectLutas();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonIniciarComecarActionPerformed

    private void jMenuBarSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBarSairMouseClicked
        SelectLutas.finaliza();
    }//GEN-LAST:event_jMenuBarSairMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        java.awt.EventQueue.invokeLater(() -> new TelaInicial().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarComecar;
    private javax.swing.JLabel jLabelLogoSFF;
    private javax.swing.JMenu jMenuBarOption;
    private javax.swing.JMenu jMenuBarSair;
    private javax.swing.JMenuBar jMenuBarTelaInicial;
    private javax.swing.JPanel jPanelBaixoTelaInicial;
    private javax.swing.JPanel jPanelIniciarTotal;
    // End of variables declaration//GEN-END:variables

}
