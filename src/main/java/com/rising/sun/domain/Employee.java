package com.rising.sun.domain;

public class Employee {

    private int id;
    private String userName;
    private String passWord;
    private int age;

    public Employee() {
    }

    public Employee(String userName, String passWord, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
    }

    public Employee(int id, String userName, String passWord, int age) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
