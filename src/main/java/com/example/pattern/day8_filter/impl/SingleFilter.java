package com.example.pattern.day8_filter.impl;

import com.example.pattern.day8_filter.Filter;
import com.example.pattern.day8_filter.Person;

import java.util.ArrayList;
import java.util.List;

public class SingleFilter implements Filter {
    @Override
    public List<Person> filter(List<Person> list) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : list) {
            if(person.getMarryStatus().equalsIgnoreCase("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
