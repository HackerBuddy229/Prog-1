package com.TE18C;

public class Main {

    public static void main(String[] args) {
	// write your code here
    

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
