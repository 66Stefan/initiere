package ro.mycode.models;

public class Karate {

    //declarat atribute

    private String numeSportiv;
    private String sexul;
    private String culoareCentura;
    private int nrMedalii;
    private String denumireClub;

    //todo: constructori

    public Karate(String numeSportiv, String sexul, String culoareCentura, int nrMedalii, String denumireClub){

        this.nrMedalii=nrMedalii;
        this.sexul=sexul;
        this.denumireClub=denumireClub;
        this.numeSportiv=numeSportiv;
        this.culoareCentura=culoareCentura;
    }

    public  Karate(){
        System.out.println("Ce mai faci?");
    }

    //todo: accesorii get si set
    public  String getNumeSportiv(){
        return  this.numeSportiv;
    }

    public  void  setNumeSportiv(String numeSportiv) {
        if (numeSportiv.equals("Cosmin")) {
            System.out.println("Trebuie facut testa antidoping");
        } else {
            this.numeSportiv=numeSportiv;
        }
    }

    public String getSexul(){
        return  this.sexul;
    }

    public  void  setSexul(String sexul){
        if(sexul.equals("M")){
            System.out.println("Trebuie sa primeasca o busola");
        }else {
            this.sexul=sexul;
        }
    }

    public  String getCuloareCentura(){
        return  this.culoareCentura;
    }

    public  void setCuloareCentura(String culoareCentura){
        if(culoareCentura.equals("Alba")){
            System.out.println("Nu poate participa la concurs");
        }else {
            this.culoareCentura=culoareCentura;
        }
    }

    public  int getNrMedalii(){
        return  this.nrMedalii;
    }

    public  void  setNrMedalii(int nrMedalii) {
        if (nrMedalii > 4) {
            System.out.println("Primesc 200$ bonus");
        } else {
            this.nrMedalii = nrMedalii;
        }
    }

     public String getdenumireClub(){
            return this.denumireClub;
        }

     public  void  setDenumireClub(String denumireClub){
        if(denumireClub.equals("Puma")){
            System.out.println("Cel mai tare club");
        }else {
            this.denumireClub=denumireClub;
        }
     }


    //afisare


    public String afisareKarate(){
        String text="";

        text+="Nume Karatist :"+this.numeSportiv+"\n";
        text+="Sexul :"+this.sexul+"\n";
        text+="Grad centura :"+this.culoareCentura+"\n";
        text+="Cate medalii are :"+this.nrMedalii+"\n";
        text+="Clubul pe care il reprezinta :"+this.denumireClub+"\n";

        return text;
    }
}
