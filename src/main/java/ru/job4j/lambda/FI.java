package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FI {
    private String name;
    private String surname;

    public FI(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "{" +
                "name = '" + name
                + "', surname = '" + surname
                + "'}";

    }

    static Comparator<FI> comparatorDescSize =
            Comparator.comparingInt((FI o) -> o.getName().length()).reversed();


    public static void main(String[] args) {
        List<FI> people = new ArrayList<>();

        people.add(new FI("Petr", "Golovin"));
        people.add(new FI("David", "Vardanyan"));

        people.sort(comparatorDescSize);
        people.forEach(System.out::println);
    }
}

