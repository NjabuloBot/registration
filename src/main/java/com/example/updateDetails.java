package com.example;
import java.util.Scanner;

public class updateDetails {

    static Scanner input = new Scanner(System.in);
    static personalInfomation perInfo = new personalInfomation();

    static void name(){
        System.out.print("Name: ");
        String name = input.nextLine();
        perInfo.setName(name);

    }

    static void surname(){
        System.out.print("Surname: ");
        String surname = input.nextLine();
        perInfo.setSurname(surname);

    }

    static void age(){
        System.out.print("age: ");
        int age = input.nextInt();
        perInfo.setAge(age);

    }

    static void race(){
        System.out.print("Race: ");
        String race = input.nextLine();
        perInfo.setRace(race);

    }

    static void displayDetails(){
        System.out.println("Name: "+perInfo.getName()+
        " Surname: "+perInfo.getSurName()+
        " Race: "+perInfo.getRace()+
        " Age: "+perInfo.getAge());
    }
    
}
