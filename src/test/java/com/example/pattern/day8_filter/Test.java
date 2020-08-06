package com.example.pattern.day8_filter;

import com.example.pattern.day8_filter.impl.MaleFilter;
import com.example.pattern.day8_filter.impl.SingleFilter;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Filter male = new MaleFilter();
        System.out.println("Males:-------");
        printPersons(male.filter(persons));

        Filter single = new SingleFilter();
        System.out.println("Single:------");
        printPersons(single.filter(persons));

    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Sex : " + person.getSex()
                    +", Marry Status : " + person.getMarryStatus()
                    +" ]");
        }
    }
}
