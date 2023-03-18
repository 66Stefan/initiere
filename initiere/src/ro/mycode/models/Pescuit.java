package ro.mycode.models;

public class Pescuit {

    //declarare atribute
    public String denechipament;
    private int pret;
    private int cantitate;

    private String folositPentru;

    //afisare

    //todo: creare constructor

    public Pescuit(String denechipament, int pret, int cantitate, String folositPentru){

        this.pret=pret;
        this.cantitate=cantitate;
        this.folositPentru=folositPentru;
        this.denechipament=denechipament;

    }

    public Pescuit(){

        System.out.println("Buna ziua");
    }

    //todo:accesorii get si set
        public int getPret(){

        return  this.pret;
        }

        public void setPret(int pret){
        if(pret==0){
            System.out.println("Pretul nu poate sa fie 0");
        } else{
            this.pret=pret;
        }
        }

        public String getFolositPentru(){
            return this.folositPentru;
        }

        public void getFolositpentru(String folositPentru){
        if(folositPentru.equals("Masina")){
            System.out.println("Nu este o scula de pescuit");
        } else{
            this.folositPentru=folositPentru;
        }
        }


        public int getCantitate(){
        return this.cantitate;
        }

        public  void getCantitatea(int cantitatea){
        if(cantitatea>100){
            System.out.println("Cantitatea nu poate fi mai mare d e100");
        }else {
            this.cantitate=cantitate;
        }
        }
    public String afisarePescuit(){

        String text="";

        text+="Denumire echipament :"+this.denechipament+"\n";
        text+="Pretul :"+this.pret+"\n";
        text+="cantitate necesara :"+this.cantitate+"\n";
        text+="Utilizare :"+this.folositPentru+"\n";
        return text;
    }
}
