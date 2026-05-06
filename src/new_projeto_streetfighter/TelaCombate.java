
package new_projeto_streetfighter;

public class TelaCombate extends javax.swing.JFrame {
    private Luta luta;
    
    public TelaCombate() {
        initComponents();

    }
    public TelaCombate(Lutador A, Lutador B) {
        initComponents();

        txAreaCombatPlayer1.setText("Nome: "+A.getNome()+"\nVida: "+A.getVida()+"\nGolpe: "+A.getGolpe());
        txAreaCombatPlayer2.setText("Nome: "+B.getNome()+"\nVida: "+B.getVida()+"\nGolpe: "+B.getGolpe());
        
        luta = new Luta(null, null, 0, 0, 0, 0, 0, 0, 0);
        
        jTextAreaTela.setText(+(luta.getRound()+1)+"º Round: \n"+A.getNome()+" vs "+B.getNome());
        
        
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPlay1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaCombatPlayer1 = new javax.swing.JTextArea();
        jLabelCombatPlayer1 = new javax.swing.JLabel();
        jPanelPlay2 = new javax.swing.JPanel();
        jLabelCombatPlayer2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAreaCombatPlayer2 = new javax.swing.JTextArea();
        jPanelBotoesCombat = new javax.swing.JPanel();
        jbAtaque = new javax.swing.JButton();
        jbDefesa = new javax.swing.JButton();
        jbEspecial = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaTela = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Combate");

        jPanelPlay1.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPlay1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txAreaCombatPlayer1.setEditable(false);
        txAreaCombatPlayer1.setBackground(new java.awt.Color(0, 0, 0));
        txAreaCombatPlayer1.setColumns(10);
        txAreaCombatPlayer1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txAreaCombatPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        txAreaCombatPlayer1.setRows(3);
        txAreaCombatPlayer1.setTabSize(3);
        jScrollPane1.setViewportView(txAreaCombatPlayer1);

        jLabelCombatPlayer1.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabelCombatPlayer1.setForeground(new java.awt.Color(105, 19, 149));
        jLabelCombatPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCombatPlayer1.setText("Player 1");

        javax.swing.GroupLayout jPanelPlay1Layout = new javax.swing.GroupLayout(jPanelPlay1);
        jPanelPlay1.setLayout(jPanelPlay1Layout);
        jPanelPlay1Layout.setHorizontalGroup(
            jPanelPlay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlay1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPlay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelCombatPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanelPlay1Layout.setVerticalGroup(
            jPanelPlay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlay1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCombatPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelPlay2.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPlay2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelCombatPlayer2.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabelCombatPlayer2.setForeground(new java.awt.Color(105, 19, 149));
        jLabelCombatPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCombatPlayer2.setText("Player 2");

        txAreaCombatPlayer2.setEditable(false);
        txAreaCombatPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        txAreaCombatPlayer2.setColumns(10);
        txAreaCombatPlayer2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txAreaCombatPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        txAreaCombatPlayer2.setRows(3);
        txAreaCombatPlayer2.setTabSize(3);
        jScrollPane2.setViewportView(txAreaCombatPlayer2);

        javax.swing.GroupLayout jPanelPlay2Layout = new javax.swing.GroupLayout(jPanelPlay2);
        jPanelPlay2.setLayout(jPanelPlay2Layout);
        jPanelPlay2Layout.setHorizontalGroup(
            jPanelPlay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlay2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPlay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelCombatPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanelPlay2Layout.setVerticalGroup(
            jPanelPlay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlay2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCombatPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBotoesCombat.setBackground(new java.awt.Color(204, 204, 204));
        jPanelBotoesCombat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAtaque.setBackground(new java.awt.Color(105, 19, 149));
        jbAtaque.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbAtaque.setForeground(new java.awt.Color(255, 255, 255));
        jbAtaque.setText("Atacar!");

        jbDefesa.setBackground(new java.awt.Color(105, 19, 149));
        jbDefesa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbDefesa.setForeground(new java.awt.Color(255, 255, 255));
        jbDefesa.setText("Defender!");

        jbEspecial.setBackground(new java.awt.Color(204, 45, 0));
        jbEspecial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbEspecial.setForeground(new java.awt.Color(255, 255, 255));
        jbEspecial.setText("Golpe Especial!");

        javax.swing.GroupLayout jPanelBotoesCombatLayout = new javax.swing.GroupLayout(jPanelBotoesCombat);
        jPanelBotoesCombat.setLayout(jPanelBotoesCombatLayout);
        jPanelBotoesCombatLayout.setHorizontalGroup(
            jPanelBotoesCombatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesCombatLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanelBotoesCombatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbDefesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEspecial))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanelBotoesCombatLayout.setVerticalGroup(
            jPanelBotoesCombatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesCombatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jbDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jbEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        jPanel1.setBackground(new java.awt.Color(69, 69, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextAreaTela.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaTela.setColumns(10);
        jTextAreaTela.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextAreaTela.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaTela.setRows(15);
        jScrollPane3.setViewportView(jTextAreaTela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPlay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotoesCombat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPlay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPlay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPlay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotoesCombat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCombate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCombatPlayer1;
    private javax.swing.JLabel jLabelCombatPlayer2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotoesCombat;
    private javax.swing.JPanel jPanelPlay1;
    private javax.swing.JPanel jPanelPlay2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaTela;
    private javax.swing.JButton jbAtaque;
    private javax.swing.JButton jbDefesa;
    private javax.swing.JButton jbEspecial;
    private javax.swing.JTextArea txAreaCombatPlayer1;
    private javax.swing.JTextArea txAreaCombatPlayer2;
    // End of variables declaration//GEN-END:variables
}
