package com.example;

public class personalInfomation {
    private String name;
    private String surname;
    private int age;
    private String race;

    void setName(String name){
        this.name = name;
    }
    
    void setSurname(String surname){
        this.surname = surname;
    }

    void setAge(int age){
        this.age = age;
    }

    void setRace(String race){
        this.race = race;
    }

    public String getName(){
        return this.name;
    }

    public String getSurName(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }

    public String getRace(){
        return this.race;
    }
}
