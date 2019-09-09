package com.TE18C;

import java.util.Scanner;

public class Main {

    public void main(String[] args) {
	// write your code here

    Human human = getInput();
    

    }
    String name;
    int age;
    String adress;
    int postalCode;
    String city;
    int phoneNumber;
    private Human getInput(){
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
}
