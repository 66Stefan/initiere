package ro.mycode.models;

public class Masina {

    //atribute

    public String model;
    public String marca;
    public int anFabricatie;
    public String nrImatriculare;
    public int expiraITP;
    public String numePropietar;


    //metoda ce returneaza un string

    public String afisare() {

        String text = "";
        text += "Modelul :" + this.model + "\n";
        text += "Marca :" + this.marca + "\n";
        text += "An de fabricatie :" + this.anFabricatie + "\n";
        text += "Numarul de imatriculare :" + this.nrImatriculare + "\n";
        text += "Cand expira ITP-ul :" + this.expiraITP + "\n";
        text += "Propietar :" + this.numePropietar + "\n";
        return text;


    }


}
