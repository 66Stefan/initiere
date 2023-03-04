package ro.mycode.models;

public class User {

    //atribute

    public String name;
    public int age;
    public String userName;
    public String password;
    public int id;
    public double phoneNumber;
    public String city;
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
