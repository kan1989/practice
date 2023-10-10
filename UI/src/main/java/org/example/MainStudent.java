package org.example;

import org.example.models.Student;

public class MainStudent {
    public static void main(String[] args) {

        Student john = new Student("John","Doe","john@gmail.com","+213232","Bishkek");
        System.out.println(john.getLastName());

    }
}
