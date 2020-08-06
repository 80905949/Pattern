package com.example.pattern.day8_filter.impl;

import com.example.pattern.day8_filter.Filter;
import com.example.pattern.day8_filter.Person;

import java.util.ArrayList;
import java.util.List;

public class MaleFilter implements Filter {
    @Override
    public List<Person> filter(List<Person> list) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : list) {
            if(person.getSex().equalsIgnoreCase("male")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
