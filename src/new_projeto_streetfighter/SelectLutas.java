
package new_projeto_streetfighter;

import java.util.Random;
import javax.swing.JOptionPane;

public class SelectLutas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SelectLutas.class.getName());
    private Lutador player1;
    private Lutador player2;
    
    public SelectLutas() {
        initComponents();
    }
    
    public static void finaliza(){
        JOptionPane.showMessageDialog(null,"Programa finalizado.","Encerrando",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    public void personagem(int numA){        

        Lutador[] p = new Lutador[6];
        p[0] = new Lutador("Ryu",null,0,0,0,null,0,null);
        p[1] = new Lutador("Ken",null,0,0,0,null,0,null);
        p[2] = new Lutador("Guile",null,0,0,0,null,0,null);
        p[3] = new Lutador("M.Bison",null,0,0,0,null,0,null);
        p[4] = new Lutador("Chun-Li",null,0,0,0,null,0,null);
        p[5] = new Lutador("Cammy",null,0,0,0,null,0,null);
        
        switch (numA) {
            case 0:
                txAreaPlayer1.setText("Nome: "+p[0].getNome()+"\nNacionalidade: "+p[0].getNacionalidade()+"\nIdade: "+p[0].getIdade()+"\nAltura: "+p[0].getAltura()+"\nPeso: "+p[0].getPeso()+"\nCategoria: "+p[0].getCategoria()+"\nVida: "+p[0].getVida()+"\nGolpe: "+p[0].getGolpe());
                break;
            case 1:
                txAreaPlayer1.setText("Nome: "+p[1].getNome()+"\nNacionalidade: "+p[1].getNacionalidade()+"\nIdade: "+p[1].getIdade()+"\nAltura: "+p[1].getAltura()+"\nPeso: "+p[1].getPeso()+"\nCategoria: "+p[1].getCategoria()+"\nVida: "+p[1].getVida()+"\nGolpe: "+p[1].getGolpe());
                break;
            case 2:
                txAreaPlayer1.setText("Nome: "+p[2].getNome()+"\nNacionalidade: "+p[2].getNacionalidade()+"\nIdade: "+p[2].getIdade()+"\nAltura: "+p[2].getAltura()+"\nPeso: "+p[2].getPeso()+"\nCategoria: "+p[2].getCategoria()+"\nVida: "+p[2].getVida()+"\nGolpe: "+p[2].getGolpe());
                break;
            case 3:
                txAreaPlayer1.setText("Nome: "+p[3].getNome()+"\nNacionalidade: "+p[3].getNacionalidade()+"\nIdade: "+p[3].getIdade()+"\nAltura: "+p[3].getAltura()+"\nPeso: "+p[3].getPeso()+"\nCategoria: "+p[3].getCategoria()+"\nVida: "+p[3].getVida()+"\nGolpe: "+p[3].getGolpe());
                break;
            case 4:
                txAreaPlayer1.setText("Nome: "+p[4].getNome()+"\nNacionalidade: "+p[4].getNacionalidade()+"\nIdade: "+p[4].getIdade()+"\nAltura: "+p[4].getAltura()+"\nPeso: "+p[4].getPeso()+"\nCategoria: "+p[4].getCategoria()+"\nVida: "+p[4].getVida()+"\nGolpe: "+p[4].getGolpe());
                break;
            case 5:
                txAreaPlayer1.setText("Nome: "+p[5].getNome()+"\nNacionalidade: "+p[5].getNacionalidade()+"\nIdade: "+p[5].getIdade()+"\nAltura: "+p[5].getAltura()+"\nPeso: "+p[5].getPeso()+"\nCategoria: "+p[5].getCategoria()+"\nVida: "+p[5].getVida()+"\nGolpe: "+p[5].getGolpe());
                break;
            default:
                throw new AssertionError();
        }
        
        

        int numB;
        do {
            Random rand = new Random();
            numB = rand.nextInt(6);
            switch (numB) {
                case 0:
                    txAreaPlayer2.setText("Nome: "+p[0].getNome()+"\nNacionalidade: "+p[0].getNacionalidade()+"\nIdade: "+p[0].getIdade()+"\nAltura: "+p[0].getAltura()+"\nPeso: "+p[0].getPeso()+"\nCategoria: "+p[0].getCategoria()+"\nVida: "+p[0].getVida()+"\nGolpe: "+p[0].getGolpe());
                    break;
                case 1:
                    txAreaPlayer2.setText("Nome: "+p[1].getNome()+"\nNacionalidade: "+p[1].getNacionalidade()+"\nIdade: "+p[1].getIdade()+"\nAltura: "+p[1].getAltura()+"\nPeso: "+p[1].getPeso()+"\nCategoria: "+p[1].getCategoria()+"\nVida: "+p[1].getVida()+"\nGolpe: "+p[1].getGolpe());
                    break;
                case 2:
                    txAreaPlayer2.setText("Nome: "+p[2].getNome()+"\nNacionalidade: "+p[2].getNacionalidade()+"\nIdade: "+p[2].getIdade()+"\nAltura: "+p[2].getAltura()+"\nPeso: "+p[2].getPeso()+"\nCategoria: "+p[2].getCategoria()+"\nVida: "+p[2].getVida()+"\nGolpe: "+p[2].getGolpe());
                    break;
                case 3:
                    txAreaPlayer2.setText("Nome: "+p[3].getNome()+"\nNacionalidade: "+p[3].getNacionalidade()+"\nIdade: "+p[3].getIdade()+"\nAltura: "+p[3].getAltura()+"\nPeso: "+p[3].getPeso()+"\nCategoria: "+p[3].getCategoria()+"\nVida: "+p[3].getVida()+"\nGolpe: "+p[3].getGolpe());
                    break;
                case 4:
                    txAreaPlayer2.setText("Nome: "+p[4].getNome()+"\nNacionalidade: "+p[4].getNacionalidade()+"\nIdade: "+p[4].getIdade()+"\nAltura: "+p[4].getAltura()+"\nPeso: "+p[4].getPeso()+"\nCategoria: "+p[4].getCategoria()+"\nVida: "+p[4].getVida()+"\nGolpe: "+p[4].getGolpe());
                    break;
                case 5:
                    txAreaPlayer2.setText("Nome: "+p[5].getNome()+"\nNacionalidade: "+p[5].getNacionalidade()+"\nIdade: "+p[5].getIdade()+"\nAltura: "+p[5].getAltura()+"\nPeso: "+p[5].getPeso()+"\nCategoria: "+p[5].getCategoria()+"\nVida: "+p[5].getVida()+"\nGolpe: "+p[5].getGolpe());
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (numB == numA);
        

        player1 = p[numA];
        player2 = p[numB];
        
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelRyu = new javax.swing.JLabel();
        jLabelKen = new javax.swing.JLabel();
        jLabelGuile = new javax.swing.JLabel();
        jLabelBison = new javax.swing.JLabel();
        jLabelChunLi = new javax.swing.JLabel();
        jLabelCammy = new javax.swing.JLabel();
        jbRyu = new javax.swing.JButton();
        jbKen = new javax.swing.JButton();
        jbBison = new javax.swing.JButton();
        jbGuile = new javax.swing.JButton();
        jbCammy = new javax.swing.JButton();
        jbChunLi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelTopoTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelPlayer1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaPlayer1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabelPlayer2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAreaPlayer2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jbLutar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSelecionarSair = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleção de Personagens");

        jPanel1.setBackground(new java.awt.Color(69, 69, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelRyu.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabelRyu.setForeground(new java.awt.Color(89, 39, 235));
        jLabelRyu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_SF2/ryu3.png"))); // NOI18N

        jLabelKen.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabelKen.setForeground(new java.awt.Color(89, 39, 235));
        jLabelKen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_SF2/ken3.png"))); // NOI18N

        jLabelGuile.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabelGuile.setForeground(new java.awt.Color(89, 39, 235));
        jLabelGuile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_SF2/guile3.png"))); // NOI18N

        jLabelBison.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabelBison.setForeground(new java.awt.Color(89, 39, 235));
        jLabelBison.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_SF2/bison3.png"))); // NOI18N

        jLabelChunLi.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabelChunLi.setForeground(new java.awt.Color(89, 39, 235));
        jLabelChunLi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_SF2/chunli3.png"))); // NOI18N

        jLabelCammy.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabelCammy.setForeground(new java.awt.Color(89, 39, 235));
        jLabelCammy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_SF2/cammy3.png"))); // NOI18N

        jbRyu.setBackground(new java.awt.Color(153, 153, 153));
        jbRyu.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jbRyu.setForeground(new java.awt.Color(105, 19, 149));
        jbRyu.setText("Ryu");
        jbRyu.addActionListener(this::jbRyuActionPerformed);

        jbKen.setBackground(new java.awt.Color(153, 153, 153));
        jbKen.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jbKen.setForeground(new java.awt.Color(105, 19, 149));
        jbKen.setText("Ken");
        jbKen.addActionListener(this::jbKenActionPerformed);

        jbBison.setBackground(new java.awt.Color(153, 153, 153));
        jbBison.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jbBison.setForeground(new java.awt.Color(105, 19, 149));
        jbBison.setText("M.Bison");
        jbBison.addActionListener(this::jbBisonActionPerformed);

        jbGuile.setBackground(new java.awt.Color(153, 153, 153));
        jbGuile.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jbGuile.setForeground(new java.awt.Color(105, 19, 149));
        jbGuile.setText("Guile");
        jbGuile.addActionListener(this::jbGuileActionPerformed);

        jbCammy.setBackground(new java.awt.Color(153, 153, 153));
        jbCammy.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jbCammy.setForeground(new java.awt.Color(105, 19, 149));
        jbCammy.setText("Cammy");
        jbCammy.addActionListener(this::jbCammyActionPerformed);

        jbChunLi.setBackground(new java.awt.Color(153, 153, 153));
        jbChunLi.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jbChunLi.setForeground(new java.awt.Color(105, 19, 149));
        jbChunLi.setText("Chun-li");
        jbChunLi.addActionListener(this::jbChunLiActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelRyu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbRyu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelGuile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBison, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelChunLi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCammy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelKen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbGuile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbKen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbBison, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbChunLi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCammy, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelRyu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRyu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbKen, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKen))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGuile)
                    .addComponent(jbGuile, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBison)
                    .addComponent(jbBison, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelChunLi)
                    .addComponent(jbChunLi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCammy)
                    .addComponent(jbCammy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTopoTitulo.setFont(new java.awt.Font("Bookman Old Style", 3, 48)); // NOI18N
        jLabelTopoTitulo.setForeground(new java.awt.Color(69, 69, 250));
        jLabelTopoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTopoTitulo.setText("Escolha seu Lutador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTopoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTopoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setToolTipText("");

        jLabelPlayer1.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabelPlayer1.setForeground(new java.awt.Color(105, 19, 149));
        jLabelPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayer1.setText("Player 1");

        txAreaPlayer1.setEditable(false);
        txAreaPlayer1.setBackground(new java.awt.Color(0, 0, 0));
        txAreaPlayer1.setColumns(8);
        txAreaPlayer1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txAreaPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        txAreaPlayer1.setRows(8);
        jScrollPane1.setViewportView(txAreaPlayer1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setToolTipText("");

        jLabelPlayer2.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabelPlayer2.setForeground(new java.awt.Color(105, 19, 149));
        jLabelPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayer2.setText("Player 2");

        txAreaPlayer2.setEditable(false);
        txAreaPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        txAreaPlayer2.setColumns(8);
        txAreaPlayer2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txAreaPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        txAreaPlayer2.setRows(8);
        jScrollPane2.setViewportView(txAreaPlayer2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabelPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbLutar.setBackground(new java.awt.Color(204, 45, 0));
        jbLutar.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jbLutar.setForeground(new java.awt.Color(255, 255, 255));
        jbLutar.setText("Lutar!");
        jbLutar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbLutar.addActionListener(this::jbLutarActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jbLutar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbLutar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseClicked(evt);
            }
        });

        jMenuSelecionarSair.setText("Sair");
        jMenuSelecionarSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSelecionarSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSelecionarSair);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbChunLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChunLiActionPerformed
        personagem(4);        
    }//GEN-LAST:event_jbChunLiActionPerformed

    private void jbCammyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCammyActionPerformed
       personagem(5);
    }//GEN-LAST:event_jbCammyActionPerformed

    private void jbGuileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuileActionPerformed
        personagem(2);
    }//GEN-LAST:event_jbGuileActionPerformed

    private void jbBisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBisonActionPerformed
        personagem(3);
    }//GEN-LAST:event_jbBisonActionPerformed

    private void jbKenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKenActionPerformed
        personagem(1);
    }//GEN-LAST:event_jbKenActionPerformed

    private void jbRyuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRyuActionPerformed
        personagem(0);
    }//GEN-LAST:event_jbRyuActionPerformed

    private void jbLutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLutarActionPerformed
        Luta go1 = new Luta(null,null,0,0,0,0,0,0,0);

        try {
            TelaCombate c2 = new TelaCombate(player1, player2);
            c2.setVisible(true);
            go1.lutar(player1,player2);
            go1.lutar(player1,player2);
            go1.lutar(player1,player2);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Nenhum Lutador selecionado!","Aviso!",JOptionPane.WARNING_MESSAGE);
        }
        
        go1.statusLuta(player1,player2);
        go1.resetTudo();
    }//GEN-LAST:event_jbLutarActionPerformed

    private void jMenuBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseClicked
        //
    }//GEN-LAST:event_jMenuBar1MouseClicked

    private void jMenuSelecionarSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSelecionarSairMouseClicked
        finaliza();
    }//GEN-LAST:event_jMenuSelecionarSairMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SelectLutas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBison;
    private javax.swing.JLabel jLabelCammy;
    private javax.swing.JLabel jLabelChunLi;
    private javax.swing.JLabel jLabelGuile;
    private javax.swing.JLabel jLabelKen;
    private javax.swing.JLabel jLabelPlayer1;
    private javax.swing.JLabel jLabelPlayer2;
    private javax.swing.JLabel jLabelRyu;
    private javax.swing.JLabel jLabelTopoTitulo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuSelecionarSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBison;
    private javax.swing.JButton jbCammy;
    private javax.swing.JButton jbChunLi;
    private javax.swing.JButton jbGuile;
    private javax.swing.JButton jbKen;
    private javax.swing.JButton jbLutar;
    private javax.swing.JButton jbRyu;
    private javax.swing.JTextArea txAreaPlayer1;
    private javax.swing.JTextArea txAreaPlayer2;
    // End of variables declaration//GEN-END:variables
}
