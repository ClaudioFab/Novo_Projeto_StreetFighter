
package new_projeto_streetfighter;

import javax.swing.JOptionPane;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    private int vida;
    private String golpe;

    //Construtor--------------------------------------------------------------
    public Lutador(String nome00, String nacionalidade00, int idade00, double altura00, double peso00, String categoria00, int vitoria00, int derrota00, int empate00,int vida00,String golpe00) {
        this.nome = nome00;
        this.nacionalidade = nacionalidade00;
        this.idade = idade00;
        this.altura = altura00;
        this.peso = peso00;
        setCategoria(categoria00);
        this.vitoria = vitoria00;
        this.derrota = derrota00;
        this.empate = empate00;
        this.vida = vida00;
        this.golpe = golpe00;
    }

    //GETTER------------------------------------------------------------------
    
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public int getEmpate() {
        return empate;
    }
    
    public int getVida() {
        return vida;
    }
    
    public String getGolpe() {
        return golpe;
    }
    
    //SETTER------------------------------------------------------------------

    public void setNome(String nome00) {
        this.nome = nome00;
    }

    public void setNacionalidade(String nacionalidade00) {
        this.nacionalidade = nacionalidade00;
    }

    public void setIdade(int idade00) {
        this.idade = idade00;
    }

    public void setAltura(double altura00) {
        this.altura = altura00;
    }

    public void setPeso(double peso00) {
        this.peso = peso00;
    }

    public void setCategoria(String categoria00) {
        if(peso < 52){
            this.categoria="Inválido";
        }else if(peso>=52 && peso<=70){
            this.categoria="Leve";
        }else if(peso>=71 && peso<=83){
            this.categoria="Médio";
        }else if(peso>=84 && peso<=110){
            this.categoria="Pesado";
        }else{
            this.categoria="Inválido";
        }
    }

    public void setVitoria(int vitoria00) {
        this.vitoria++;
    }

    public void setDerrota(int derrota00) {
        this.derrota++;
    }

    public void setEmpate(int empate00) {
        this.empate++;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setGolpe(String golpe) {
        this.golpe = golpe;
    }
    
    //METODOS-----------------------------------------------------------------

    public void apresentar(){        
        JOptionPane.showMessageDialog(null,"-- Nome: "+nome+" --\nNacionalidade: "+nacionalidade+"\nIdade: "+idade+"\nAltura: "+altura+"\nPeso: "+peso+"\nCategoria: "+categoria+"\n","Player "+nome,JOptionPane.INFORMATION_MESSAGE);        
    }
    
    public void status(Lutador A,Lutador B){        
        Luta stat = new Luta();
        stat.getDesafiante();
        stat.getDesafiado();
        
        JOptionPane.showMessageDialog(null,"-- Lutador: "+A.getNome()+" --\nVitórias: "+A.getVitoria()+"\nDerrotas: "+A.getDerrota()+"\nEmpates: "+A.getEmpate()+"\n\n"
                + "-- Lutador: "+B.getNome()+" --\nVitórias: "+B.getVitoria()+"\nDerrotas: "+B.getDerrota()+"\nEmpates: "+B.getEmpate()+"\n","Status Geral",JOptionPane.INFORMATION_MESSAGE);
        
        if(A.getVitoria() == B.getVitoria()){
            //empate   
            JOptionPane.showMessageDialog(null,"O combate terminou em EMPATE TOTAL!","DRAW!",JOptionPane.WARNING_MESSAGE);
        }else if(A.getVitoria() > B.getVitoria()){
            JOptionPane.showMessageDialog(null,"O vencedor do combate é: "+A.getNome(),"WINNER!",JOptionPane.WARNING_MESSAGE);
        }else{
           JOptionPane.showMessageDialog(null,"O vencedor do combate é: "+B.getNome(),"WINNER!",JOptionPane.WARNING_MESSAGE);
        }

    }

    public void venceu(){
        setVitoria(getVitoria()+1);
    }
    
    public void perdeu(){
        setDerrota(getDerrota()+1);
    }
    
    public void empatou(){
        setEmpate(getEmpate()+1);
    }
    
}
