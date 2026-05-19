
package new_projeto_streetfighter;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vida;
    private String golpe;

    //Construtor--------------------------------------------------------------
    public Lutador(String nome00, String nacionalidade00, int idade00, double altura00, double peso00, String categoria00,int vida00,String golpe00) {
        this.nome = nome00;
        setNacionalidade(nacionalidade00);
        setIdade(idade00);
        setAltura(altura00);
        setPeso(peso00);
        setCategoria(categoria00);
        setVida(vida00);
        setGolpe(golpe00);
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
        switch (getNome()) {
            case "Ryu":
                this.nacionalidade = "Japão";
                break;
            case "Ken":
                this.nacionalidade = "Estados Unidos";
                break;
            case "Guile":
                this.nacionalidade = "Estados Unidos";
                break;
            case "M.Bison":
                this.nacionalidade = "Tailândia";
                break;
            case "Chun-Li":
                this.nacionalidade = "China";
                break;
            case "Cammy":
                this.nacionalidade = "Reino Unido";
                break;
            default:
                this.nacionalidade = nacionalidade00;
                throw new AssertionError();
        }
        
    }

    public void setIdade(int idade00) {
        switch (getNome()) {
            case "Ryu":
                this.idade = 35;
                break;
            case "Ken":
                this.idade = 33;
                break;
            case "Guile":
                this.idade = 43;
                break;
            case "M.Bison":
                this.idade = 55;
                break;
            case "Chun-Li":
                this.idade = 30;
                break;
            case "Cammy":
                this.idade = 27;
                break;
            default:
                this.idade = idade00;
                throw new AssertionError();
        }
        
    }

    public void setAltura(double altura00) {
        switch (getNome()) {
            case "Ryu":
                this.altura = 1.75;
                break;
            case "Ken":
                this.altura = 1.79;
                break;
            case "Guile":
                this.altura = 1.82;
                break;
            case "M.Bison":
                this.altura = 1.90;
                break;
            case "Chun-Li":
                this.altura = 1.65;
                break;
            case "Cammy":
                this.altura = 1.75;
                break;
            default:
                this.altura = altura00;
                throw new AssertionError();
        }
        
    }

    public void setPeso(double peso00) {
        switch (getNome()) {
            case "Ryu":
                this.peso = 71;
                break;
            case "Ken":
                this.peso = 75;
                break;
            case "Guile":
                this.peso = 86;
                break;
            case "M.Bison":
                this.peso = 110;
                break;
            case "Chun-Li":
                this.peso = 55;
                break;
            case "Cammy":
                this.peso = 61;
                break;
            default:
                this.peso = peso00;
                throw new AssertionError();
        }
        
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
    
    public void setVida(int vida) {
        if(getCategoria()=="Leve"){
            this.vida = 80;
        }else if(getCategoria()=="Médio"){
            this.vida = 100;
        }else if(getCategoria()=="Pesado"){
            this.vida = 120;
        }else{
            this.vida = vida;
        }
 
    }

    public void setGolpe(String golpe) {
        switch (getNome()) {
            case "Ryu":
                this.golpe = "Hadouken!";
                break;
            case "Ken":
                this.golpe = "Shoryuken!";
                break;
            case "Guile":
                this.golpe = "Sonic Boom!";
                break;
            case "M.Bison":
                this.golpe = "Psycho Power!";
                break;    
            case "Chun-Li":
                this.golpe = "Lightning Kick!";
                break;
            case "Cammy":
                this.golpe = "Spiral Arrow!";
                break;
            default:
                this.golpe = golpe;
                throw new AssertionError();
        }
        
    }

}
