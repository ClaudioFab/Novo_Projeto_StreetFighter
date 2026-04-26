
package new_projeto_streetfighter;

import java.util.Random;
import javax.swing.JOptionPane;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int round;
    private boolean aprovado;

    //CONSTRUTOR--------------------------------------------------------------
    public Luta(boolean aprovado) {
        this.aprovado = false;
    }

    //GETTER------------------------------------------------------------------
        public Lutador getDesafiante() {
        return desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    
    public int getRound() {
        return round;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    //SETTER------------------------------------------------------------------

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setRound(int round) {
        this.round++;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    //METODOS-----------------------------------------------------------------
    
    public void marcarLuta(Lutador A, Lutador B){
        setDesafiante(A);
        setDesafiado(B);
        if(A.getCategoria()==B.getCategoria() && !getDesafiante().equals(getDesafiado())){
            setAprovado(true);
            JOptionPane.showMessageDialog(null,"Luta entre "+getDesafiante().getNome()+" e "+getDesafiado().getNome()+"...\nAPROVADA!","Verificando...",JOptionPane.WARNING_MESSAGE);
            lutar(A,B);

        }else{
            JOptionPane.showMessageDialog(null,"Luta entre "+getDesafiante().getNome()+" e "+getDesafiado().getNome()+"...\nCANCELADA!","Verificando...",JOptionPane.ERROR_MESSAGE);
            Main_StreetFighter.retornarJogo(0);
        }

        
        
    }
    
    public void lutar(Lutador A, Lutador B){
        if(isAprovado() == true){
            getDesafiante();
            getDesafiado();
            setRound(round);
            JOptionPane.showMessageDialog(null,+getRound()+"º Round: \n"+A.getNome()+" vs "+B.getNome(),"Round "+getRound(),JOptionPane.INFORMATION_MESSAGE);
            Random aleatorio = new Random();

            int vence = aleatorio.nextInt(3);

            if (vence == 0) {
                JOptionPane.showMessageDialog(null,"Vencedor: " +A.getNome(),"Vitória!",JOptionPane.WARNING_MESSAGE);
                A.setVitoria(A.getVitoria()+1);
                B.setDerrota(B.getDerrota()+1);
            } else if(vence == 1){
                JOptionPane.showMessageDialog(null,"Vencedor: " +B.getNome(),"Vitória!",JOptionPane.WARNING_MESSAGE);
                B.setVitoria(B.getVitoria()+1);
                A.setDerrota(A.getDerrota()+1);
            }else{
                JOptionPane.showMessageDialog(null,"Empate entre "+A.getNome()+" e "+B.getNome(),"Empate!",JOptionPane.WARNING_MESSAGE);
                A.setEmpate(A.getEmpate()+1);
                B.setEmpate(B.getEmpate()+1); 
            }
            
        }else{
            Main_StreetFighter.retornarJogo(0);            
        }
        


    }
    
    
    
}
