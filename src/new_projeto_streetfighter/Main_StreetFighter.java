
package new_projeto_streetfighter;

import javax.swing.JOptionPane;

public class Main_StreetFighter {

    public static void main(String[] args) {
        iniciandoTorneio();
        

    }
    public static void iniciandoTorneio(){
        Lutador p1 = new Lutador("Ryu","Japão",35,1.75,71,null,0,0,0);
        Lutador p2 = new Lutador("Ken","Estados Unidos",33,1.79,75,null,0,0,0);
        Lutador p3 = new Lutador("Guile","Estados Unidos",45,1.82,86,null,0,0,0);
        Lutador p4 = new Lutador("Bison","Tailândia",55,1.82,110,null,0,0,0);
        Lutador p5 = new Lutador("Chun-Li","China",30,1.69,55,null,0,0,0);
        Lutador p6 = new Lutador("Cammy","Reino Unido",27,1.64,61,null,0,0,0);

        Luta combat = new Luta(false);

        int go;
        do {
            p1.apresentar();
            combat.marcarLuta(p1, p2);
            combat.lutar(p1, p2);
            combat.lutar(p1, p2);

            p1.status(p1, p2);

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
    
    
}
