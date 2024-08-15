package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name required");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Surname required");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;

    }

    public Person build() {
        Person person;
        if (name == null || surname == null) {
            throw new IllegalArgumentException("First and last name are required");
        }
        if (age < 0) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
            person.setAddress(city);
        }
        return person;
    }
}