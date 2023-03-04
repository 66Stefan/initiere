package ro.mycode.models;

public class Biblioteca {

    //declar atributele
    public String denumireCarte;
    public String numeAutor;
    public int nrPagini;
    public Boolean disponibilitate;
    public int pretDeAchizitie;

    //metoda ce afiseaza un string

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
