
package new_projeto_streetfighter;

import java.util.Random;

public class Luta {
    public Lutador desafiante;
    public Lutador desafiado;
    private int round;
    private int vitoriaA;
    private int derrotaA;
    private int empateA;
    
    private int vitoriaB;
    private int derrotaB;
    private int empateB;

    //CONSTRUTOR--------------------------------------------------------------

    public Luta(Lutador desafiante, Lutador desafiado, int round, int vitoriaA, int derrotaA, int empateA, int vitoriaB, int derrotaB, int empateB) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.round = round;
        this.vitoriaA = vitoriaA;
        this.derrotaA = derrotaA;
        this.empateA = empateA;
        
        this.vitoriaB = vitoriaB;
        this.derrotaB = derrotaB;
        this.empateB = empateB;
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

    public int getVitoriaA() {
        return vitoriaA;
    }

    public int getDerrotaA() {
        return derrotaA;
    }

    public int getEmpateA() {
        return empateA;
    }

    public int getVitoriaB() {
        return vitoriaB;
    }

    public int getDerrotaB() {
        return derrotaB;
    }

    public int getEmpateB() {
        return empateB;
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

    public void setVitoriaA(int vitoriaA) {
        this.vitoriaA++;
    }

    public void setDerrotaA(int derrotaA) {
        this.derrotaA++;
    }

    public void setEmpateA(int empateA) {
        this.empateA++;
    }

    public void setVitoriaB(int vitoriaB) {
        this.vitoriaB++;
    }

    public void setDerrotaB(int derrotaB) {
        this.derrotaB++;
    }

    public void setEmpateB(int empateB) {
        this.empateB++;
    }

    
    

    //METODOS-----------------------------------------------------------------

    public void lutar(Lutador A, Lutador B){


        this.desafiante = A;
        this.desafiado = B;
        
        setRound(round);
        //JOptionPane.showMessageDialog(null,+getRound()+"º Round: \n","Round "+getRound(),JOptionPane.INFORMATION_MESSAGE);

        Random rand = new Random();

        int vence = rand.nextInt(3);

        /*

        if (vence == 0) {
            JOptionPane.showMessageDialog(null,"Vencedor: " +A.getNome(),"Vitória!",JOptionPane.WARNING_MESSAGE);
            setVitoriaA(vitoriaA);
            setDerrotaB(derrotaB);
        } else if(vence == 1){
            JOptionPane.showMessageDialog(null,"Vencedor: " +B.getNome(),"Vitória!",JOptionPane.WARNING_MESSAGE);
            setVitoriaB(vitoriaB);
            setDerrotaA(derrotaA);
        }else{
            JOptionPane.showMessageDialog(null,"Empate entre "+A.getNome()+" e "+B.getNome(),"Empate!",JOptionPane.WARNING_MESSAGE);
            setEmpateA(empateA); 
            setEmpateB(empateB); 
        }
        */
        

    }
    public void statusLuta(Lutador A,Lutador B){        
        this.desafiante = A;
        this.desafiado = B;
        
        /*
        JOptionPane.showMessageDialog(null,"-- Lutador: "+A.getNome()+" --\nVitórias: "+getVitoriaA()+"\nDerrotas: "+getDerrotaA()+"\nEmpates: "+getEmpateA()+"\n\n"
                + "-- Lutador: "+B.getNome()+" --\nVitórias: "+getVitoriaB()+"\nDerrotas: "+getDerrotaB()+"\nEmpates: "+getEmpateB()+"\n","Status Geral",JOptionPane.INFORMATION_MESSAGE);
        
        if(getVitoriaA() == getVitoriaB()){  
            JOptionPane.showMessageDialog(null,"O combate terminou em EMPATE TOTAL!","DRAW!",JOptionPane.WARNING_MESSAGE);
        }else if(getVitoriaA() > getVitoriaB()){
            JOptionPane.showMessageDialog(null,"O vencedor do combate é: "+A.getNome(),"WINNER!",JOptionPane.WARNING_MESSAGE);
        }else{
           JOptionPane.showMessageDialog(null,"O vencedor do combate é: "+B.getNome(),"WINNER!",JOptionPane.WARNING_MESSAGE);
        }
        */
        

    }
    public void resetTudo() {
        setRound(0);        
        setVitoriaA(0);
        setDerrotaA(0);
        setEmpateA(0);        
        setVitoriaB(0);
        setDerrotaB(0);
        setEmpateB(0);
    }


    
    
    
}
