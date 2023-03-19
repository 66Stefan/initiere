package ro.mycode.models;

public class Locatari {
    //atribuire
    private String  nume;
    private String prenume;
    private int nrApartament;
    private int nrPersoaneCareLocuiescInApartament;
    private Boolean restantaRegie;


    //todo: constructori

    public Locatari(String nume, String  prenume,int nrApartament, int nrPersoaneCareLocuiescInApartament, Boolean restantaRegie){

        this.prenume=prenume;
        this.nume=nume;
        this.restantaRegie=restantaRegie;
        this.nrApartament=nrApartament;
        this.nrPersoaneCareLocuiescInApartament=nrPersoaneCareLocuiescInApartament;


    }

    public Locatari(){

        System.out.println("La revedere");
    }


    //todo: accesorii get si set

    public int getnrApartament(){
        return this.nrApartament;
    }

    public void setnrApartament(int nrApartament){
        if(nrApartament<1){
            System.out.println("Apartamentul trebuie sa fie mai mare decat 0");
        }else{
            this.nrApartament=nrApartament;
        }
    }

    public String  getprenume(){
        return  this.prenume;
    }

    public void setprenume(String prenume){
        if(prenume.equals("Ionel")){
            System.out.println("Ionel nu mai este");
        }else{
            this.prenume=prenume;
        }
    }


    public int getnrPersoaneCareLocuiescInApartament(){
        return this.nrPersoaneCareLocuiescInApartament;
    }

    public void setnrPersoaneCareLocuiescInApartament(int nrPersoaneCareLocuiescInApartament){

        if(nrPersoaneCareLocuiescInApartament==0){
            System.out.println("Regiva va fi 0");
        }else{
            this.nrPersoaneCareLocuiescInApartament=nrPersoaneCareLocuiescInApartament;
        }
    }

    public String getNume(){
        return  this.nume;
    }

    public void setNume(String  nume){
        if(nume.equals("Daniel")){
            System.out.println("Numele nu este aloct eroare ");
        }else{
            this.nume=nume;
        }
    }


    public Boolean getRestantaRegie(){
        return  this.restantaRegie;
    }

    public  void setRestantaRegie( Boolean restantaRegie) {
        if (restantaRegie == true) {
            System.out.println("Trebuie sa iti platesti regia");
        } else {
            this.restantaRegie = restantaRegie;
        }
    }
    //todo:metoda ce returneaza un string

    public String afisareBloc(){
        String text="";
        text+="Nume de familie :"+this.nume+"\n";
        text+="Prenume :"+this.prenume+"\n";
        text+="Numarul apartamentului :"+this.nrApartament+"\n";
        text+="Cate persoane locuiesc in apartament :"+this.nrPersoaneCareLocuiescInApartament+"\n";
        text+="Are restante la regie :"+this.restantaRegie+"\n";

        return text;
    }
}
