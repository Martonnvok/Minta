
package dogaminta;


public class DogaMinta {

    
    public static void main(String[] args) {
       Jatekos j1 = new Jatekos("Barbár");
       System.out.println(j1.toString()+" Dobott:"+j1.dobas());
       
       Jatekos j2 = new Jatekos("Druida");
       System.out.println(j2.toString()+" Dobott:"+j1.dobas());
       
       System.out.println("Csata utáni pntok: ");
       j2.harc(j1);
       j1.harc(j2);
       System.out.println(j1.toString());
       System.out.println(j2.toString());
       
       
       //-----------------------------------------------
       
//        System.out.println("");
//        Tanulo t1 = new Tanulo("Mihály", "Matek", 15);
//        Tanulo t2 = new Tanulo("Józsi", "Biblia");
//        if (t1.getKor()>t2.getKor()) {
//             t1.bemutatkozik();
//        }else{
//            t2.bemutatkozik();
//        }
    }
    
}
