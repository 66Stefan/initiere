package ro.mycode.models;

public class NecesarSport {
    //declarare atribute

    private String denEchipament;
    private String marimea;
    private String material;
    private Boolean esential;
    private String culoare;

    //todo: creare constructori

    public NecesarSport(String denEchipament, String marimea, String material, Boolean esential,String culoare){
        this.material=material;
        this.culoare=culoare;
        this.marimea=marimea;
        this.esential=esential;
        this.denEchipament=denEchipament;


    }

    public NecesarSport(){
        System.out.println("La revedere");
    }

    //todo: accesorii get si set

    public String getDenEchipament(){
        return  this.denEchipament;
    }

    public void getDemEchipament(String denEchipament){
        if(denEchipament.equals("Cutit")){
            System.out.println("cutitul este interzis!");
        }else{
            this.denEchipament=denEchipament;
        }
    }

    public String setMaterial(){
        return  this.material=material;
    }

    public void getMaterial(String material){
        if (material.equals("Carton")){
            System.out.println("Cartonul nu este un material bun");
        }else {
            this.material=material;
        }
    }

    public String getCuloare(){
        return  this.culoare;
    }

    public void setCuloare(String culoare){

        if(culoare.equals("Alb")){
            System.out.println("Albe nu este culoare");
        } else {
            this.culoare=culoare;
        }
    }

    public  String getMarimea(){
        return  this.marimea;
    }

    public  void  setMarimea(String marimea){
        if(marimea.equals("XS")){
            System.out.println("Aceasta marime nu mai exista");
        }else {
            this.marimea=marimea;
        }
    }

    public  Boolean getEsential(){
        return  this.esential;
    }

    public void setEsential(Boolean esential){
        if(esential==false){
            System.out.println("Specificati de ce nu este esential");
        }else{
            this.esential=esential;
        }
    }
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
