package ro.mycode.models;

public class Familie {
    //atribute

    private String nume;
    public String prenume;
    private String rolInFamilie;
    private int varsata;
    private String sex;


    //todo: constructori

    public Familie(String nume, String prenume, String rolInFamilie, int varsata,String sex){
        this.rolInFamilie=rolInFamilie;
        this.nume=nume;
        this.varsata=varsata;
        this.sex=sex;
        this.prenume=prenume;
    }

    public Familie(){

        System.out.println("Cea mai tare familie");
    }

    //todo: accesorii get si set

    public  String getNume(){
        return  this.nume;

    }

    public void setNume(String  nume){
        if(nume.equals("Vadim")){
            System.out.println("Alege alt nume");
        }else{
            this.nume=nume;
        }
    }

    public  String getPrenume(){
        return  this.prenume;

    }

    public void setPrenume(String  prenume){
        if(prenume.equals("Vadim")){
            System.out.println("Prenumele nu suna bine");
        }else{
            this.prenume=prenume;
        }
    }

    public  String getRolInFamilie(){
        return  this.rolInFamilie;

    }

    public void setRolInFamilie(String  rolInFamilie){
        if(rolInFamilie.equals("Tata")){
            System.out.println("Tata este cel mai tare");
        }else{
            this.rolInFamilie=rolInFamilie;
        }
    }

    public int getVarsata(){
        return  this.varsata;
    }

    public void setVarsata( int varsata){
        if(varsata<18){
            System.out.println("Persoana este minora");
        }else {
            this.varsata=varsata;
        }
    }


    public String getSex(){
        return  this.sex;
    }

    public void setSex(String sex){
        if(sex.equals("F")){
            System.out.println("Primeste flori de  8 Martie");
        }else {
            this.sex=sex;
        }
    }



    //todo: afisare
    public String afisareFamilie(){

        String text="";
        text+="Numele de familie :"+this.nume+"\n";
        text+="Prenumele :"+this.prenume+"\n";
        text+="Ce fel de membru este in familie :"+this.rolInFamilie+"\n";
        text+="varsta :"+this.varsata+"\n";
        text+="Sexul :"+this.sex+"\n";

        return text;
    }

}
