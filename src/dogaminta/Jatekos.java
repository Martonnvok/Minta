package dogaminta;

public class Jatekos {
    private int pont;
    private String kaszt;

    public Jatekos(String kaszt) {
        this.kaszt = kaszt;
        pont = dobas();
        pont += dobas();
        pont += 2;
    }

    @Override
    public String toString() {
        return "Jatekos{" + "pont=" + pont + ", kaszt=" + kaszt + '}';
    }
    
    
    public void harc(Jatekos masik){
        masik.pont -= dobas();
    }
    
    public int dobas(){
        
        return (int) (Math.random()*6)+1;
    }
    
}
