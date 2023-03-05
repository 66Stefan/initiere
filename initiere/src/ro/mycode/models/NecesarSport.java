package ro.mycode.models;

public class NecesarSport {
    //declarare atribute

    public String denEchipament;
    public String marimea;
    public String material;
    public Boolean esential;
    public String culoare;


    //afisare

    public String afisareNecesar(){

        String text="";

        text+="Denumire echipament :"+this.denEchipament+"\n";
        text+="Marime:"+this.marimea+"\n";
        text+="Material :"+this.material+"\n";
        text+="Este indisponibil pentru sportiv :"+this.esential+"\n";
        text+="Culoare :"+this.culoare+"\n";

        return text;

    }
}
