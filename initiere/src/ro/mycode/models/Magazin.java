package ro.mycode.models;

public class Magazin {
    //declarare atribute

    public String denumireProdus;
    private int nrBucati;
    private int pret;
    public String raion;
    private Boolean alarmaStoc;


    //todo: constructori

    public Magazin(String denumireProdus, int nrBucati, int pret, String raion,Boolean alarmaStoc){

        this.raion=raion;
        this.nrBucati=nrBucati;
        this.pret=pret;
        this.alarmaStoc=alarmaStoc;
        this.denumireProdus=denumireProdus;

    }

    public Magazin(){
        System.out.println("Hello word");
    }

    //todo: accesorii get si set

    public int getpret(){
        return  this.pret;
    }

    public void setpret(int pret){
        if(pret==0){
            System.out.println("Pretul nu poate sa fie 0");

        }else{
            this.pret=pret;
        }
    }

    public int getnrBucati(){
        return this.nrBucati;
    }

    public void setnrBucati(int nrBucati){
        if(nrBucati<2){
            System.out.println("Stocul este prea mic");
        }else{
            this.nrBucati=nrBucati;
        }
    }

    public Boolean getalarmaStoc(){
        return this.alarmaStoc;
    }

    public void setalarmaStoc(Boolean alarmaStoc){
        if(alarmaStoc==false){
            System.out.println("Nu poate fi false");
        }else{
            this.alarmaStoc=alarmaStoc;
        }
    }

    //todo: afisare
    public String afisareMagazin(){

        String text="'";
        text+="Denumire produs :"+this.denumireProdus+"\n";
        text+="Cantitate in stoc:"+ this.nrBucati+"\n";
        text+="Pret produs :"+this.pret+"\n";
        text+="Raionul und egasim produsul :"+this.raion+"\n";
        text+="Au mai ramas putine produse in stoc :"+this.alarmaStoc+"\n";

        return text;
    }
}
