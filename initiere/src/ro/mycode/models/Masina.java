package ro.mycode.models;

public class Masina {

    //atribute

    private String model;
    private String marca;
    private int anFabricatie;
    private String nrImatriculare;
    private int expiraITP;
    private String numePropietar;


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

    public  String getModel(){
        return this.model;
    }

    public void setModel(String model){
        if(model.equals("Audi")){
            System.out.println("Trebuie rechemat in service");
        }else{
            this.model=model;
        }
    }

    public  String getNrImatriculare(){
        return  this.nrImatriculare;
    }

    public void setNrImatriculare(String nrImatriculare){
        if(nrImatriculare.equals("2325")){
            System.out.println("Nr este rezervat");
        }else{
            this.nrImatriculare=nrImatriculare;
        }
    }


    public  String getNumePropietar(){
        return  this.numePropietar;
    }

    public void setNumePropietar(String  numePropietar){
    if(numePropietar.equals("Alin")) {
        System.out.println("Mai are de platit restante");
    }else{
        this.numePropietar=numePropietar;
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
