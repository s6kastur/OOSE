package com.github.militaermilitz.sheet1.A1;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
    final String name, lastName;
    final int age;

    public Person(@NotNull String name, @NotNull String lastName, int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public int compareTo(@NotNull Person person) {
        final int lastNameInt = this.lastName.compareTo(person.lastName);
        if (lastNameInt != 0) return lastNameInt;

        final int nameInt = this.name.compareTo(person.name);
        if (nameInt != 0) return nameInt;

        return this.age - person.age;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " (" + age + ")";
    }
}