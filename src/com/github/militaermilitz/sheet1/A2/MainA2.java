package com.github.militaermilitz.sheet1.A2;

import com.github.militaermilitz.sheet1.A1.Person;

import java.util.HashMap;
import java.util.Map;

public class MainA2 {

    public static void main(String[] args) {
        final Person p1 = new Person("Kai", "Ley", 23);
        final Person p2 = new Person("Jonte", "Zehring", 56);
        final Person p3 = new Person("Alex", "Sturm", 20);
        final Person p4 = new Person("Ron", "Tanner", 21);

        final Map<String, Person> personMap = new HashMap<>();
        personMap.put(p1.toString(), p1);
        personMap.put(p2.toString(), p2);
        personMap.put(p3.toString(), p3);
        personMap.put(p4.toString(), p4);

        for (Person person : personMap.values()){
            System.out.println(person);
        }

        /*
        b)
        Die HashMap hat eine Zugriffszeit von O(1) durch das Schlüssel Schloss Prinzip und das Durchsuchen der Liste
        läuft in O(n) (n ist Anzahl der Elemente)
         */

        //c)
        personMap.values().forEach(System.out::println);
        personMap.forEach((s, person) -> System.out.println(person));
    }
}
