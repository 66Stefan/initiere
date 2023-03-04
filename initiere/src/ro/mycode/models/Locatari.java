package ro.mycode.models;

public class Locatari {
    //atribuire
    public String  nume;
    public String prenume;
    public int nrApartament;
    public int nrPersoaneCareLocuiescInApartament;
    public Boolean restantaRegie;

    //metoda ce returneaza un string

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
