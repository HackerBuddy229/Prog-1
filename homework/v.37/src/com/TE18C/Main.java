package com.TE18C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
Main myMainClass = new Main();
    Human human = myMainClass.getInput();
    human.present();

    }


    String name;
    int age;
    String adress;
    int postalCode;
    String city;
    int phoneNumber;
    public Human getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Name?");
        name = input.nextLine();
        System.out.println("Age?");
        age = Integer.parseInt(input.nextLine());
        System.out.println("adress?");
        adress = input.nextLine();
        System.out.println("postal code: 000000?");
        postalCode = Integer.parseInt(input.nextLine());
        System.out.println("City?");
        city = input.nextLine();
        System.out.println("Phone Number?");
        phoneNumber = Integer.parseInt(input.nextLine());

        return new Human(name, age, adress, postalCode, city, phoneNumber);
    }



}


class Human {
    final private String name;
    final private int age;
    final private String adress;
    final private int postalCode;
    final private String city;
    final private int phoneNumber;

    public Human(String name, int age, String adress, int postalCode, String city, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void present() {
        System.out.println("Information");
        System.out.println("Namn:   " + getName());
        System.out.println("Ålder:  " + getAge() + "år");
        System.out.println("Adress: " + getAdress());
        System.out.println(getFormattedPostalCode() + " " + getCity());
        System.out.println("Telefon: " + getPhoneNumber());
    }

    public String getFormattedPostalCode(){
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getPostalCode());
        sb2.substring(2);
        StringBuilder sb = new StringBuilder();
        sb.append(getPostalCode());
        sb.substring(0, 3);
        sb.append(" ");
        sb.append(sb2.toString());
        return sb.toString();

    }
}
