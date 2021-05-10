package entities.concretes;

import entities.abstracts.Entity;

public class Customer implements Entity {
    int id;
    String userName;
    String name;
    String surname;
    int yearOfBirth;
    String nationalityId;

    public Customer(){

    }

    public Customer(int id, String userName, String name, String surname, int yearOfBirth, String nationalityId) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

}
