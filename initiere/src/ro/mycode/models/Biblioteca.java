package ro.mycode.models;

public class Biblioteca {

    //declar atributele
    private String denumireCarte;
    private String numeAutor;
    private int nrPagini;
    private Boolean disponibilitate;
    private int pretDeAchizitie;

    //todo: constructori

    public Biblioteca(String denumireCarte, String numeAutor, int nrPagini, Boolean disponibilitate, int pretDeAchizitie){
        this.nrPagini=nrPagini;
        this.pretDeAchizitie=pretDeAchizitie;
        this.disponibilitate=disponibilitate;
        this.numeAutor=numeAutor;
        this.denumireCarte=denumireCarte;
    }

    public Biblioteca(){
        
    }

    //todo: accesorii get si set



    public  String getDenumireCarte(){
        return  this.denumireCarte;
    }

    public void setDenumireCarte( String denumireCarte ){
        if (denumireCarte.equals("Ion")){
            System.out.println("Un roman foarte interesant");
        }else {
            this.denumireCarte=denumireCarte;
        }
    }

    public String getNumeAutor(){
        return  this.numeAutor;
    }

    public void setNumeAutor(String numeAutor){
        if (numeAutor.equals(numeAutor)){
            System.out.println("Autorul este decedat");
        }else {
            this.numeAutor=numeAutor;
        }
    }

    public int getNrPagini(){
        return  this.nrPagini;
    }

    public  void  setNrPagini(int nrPagini){
        if(nrPagini>300){
            System.out.println("Greu de citit");
        }else {
            this.nrPagini=nrPagini;
        }
    }

    public  Boolean getDisponibilitate(){
        return  this.disponibilitate;
    }

    public void setDisponibilitate(Boolean disponibilitate){
        if(disponibilitate==true){
            System.out.println("Nu mai este disponibila");
        }else {
            this.disponibilitate=disponibilitate;
        }
    }

    public  int getPretDeAchizitie(){
        return  this.pretDeAchizitie;
    }

    public  void  setPretDeAchizitie(int pretDeAchizitie){
        if(pretDeAchizitie<120){
            System.out.println("O carte accesibila");
        }else {
            this.pretDeAchizitie=pretDeAchizitie;
        }
    }


    //todo: metoda ce afiseaza un string
    public String afisareBiblioteca(){
        String text="";
        text+="Titlul cartii :"+this.denumireCarte+"\n";
        text+="Autor :"+this.numeAutor+"\n";
        text+="Numarul de pagini :"+this.nrPagini+"\n";
        text+="Se poate imprumuta :"+this.disponibilitate+"\n";
        text+="Pret de achizitie :"+this.pretDeAchizitie+"\n";

        return text;

    }
}
