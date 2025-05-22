package com.pluralsight.streams;

import javax.lang.model.util.TypeKindVisitor14;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jacinto", "Adkins", 18));
        personList.add(new Person("Arlie", "Gregory", 23));
        personList.add(new Person("Cristina", "Sexton", 24));
        personList.add(new Person("Darlene", "Morgan", 22));
        personList.add(new Person("Benita", "Thornton", 43));
        personList.add(new Person("Noble", "Hart", 33));
        personList.add(new Person("Moises", "Mays", 26));
        personList.add(new Person("Geneva", "Barrera", 31));
        personList.add(new Person("Gabrielle", "Blackwell", 29));
        personList.add(new Person("Eugenia", "Beard", 25));

        System.out.println("Enter first name");
        String firstName = input.nextLine();
        List<Person> matchList = personList.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(firstName))
                .toList();
        double total = personList.stream()
                .map(Person::getAge)
                .reduce(0, (temp, integer2) -> temp += integer2);
        int youngest = personList.stream()
                .map(Person::getAge)
                .sorted()
                .toList()
                .get(0);
        int oldest=personList.stream()
                .map(Person::getAge)
                .sorted()
                .toList()
                .get(personList.size()-1);
        double average = total / personList.size();
        System.out.println(matchList);
        System.out.println("Youngest person: " + youngest);
        System.out.println("Oldest person: " + oldest);

        System.out.println("Average age " + average);


    }


}
