package com.digital.utils;

import com.github.javafaker.Faker;
import org.example.models.Student;

import java.security.PublicKey;

public class FakeDataProvider {
    static Faker faker = new Faker();

    public String generateFakeFullName() {
        return faker.name().fullName();
    }

    public String generateFirstName(){
        return faker.name().firstName();
    }
    public String generateFakeLastName() {
        return faker.name().lastName();
    }

    public String generateFakeEmail() {
        return faker.internet().emailAddress();
    }

    public String generationPhoneNUmber() {
        return faker.number().digits(10);
    }

    public String generationFakeCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String generationFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }

    public Student createFakeStudent(){
        Student student = new Student();
        student.setFirstName(generateFirstName());
        student.setLastName(generateFakeLastName());
        student.setEmail(generateFakeEmail());
        student.setPhoneNumber(generationPhoneNUmber());
        student.setCurrentAddress(generationFakeCurrentAddress());

        return createFakeStudent();
    }

}