package com.example.pattern.day8_filter;

public class Person {
    private String name;
    private String sex;
    private String marryStatus;

    public Person(String name, String sex, String marryStatus) {
        this.name = name;
        this.sex = sex;
        this.marryStatus = marryStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMarryStatus() {
        return marryStatus;
    }

    public void setMarryStatus(String marryStatus) {
        this.marryStatus = marryStatus;
    }
}
