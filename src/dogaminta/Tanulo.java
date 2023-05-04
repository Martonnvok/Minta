
package dogaminta;


public class Tanulo {
    private String nev, targy;
    private int kor;

    public Tanulo(String nev, String targy) {
        this(nev, targy, 0);
    }

    public Tanulo(String nev, String targy, int kor) {
        this.nev = nev;
        this.targy = targy;
        this.kor = kor;
        setKor(kor);
    }

    public String getNev() {
        return nev;
    }

    public String getTargy() {
        return targy;
    }

    public int getKor() {
        return kor;
    }
    
    public void bemutatkozik(){
        System.out.println(nev+" vagyok és "+kor+" éves vagyok");
        System.out.println("Kedvenc tantárgyam: "+targy);
    }
    
    private int eletkor(){
        return (int)(Math.random()*7) + 6;
    }
    
    private void setKor(int kor) {
        if(kor < 6 || kor > 12){
            this.kor = eletkor();
        }else{
            this.kor = kor;
        }
    }
}
