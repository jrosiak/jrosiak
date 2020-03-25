package TUT_4;

import java.util.Scanner;

public class User {

    Scanner input=new Scanner(System.in);
    private String name, surname, email, password, typeOfAccount;

    public User (String email){
        this.email=email;
        this.password=null;
        this.name=null;
        this.surname=null;
        this.typeOfAccount="Guest";
    }

    public User (String name,String surname,String email,String password){
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.typeOfAccount="registeredUser";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public void isRegistered(){
        if(typeOfAccount=="Guest"){
            System.out.println("User with email" + email + " is a guest");
        }else{
            System.out.println("User with email " + email +  " is registered");
        }
    }

    void upgradeAccount(){
        if(typeOfAccount=="Guest"){
            this.password="123456";
            this.name="Queueueueue";
            this.surname="lkjhgf";
            this.typeOfAccount="registeredUser";
        }else{
            System.out.println("You are already registered");
        }
    }

}
