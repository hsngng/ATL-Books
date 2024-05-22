package com.company.lesson1;

public class User01 implements Comparator{

    private String name;
    private int age;
    private long id;

    public void User(long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User01(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
