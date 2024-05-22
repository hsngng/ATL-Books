package com.company.lesson1.lumu;

public class Student implements Comparable<Student>{


    private String name;
    private Integer age;
    private Long id;

    public Student(String name, Integer age, Long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (!this.id.equals(o.id)){
           return -Long.compare(this.id, o.id);
        }else {
            return this.id.compareTo(o.id);
        }
    }
}
