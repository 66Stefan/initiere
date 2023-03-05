package ro.mycode.models;

public class Zoo {

    //declarare atribute

    public String numeAnimal;
    public String ceMananca;
    public String stareaDeSanatate;
    public int nrCusca;
    public int varsta;


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
