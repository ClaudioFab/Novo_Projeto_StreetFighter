
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

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, String categoria, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
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
    
    //SETTER------------------------------------------------------------------

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCategoria(String categoria) {
        /*
        Regras da Categoria
        Peso menor que 52kg = “Invalido”
        Peso menor ou igual a 70 kg = “Leve”
        Peso menor ou igual a 83 kg = “Médio”
        Peso menor ou igual a 110 kg = “Pesado”
        Se nenhuma das opções = “Invalido”
        Para facilitar, pode alterar esses parâmetros (regras de exceções) diretamente no setCategoria()
        */
        this.categoria = categoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    //METODOS-----------------------------------------------------------------

    public void apresentar(){        
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nNacionalidade: "+nacionalidade+"\nIdade: "+idade+"\nAltura: "+altura+"\nPeso: "+peso+"\nCategoria: "+categoria+"\nVitórias: "+vitoria+"\nDerrotas: "+derrota+"\nEmpates: "+empate);        
    }
    
    public void status(){
        // Deve demostrar as informações de vitorias,derrotas e empates do lutador.
        
    }

    public void venceu(){
        // Deve computar/calcular sempre a pontuação de cada lutador.
        //Exemplo: setVitorias(getVitorias() + 1);
    }
    
    public void perdeu(){
        // Deve computar/calcular sempre a pontuação de cada lutador.
        //Exemplo: setDerrota(getDerrota() + 1);
    }
    
    public void empatou(){
        // Deve computar/calcular sempre a pontuação de cada lutador.
        //Exemplo: setEmpate(getEmpate() + 1);
    }
    
}
