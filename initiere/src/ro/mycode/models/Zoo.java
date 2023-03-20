package ro.mycode.models;

public class Zoo {

    //declarare atribute

    private String numeAnimal;
    private String ceMananca;
    private String stareaDeSanatate;
    private int nrCusca;
    private int varsta;

    //todo: accesorii get si set

    public String getNumeAnimal(){
        return this.numeAnimal;
    }

    public void setNumeAnimal(String numeAnimal){
        if(numeAnimal.equals("Casa")){
            System.out.println(numeAnimal+" nu este animal");

        }else{
            this.numeAnimal=numeAnimal;
        }

    }

    public String getCeMananca(){
        return this.ceMananca;
    }

    public void setCeMananca(String ceMananca) {
        if (ceMananca.equals("Apa")) {
            System.out.println(ceMananca + " nu este mancare");
            this.ceMananca = "0";
        } else {
            this.ceMananca = ceMananca;
        }
    }
    public int getNrCusca(){
            return this.nrCusca;
        }

    public void setNrCusca(int nrCusca){
        if(nrCusca>255){
            System.out.println("GradinaZoo are maxim 255 de custi");
        }else{
            this.nrCusca=nrCusca;
        }
    }

    public  String getStareaDeSanatate(){
        return this.stareaDeSanatate;
    }

    public void setStareaDeSanatate(String  stareaDeSanatate){
        if(stareaDeSanatate.equals("Bolnav")){
            System.out.println("Trebuie chemat repede medicul");
        } else{
            this.stareaDeSanatate=stareaDeSanatate;
        }
    }

    public  int getvarsta(){
        return  this.varsta;
    }

    public void setvarsta(int varsta){
        if(varsta==0){
            System.out.println("Animalul nu are voie sa aiba varzta 0");
        }else{
            this.varsta=varsta;
        }
    }

        //todo: constructori

    public Zoo(){
        System.out.println("Salutare");
    }
    public Zoo(String numeAnimal, String ceMananca, String stareaDeSanatate, int nrCusca, int varsta){


        this.nrCusca=nrCusca;
        this.ceMananca=ceMananca;
        this.varsta=varsta;
        this.numeAnimal=numeAnimal;
        this.stareaDeSanatate=stareaDeSanatate;

    }


    public String afisareZoo(){

        String text="";

        text+="Specie :"+this.numeAnimal+"\n";
        text+="Ce mancare consuma "+this.numeAnimal+"-ul :"+this.ceMananca+"\n";
        text+="Stare de sanatate animal :"+this.stareaDeSanatate+"\n";
        text+="In ce cusca il gasim :"+this.nrCusca+"\n";
        text+="Cati ani are :"+this.varsta+"\n";


        return text;

    }

    //afisare
}


