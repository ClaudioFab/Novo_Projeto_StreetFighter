
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
        jMenuBarTelaInicial = new javax.swing.JMenuBar();
        jMenuBarOption = new javax.swing.JMenu();
        jMenuBarSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Street Fake Fighter");

        jPanelIniciarTotal.setBackground(new java.awt.Color(204, 204, 204));
        jPanelIniciarTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelLogoSFF.setFont(new java.awt.Font("Bookman Old Style", 3, 70)); // NOI18N
        jLabelLogoSFF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoSFF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoSFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_SF2/5bbc076d085b1-4c73481585937b083b494daad8ab65f2.png"))); // NOI18N
        jLabelLogoSFF.setText(" Fake ");
        jLabelLogoSFF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonIniciarComecar.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jButtonIniciarComecar.setText("COMEÇAR!");
        jButtonIniciarComecar.addActionListener(this::jButtonIniciarComecarActionPerformed);

        javax.swing.GroupLayout jPanelIniciarTotalLayout = new javax.swing.GroupLayout(jPanelIniciarTotal);
        jPanelIniciarTotal.setLayout(jPanelIniciarTotalLayout);
        jPanelIniciarTotalLayout.setHorizontalGroup(
            jPanelIniciarTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIniciarTotalLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanelIniciarTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonIniciarComecar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLogoSFF, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        jPanelIniciarTotalLayout.setVerticalGroup(
            jPanelIniciarTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIniciarTotalLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabelLogoSFF)
                .addGap(160, 160, 160)
                .addComponent(jButtonIniciarComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelIniciarTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelIniciarTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    private javax.swing.JPanel jPanelIniciarTotal;
    // End of variables declaration//GEN-END:variables

}
