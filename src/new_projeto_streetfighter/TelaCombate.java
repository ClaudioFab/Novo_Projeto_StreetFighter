package new_projeto_streetfighter;

import java.util.Random;

public class TelaCombate extends javax.swing.JFrame {

    private Lutador player1;
    private Lutador player2;

    private int vidaPlayer1;
    private int vidaPlayer2;

    private Luta luta;

    public TelaCombate() {
        initComponents();

    }

    public TelaCombate(Lutador A, Lutador B) {
        initComponents();

        this.player1 = A;
        this.player2 = B;
        this.vidaPlayer1 = A.getVida();
        this.vidaPlayer2 = B.getVida();

        luta = new Luta(player1, player2, 0, 0, 0, 0, 0, 0, 0);

        novoRound();

    }

    public void novoRound() {

        vidaPlayer1 = player1.getVida();
        vidaPlayer2 = player2.getVida();

        atualizarTela();

        jTextVisorCombate.setText(jTextVisorCombate.getText() + "\n" +(luta.getRound()+1) + "º ROUND =============\n" + player1.getNome() + " vs " + player2.getNome() + "...Lutem!\n");
    }

    public void atualizarTela() {
        txAreaCombatPlayer1.setText("Nome: " + player1.getNome() + "\nVida: " + vidaPlayer1 + "\nEspecial: " + player1.getGolpe());
        txAreaCombatPlayer2.setText("Nome: " + player2.getNome() + "\nVida: " + vidaPlayer2 + "\nEspecial: " + player2.getGolpe());
    }

    public void ataque(int dano) {

        Random rand = new Random();

        boolean defesaPlayer2 = rand.nextBoolean();

        String mensagem = "";

        mensagem += player1.getNome() + " ataca com " + dano + " de dano!\n";

        if (defesaPlayer2) {
            mensagem += player2.getNome() + " defendeu!\n";
            vidaPlayer2 -= (dano / 2);
            mensagem += player2.getNome() + " perde 10 de vida\n";
        } else {
            mensagem += player2.getNome() + " não conseguiu defender!\n";
            vidaPlayer2 -= dano;
            mensagem += player2.getNome() + " perde 20 de vida\n";
        }

        if (vidaPlayer2 <= 0) {
            vidaPlayer2 = 0;
            mensagem += "\n" + player2.getNome() + " foi derrotado!\n";

            mensagem += "\n" + player1.getNome() + " VENCE O ROUND!!\n";

            atualizarTela();

            mensagem += "\n====================\n";

            jTextVisorCombate.setText(jTextVisorCombate.getText() + "\n" + mensagem);

            luta.setRound(luta.getRound() + 1);
            novoRound();
        }

        mensagem += "\n====================\n";

        atualizarTela();

        jTextVisorCombate.setText(jTextVisorCombate.getText() + "\n" + mensagem);
    }

    public void defesa(int dano) {

        String mensagem = "";

        mensagem += player1.getNome() + " defende!\n";

        mensagem += player2.getNome() + " ataca e causa " + (dano / 2) + " de dano!\n";
        vidaPlayer1 -= (dano / 2);
        mensagem += player1.getNome() + " perde 10 de vida\n";

        if (vidaPlayer1 <= 0) {
            vidaPlayer1 = 0;
            mensagem += "\n" + player1.getNome() + " foi derrotado!\n";

            mensagem += "\n" + player2.getNome() + " VENCE O ROUND!!\n";

            atualizarTela();

            mensagem += "\n====================\n";

            jTextVisorCombate.setText(jTextVisorCombate.getText() + "\n" + mensagem);

            luta.setRound(luta.getRound() + 1);
            novoRound();

        }

        atualizarTela();

        mensagem += "\n====================\n";

        jTextVisorCombate.setText(jTextVisorCombate.getText() + "\n" + mensagem);

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
        jPanelVisorCombate = new javax.swing.JPanel();
        jScrollPaneVisorCombate = new javax.swing.JScrollPane();
        jTextVisorCombate = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Street Fake Fighter");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                voltarSeleciona(evt);
            }
        });

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
                .addContainerGap(17, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(27, Short.MAX_VALUE)
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelBotoesCombat.setBackground(new java.awt.Color(204, 204, 204));
        jPanelBotoesCombat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Player 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bookman Old Style", 3, 18), new java.awt.Color(105, 19, 149))); // NOI18N

        jbAtaque.setBackground(new java.awt.Color(105, 19, 149));
        jbAtaque.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbAtaque.setForeground(new java.awt.Color(255, 255, 255));
        jbAtaque.setText("Atacar!");
        jbAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtaqueActionPerformed(evt);
            }
        });

        jbDefesa.setBackground(new java.awt.Color(105, 19, 149));
        jbDefesa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbDefesa.setForeground(new java.awt.Color(255, 255, 255));
        jbDefesa.setText("Defender!");
        jbDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDefesaActionPerformed(evt);
            }
        });

        jbEspecial.setBackground(new java.awt.Color(204, 45, 0));
        jbEspecial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbEspecial.setForeground(new java.awt.Color(255, 255, 255));
        jbEspecial.setText("Golpe Especial!");
        jbEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEspecialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesCombatLayout = new javax.swing.GroupLayout(jPanelBotoesCombat);
        jPanelBotoesCombat.setLayout(jPanelBotoesCombatLayout);
        jPanelBotoesCombatLayout.setHorizontalGroup(
            jPanelBotoesCombatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesCombatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEspecial)
                .addGap(20, 20, 20))
        );
        jPanelBotoesCombatLayout.setVerticalGroup(
            jPanelBotoesCombatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesCombatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBotoesCombatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanelVisorCombate.setBackground(new java.awt.Color(69, 69, 250));
        jPanelVisorCombate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextVisorCombate.setBackground(new java.awt.Color(0, 0, 0));
        jTextVisorCombate.setColumns(37);
        jTextVisorCombate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextVisorCombate.setForeground(new java.awt.Color(255, 255, 255));
        jTextVisorCombate.setRows(15);
        jScrollPaneVisorCombate.setViewportView(jTextVisorCombate);

        javax.swing.GroupLayout jPanelVisorCombateLayout = new javax.swing.GroupLayout(jPanelVisorCombate);
        jPanelVisorCombate.setLayout(jPanelVisorCombateLayout);
        jPanelVisorCombateLayout.setHorizontalGroup(
            jPanelVisorCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVisorCombateLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPaneVisorCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVisorCombateLayout.setVerticalGroup(
            jPanelVisorCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVisorCombateLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPaneVisorCombate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jMenu1.setText("Sair");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCombateSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelPlay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPlay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelBotoesCombat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVisorCombate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPlay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPlay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoesCombat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVisorCombate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarSeleciona(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_voltarSeleciona
        SelectLutas c1 = new SelectLutas();
        c1.setVisible(true);
    }//GEN-LAST:event_voltarSeleciona

    private void jMenuCombateSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCombateSairMouseClicked
        SelectLutas.finaliza();
    }//GEN-LAST:event_jMenuCombateSairMouseClicked

    private void jbAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtaqueActionPerformed
        ataque(20);
    }//GEN-LAST:event_jbAtaqueActionPerformed

    private void jbDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDefesaActionPerformed
        defesa(20);
    }//GEN-LAST:event_jbDefesaActionPerformed

    private void jbEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEspecialActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelBotoesCombat;
    private javax.swing.JPanel jPanelPlay1;
    private javax.swing.JPanel jPanelPlay2;
    private javax.swing.JPanel jPanelVisorCombate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneVisorCombate;
    private javax.swing.JTextArea jTextVisorCombate;
    private javax.swing.JButton jbAtaque;
    private javax.swing.JButton jbDefesa;
    private javax.swing.JButton jbEspecial;
    private javax.swing.JTextArea txAreaCombatPlayer1;
    private javax.swing.JTextArea txAreaCombatPlayer2;
    // End of variables declaration//GEN-END:variables
}
