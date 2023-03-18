package ro.mycode.models;

public class NecesarScoala {

    //declar atributele
    public String caiet;
    private int nrBucati;
    public String intrumentDeScris;
    private int nrBucatiInstrDeScris;
    private String modelGhiozdan;

    //todo: constructori

    public NecesarScoala(String caiet,int nrBucati, String intrumentDeScris,int nrBucatiInstrDeScris, String modelGhiozdan){

        this.nrBucati=nrBucati;
        this.intrumentDeScris=intrumentDeScris;
        this.nrBucatiInstrDeScris=nrBucatiInstrDeScris;
        this.caiet=caiet;
        this.modelGhiozdan=modelGhiozdan;


    }

    public  NecesarScoala(){
        System.out.println("Salut copii");
    }


    //todo: accesorii get si set
     public String getModelGhiozdan(){
        return this.modelGhiozdan;
     }

     public void setModelGhiozdan(String modelGhiozdan){
        if(modelGhiozdan.equals("Mini")){
            System.out.println("Nu mai avem pe stoc ghizdan cu :"+modelGhiozdan);
        } else{
            this.modelGhiozdan=modelGhiozdan;
        }
     }


     public int getnrBucatiInstrDeScris(){
        return this.getnrBucatiInstrDeScris();
     }

     public void setnrBucatiInstrDeScris(int nrBucatiInstrDeScris){
        if(nrBucatiInstrDeScris==0){
            System.out.println("Nu mai avem pe stoc");
        }else{
            this.nrBucatiInstrDeScris=nrBucatiInstrDeScris;

        }
     }

     public int getnrBucati(){
        return this.nrBucati;
     }

     public void setnrBucati(int nrBucati){
        if(nrBucati>50){
            System.out.println("Nu pot sa fie mai mult de 50 bucati");
        } else{
            this.nrBucati=nrBucati;
        }
     }
    // todo: afisare

    public String afisareScoala(){

        String text="";
        text+="Denumire caiet :"+this.caiet+"\n";
        text+="Numarul de caiete necesar :"+this.nrBucati+"\n";
        text+="Cu ce scrie :"+this.intrumentDeScris+"\n";
        text+="Cate intrumente de scris avem nevoie :"+this.nrBucatiInstrDeScris+"\n";
        text+="Model de ghiozdan :"+this.modelGhiozdan+"\n";

        return text;
    }
}
