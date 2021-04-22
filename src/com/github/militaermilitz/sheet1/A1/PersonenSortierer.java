package com.github.militaermilitz.sheet1.A1;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class PersonenSortierer implements Comparator<Person> {

    @Override
    public int compare(@NotNull Person person1, @NotNull Person person2) {
        final int nameInt = person1.name.compareTo(person2.name);
        if (nameInt != 0) return nameInt;

        final int lastNameInt = person1.lastName.compareTo(person2.lastName);
        if (lastNameInt != 0) return lastNameInt;

        return person1.age - person2.age;
    }
}
