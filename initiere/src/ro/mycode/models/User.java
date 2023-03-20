package ro.mycode.models;

public class User {

    //atribute

    private String name;
    private int age;
    private String userName;
    private String password;
    private int id;
    private double phoneNumber;
    private String city;



    //todo: accesorii get and set

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        if(name.equals("Stefan")){
            System.out.println("Numele este deja rezervat!");
            this.name="undefine";
        }else{
            this.name=name;
        }
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userName){
        if(userName.equals("Popescu")){
            System.out.println("Nume rezervat!");
            this.userName="Alege alt nume";
        }
    }

    public int setAge(){
        return  this.age;
    }

    public void getAge(int age){
        if(age<18){
            System.out.println("Trebuie sa ai 18 ani!");
            this.age=0;
        }else{
            this.age=age;
        }
    }


    public String setPassword(){
        return  this.password;
    }

    public void getPassword(String password){
        if(password.equals("asasas")){
            System.out.println("Parola nu este valabila");
            this.password="BYdefault";
        }else{
            this.password=password;
        }
    }

    public int setId(){
        return this.id;
    }

    public void getId(int id) {
        if (id < 1) {
            System.out.println("ID=ul trebuie sa fie mai mare ca 0");

        } else {
            this.id = id;
        }
    }

    public double setPhoneNumber(){
        return this.phoneNumber;
    }

    public void getPhoneNumber(double phoneNumber){
        if(phoneNumber==0745){
            System.out.println("Numarul este alocat");
            this.phoneNumber=0;
        }else{
            this.phoneNumber=phoneNumber;
        }

    }


    public String setCity(){
        return  this.city;
    }

    public void getCity(String ciyi){
        if(ciyi.equals("Alba")){
            System.out.println("Orasul este alocat");
            this.city="0";
        }else{
            this.city=ciyi;
        }
    }



    //todo: constructorii
    public User(String name, int age,String userName, String password, int id, double phoneNumber, String city){

        this.city=city;
        this.name=name;
        this.userName=userName;
        this.id=id;
        this.age=age;
        this.password=password;
        this.phoneNumber=phoneNumber;
    }

    public User(){
        System.out.println("salut");
    }

    //metode


    //metoda ce returneaza un string
    public String descriere() {
        String text = "";
        text += "Name :" + this.name + "\n";
        text += "Age :" + this.age + "\n";
        text += "UserName :" + this.userName + "\n";
        text += "Password :" + this.password + "\n";
        text += "Id :" + this.id + "\n";
        text += "PhoneNumber :" + this.phoneNumber + "\n";
        text += "City :" + this.city + "\n";
        return text;
    }
}
