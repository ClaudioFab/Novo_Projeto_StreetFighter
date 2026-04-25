
package new_projeto_streetfighter;

public class Main_StreetFighter {

    public static void main(String[] args) {
        
        Lutador p1 = new Lutador("Ryu","Japão",30,1.69,82,null,0,0,0);
        Lutador p2 = new Lutador("Ken","USA",32,1.79,85,null,0,0,0);
        
        p2.apresentar();
        
        p2.setNacionalidade("Estados Unidos");
        
        p2.apresentar();
        
        
        
        
        
        

    }
    
}
