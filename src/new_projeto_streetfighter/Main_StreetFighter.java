
package new_projeto_streetfighter;

import java.util.Random;
import javax.swing.JOptionPane;

public class Main_StreetFighter {

    public static void main(String[] args) {
        
        iniciandoTorneio();
        

    }
    public static void iniciandoTorneio(){
        Random rand = new Random();

        Lutador[] p = new Lutador[6];
        p[0] = new Lutador("Ryu","Japão",35,1.75,71,null,0,0,0);
        p[1] = new Lutador("Ken","Estados Unidos",33,1.79,75,null,0,0,0);
        p[2] = new Lutador("Guile","Estados Unidos",45,1.82,86,null,0,0,0);
        p[3] = new Lutador("M.Bison","Tailândia",55,1.82,110,null,0,0,0);
        p[4] = new Lutador("Chun-Li","China",30,1.69,55,null,0,0,0);
        p[5] = new Lutador("Cammy","Reino Unido",27,1.64,61,null,0,0,0);

        Luta combat = new Luta(false);

        int go;
        do {
            verificar();
            
            combat.marcarLuta(p[4],p[5]);
            combat.lutar(p[4],p[5]);
            combat.lutar(p[4],p[5]);
            
            p[0].status(p[4],p[5]);
            combat.resetRound();
            go = retornarJogo(0);
        } while (go == 1);
        finaliza();

    }
    
    public static int retornarJogo(int go){
        int escolha = JOptionPane.showConfirmDialog(null,"Recomeçar novo Torneio?","Continue?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(escolha == 0){
            go = 1;
        }else if(escolha == 1){
            finaliza();
        }
        return go;
    }
    
    public static void finaliza(){
        JOptionPane.showMessageDialog(null,"Programa finalizado.","Encerrando",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    
    public static void verificar(){
        int escolha=0;
        do {
            String[] varia = {"Sim","Começar Luta","Encerrar"};
            escolha = JOptionPane.showOptionDialog(null,"Verificar Status de Lutador?","Iniciando",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,varia,varia[0]);

            if(escolha == 0){
                Lutador p1 = new Lutador("Ryu","Japão",35,1.75,71,null,0,0,0);
                Lutador p2 = new Lutador("Ken","Estados Unidos",33,1.79,75,null,0,0,0);
                Lutador p3 = new Lutador("Guile","Estados Unidos",45,1.82,86,null,0,0,0);
                Lutador p4 = new Lutador("Bison","Tailândia",55,1.82,110,null,0,0,0);
                Lutador p5 = new Lutador("Chun-Li","China",30,1.69,55,null,0,0,0);
                Lutador p6 = new Lutador("Cammy","Reino Unido",27,1.64,61,null,0,0,0);

                Object[] variavel = {"Ryu","Ken","Guile","Bison","Chun-Li","Cammy"};
                Object verificar = JOptionPane.showInputDialog(null,"Escolha o Lutador","Lutadores",JOptionPane.QUESTION_MESSAGE,null,variavel,variavel[0]);

                if(verificar==null){
                    finaliza();
                }else if(verificar.equals("Ryu")){
                    p1.apresentar();
                }else if(verificar.equals("Ken")){
                    p2.apresentar();
                }else if(verificar.equals("Guile")){
                    p3.apresentar();
                }else if(verificar.equals("Bison")){
                    p4.apresentar();
                }else if(verificar.equals("Chun-Li")){
                    p5.apresentar();
                }else{
                    p6.apresentar();
                }

            }else if(escolha == 1){
                break;    
            }else{
                finaliza();
            }
            
        } while (true);
   
    }
    
    public static int pergunta(int go){
        int escolha = JOptionPane.showConfirmDialog(null,"Recomeçar?","Continue?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(escolha == 0){
            go = 1;
        }else if(escolha == 1){
            finaliza();
        }
        return go;
        
    }
    
}
