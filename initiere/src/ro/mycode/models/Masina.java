package ro.mycode.models;

public class Masina {

    //atribute

    public String model;
    private String marca;
    private int anFabricatie;
    public String nrImatriculare;
    private int expiraITP;
    public String numePropietar;


    //todo: constructori

    public Masina(String model, String marca, int anFabricatie, String nrImatriculare,int expiraITP, String numePropietar){

        this.anFabricatie=anFabricatie;
        this.model=model;
        this.marca=marca;
        this.expiraITP=expiraITP;
        this.numePropietar=numePropietar;
        this.nrImatriculare=nrImatriculare;

    }


    public Masina(){
        System.out.println("La revedere copii");
    }

    //todo: accsorii get si set

    public int getanFabricatie(){
        return  this.anFabricatie;
    }

    public void setanFabricatie( int anFabricatie){
        if(anFabricatie>2023){
            System.out.println("Inca nu suntem in anul : "+anFabricatie);

        } else{
            this.anFabricatie=anFabricatie;
        }
    }

    public String getmarca(){
        return this.marca;
    }


    public void setmarca(String marca){
        if(marca.equals("Peugeot")){
            System.out.println("Nu comercializam :"+marca);
        }else{
            this.marca=marca;
        }
    }


    public int getexpiraITP(){
        return  this.expiraITP;
    }

    public void setexpiraITP(int expiraITP){
        if(expiraITP>2024){
            System.out.println("Nu este un an valabil");
        }else{
            this.expiraITP=expiraITP;
        }
    }

    //todo: metoda ce returneaza un string

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
