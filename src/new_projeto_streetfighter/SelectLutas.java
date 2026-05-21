
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
                txAreaPlayer1.setText("Nome: "+p[0].getNome()+"\nNacionalidade: "+p[0].getNacionalidade()+"\nIdade: "+p[0].getIdade()+"\nAltura: "+p[0].getAltura()+"\nPeso: "+p[0].getPeso()+"\nCategoria: "+p[0].getCategoria()+"\nVida: "+p[0].getVida()+"\nEspecial: "+p[0].getGolpe());
                break;
            case 1:
                txAreaPlayer1.setText("Nome: "+p[1].getNome()+"\nNacionalidade: "+p[1].getNacionalidade()+"\nIdade: "+p[1].getIdade()+"\nAltura: "+p[1].getAltura()+"\nPeso: "+p[1].getPeso()+"\nCategoria: "+p[1].getCategoria()+"\nVida: "+p[1].getVida()+"\nEspecial: "+p[1].getGolpe());
                break;
            case 2:
                txAreaPlayer1.setText("Nome: "+p[2].getNome()+"\nNacionalidade: "+p[2].getNacionalidade()+"\nIdade: "+p[2].getIdade()+"\nAltura: "+p[2].getAltura()+"\nPeso: "+p[2].getPeso()+"\nCategoria: "+p[2].getCategoria()+"\nVida: "+p[2].getVida()+"\nEspecial: "+p[2].getGolpe());
                break;
            case 3:
                txAreaPlayer1.setText("Nome: "+p[3].getNome()+"\nNacionalidade: "+p[3].getNacionalidade()+"\nIdade: "+p[3].getIdade()+"\nAltura: "+p[3].getAltura()+"\nPeso: "+p[3].getPeso()+"\nCategoria: "+p[3].getCategoria()+"\nVida: "+p[3].getVida()+"\nEspecial: "+p[3].getGolpe());
                break;
            case 4:
                txAreaPlayer1.setText("Nome: "+p[4].getNome()+"\nNacionalidade: "+p[4].getNacionalidade()+"\nIdade: "+p[4].getIdade()+"\nAltura: "+p[4].getAltura()+"\nPeso: "+p[4].getPeso()+"\nCategoria: "+p[4].getCategoria()+"\nVida: "+p[4].getVida()+"\nEspecial: "+p[4].getGolpe());
                break;
            case 5:
                txAreaPlayer1.setText("Nome: "+p[5].getNome()+"\nNacionalidade: "+p[5].getNacionalidade()+"\nIdade: "+p[5].getIdade()+"\nAltura: "+p[5].getAltura()+"\nPeso: "+p[5].getPeso()+"\nCategoria: "+p[5].getCategoria()+"\nVida: "+p[5].getVida()+"\nEspecial: "+p[5].getGolpe());
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
                    txAreaPlayer2.setText("Nome: "+p[0].getNome()+"\nNacionalidade: "+p[0].getNacionalidade()+"\nIdade: "+p[0].getIdade()+"\nAltura: "+p[0].getAltura()+"\nPeso: "+p[0].getPeso()+"\nCategoria: "+p[0].getCategoria()+"\nVida: "+p[0].getVida()+"\nEspecial: "+p[0].getGolpe());
                    break;
                case 1:
                    txAreaPlayer2.setText("Nome: "+p[1].getNome()+"\nNacionalidade: "+p[1].getNacionalidade()+"\nIdade: "+p[1].getIdade()+"\nAltura: "+p[1].getAltura()+"\nPeso: "+p[1].getPeso()+"\nCategoria: "+p[1].getCategoria()+"\nVida: "+p[1].getVida()+"\nEspecial: "+p[1].getGolpe());
                    break;
                case 2:
                    txAreaPlayer2.setText("Nome: "+p[2].getNome()+"\nNacionalidade: "+p[2].getNacionalidade()+"\nIdade: "+p[2].getIdade()+"\nAltura: "+p[2].getAltura()+"\nPeso: "+p[2].getPeso()+"\nCategoria: "+p[2].getCategoria()+"\nVida: "+p[2].getVida()+"\nEspecial: "+p[2].getGolpe());
                    break;
                case 3:
                    txAreaPlayer2.setText("Nome: "+p[3].getNome()+"\nNacionalidade: "+p[3].getNacionalidade()+"\nIdade: "+p[3].getIdade()+"\nAltura: "+p[3].getAltura()+"\nPeso: "+p[3].getPeso()+"\nCategoria: "+p[3].getCategoria()+"\nVida: "+p[3].getVida()+"\nEspecial: "+p[3].getGolpe());
                    break;
                case 4:
                    txAreaPlayer2.setText("Nome: "+p[4].getNome()+"\nNacionalidade: "+p[4].getNacionalidade()+"\nIdade: "+p[4].getIdade()+"\nAltura: "+p[4].getAltura()+"\nPeso: "+p[4].getPeso()+"\nCategoria: "+p[4].getCategoria()+"\nVida: "+p[4].getVida()+"\nEspecial: "+p[4].getGolpe());
                    break;
                case 5:
                    txAreaPlayer2.setText("Nome: "+p[5].getNome()+"\nNacionalidade: "+p[5].getNacionalidade()+"\nIdade: "+p[5].getIdade()+"\nAltura: "+p[5].getAltura()+"\nPeso: "+p[5].getPeso()+"\nCategoria: "+p[5].getCategoria()+"\nVida: "+p[5].getVida()+"\nEspecial: "+p[5].getGolpe());
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

        jPanelPersonagem = new javax.swing.JPanel();
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
        jPanelTituloEscolha = new javax.swing.JPanel();
        jLabelTopoTitulo = new javax.swing.JLabel();
        jPanelVisorPlay1 = new javax.swing.JPanel();
        jLabelPlayer1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaPlayer1 = new javax.swing.JTextArea();
        jPanelVisorPlay2 = new javax.swing.JPanel();
        jLabelPlayer2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAreaPlayer2 = new javax.swing.JTextArea();
        jPanelBotaoLutar = new javax.swing.JPanel();
        jbLutar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBarSelectLuta = new javax.swing.JMenuBar();
        jMenuSelecionarSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Street Fake Fighter");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                voltarInicial(evt);
            }
        });

        jPanelPersonagem.setBackground(new java.awt.Color(69, 69, 250));
        jPanelPersonagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout jPanelPersonagemLayout = new javax.swing.GroupLayout(jPanelPersonagem);
        jPanelPersonagem.setLayout(jPanelPersonagemLayout);
        jPanelPersonagemLayout.setHorizontalGroup(
            jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPersonagemLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPersonagemLayout.createSequentialGroup()
                        .addComponent(jLabelRyu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbRyu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPersonagemLayout.createSequentialGroup()
                        .addGroup(jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelGuile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBison, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelChunLi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCammy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelKen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbGuile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbKen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbBison, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbChunLi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCammy, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
        );
        jPanelPersonagemLayout.setVerticalGroup(
            jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPersonagemLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelRyu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRyu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbKen, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKen))
                .addGap(18, 18, 18)
                .addGroup(jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGuile)
                    .addComponent(jbGuile, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBison)
                    .addComponent(jbBison, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelChunLi)
                    .addComponent(jbChunLi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCammy)
                    .addComponent(jbCammy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jPanelTituloEscolha.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTituloEscolha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTopoTitulo.setFont(new java.awt.Font("Bookman Old Style", 3, 48)); // NOI18N
        jLabelTopoTitulo.setForeground(new java.awt.Color(69, 69, 250));
        jLabelTopoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTopoTitulo.setText("Escolha seu Lutador");

        javax.swing.GroupLayout jPanelTituloEscolhaLayout = new javax.swing.GroupLayout(jPanelTituloEscolha);
        jPanelTituloEscolha.setLayout(jPanelTituloEscolhaLayout);
        jPanelTituloEscolhaLayout.setHorizontalGroup(
            jPanelTituloEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloEscolhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTopoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTituloEscolhaLayout.setVerticalGroup(
            jPanelTituloEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloEscolhaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelTopoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelVisorPlay1.setBackground(new java.awt.Color(204, 204, 204));
        jPanelVisorPlay1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelVisorPlay1.setToolTipText("");

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

        javax.swing.GroupLayout jPanelVisorPlay1Layout = new javax.swing.GroupLayout(jPanelVisorPlay1);
        jPanelVisorPlay1.setLayout(jPanelVisorPlay1Layout);
        jPanelVisorPlay1Layout.setHorizontalGroup(
            jPanelVisorPlay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVisorPlay1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelVisorPlay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVisorPlay1Layout.setVerticalGroup(
            jPanelVisorPlay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVisorPlay1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelVisorPlay2.setBackground(new java.awt.Color(204, 204, 204));
        jPanelVisorPlay2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelVisorPlay2.setToolTipText("");

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

        javax.swing.GroupLayout jPanelVisorPlay2Layout = new javax.swing.GroupLayout(jPanelVisorPlay2);
        jPanelVisorPlay2.setLayout(jPanelVisorPlay2Layout);
        jPanelVisorPlay2Layout.setHorizontalGroup(
            jPanelVisorPlay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVisorPlay2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVisorPlay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabelPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanelVisorPlay2Layout.setVerticalGroup(
            jPanelVisorPlay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVisorPlay2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanelBotaoLutar.setBackground(new java.awt.Color(204, 204, 204));
        jPanelBotaoLutar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbLutar.setBackground(new java.awt.Color(204, 45, 0));
        jbLutar.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jbLutar.setForeground(new java.awt.Color(255, 255, 255));
        jbLutar.setText("Lutar!");
        jbLutar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbLutar.addActionListener(this::jbLutarActionPerformed);

        javax.swing.GroupLayout jPanelBotaoLutarLayout = new javax.swing.GroupLayout(jPanelBotaoLutar);
        jPanelBotaoLutar.setLayout(jPanelBotaoLutarLayout);
        jPanelBotaoLutarLayout.setHorizontalGroup(
            jPanelBotaoLutarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotaoLutarLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jbLutar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanelBotaoLutarLayout.setVerticalGroup(
            jPanelBotaoLutarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotaoLutarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbLutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(4, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jMenuBarSelectLuta.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBarSelectLuta.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBarSelectLuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBarSelectLutaMouseClicked(evt);
            }
        });

        jMenuSelecionarSair.setText("Sair");
        jMenuSelecionarSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSelecionarSairMouseClicked(evt);
            }
        });
        jMenuBarSelectLuta.add(jMenuSelecionarSair);

        setJMenuBar(jMenuBarSelectLuta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTituloEscolha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelVisorPlay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVisorPlay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotaoLutar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelTituloEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelVisorPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelBotaoLutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelVisorPlay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Nenhum Lutador selecionado!","Aviso!",JOptionPane.WARNING_MESSAGE);
        }
        
        go1.statusLuta(player1,player2);
        go1.resetTudo();
        this.dispose();
    }//GEN-LAST:event_jbLutarActionPerformed

    private void jMenuBarSelectLutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBarSelectLutaMouseClicked
        //
    }//GEN-LAST:event_jMenuBarSelectLutaMouseClicked

    private void jMenuSelecionarSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSelecionarSairMouseClicked
        finaliza();
    }//GEN-LAST:event_jMenuSelecionarSairMouseClicked

    private void voltarInicial(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_voltarInicial
        TelaInicial c1 = new TelaInicial();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarInicial

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
    private javax.swing.JMenuBar jMenuBarSelectLuta;
    private javax.swing.JMenu jMenuSelecionarSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotaoLutar;
    private javax.swing.JPanel jPanelPersonagem;
    private javax.swing.JPanel jPanelTituloEscolha;
    private javax.swing.JPanel jPanelVisorPlay1;
    private javax.swing.JPanel jPanelVisorPlay2;
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
